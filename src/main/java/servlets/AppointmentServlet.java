/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import Respositories.AppointmentRepository;
import Respositories.DoctorRepository;
import Respositories.StudentRepository;
import entities.Doctor;
import entities.Student;
import entities.Appointment;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ojay
 */
public class AppointmentServlet extends HttpServlet {
    
    AppointmentRepository repo = new AppointmentRepository();
    StudentRepository sRepo = new StudentRepository();
    DoctorRepository dRepo = new DoctorRepository();
    
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("appointments", this.repo.retriveAppointments());
        request.setAttribute("students", this.sRepo.retrieveStudents());
        request.setAttribute("doctors", this.dRepo.retrieveDoctors());
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/appointment.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sId = request.getParameter("studentId");
        String dId = request.getParameter("doctorId");
        Student student = this.sRepo.getStudentById(sId);
        Doctor doctor = this.dRepo.retrieveDoctor(dId);
        if (doctor != null && student != null) {
            Appointment appointments = new Appointment(
                    utils.Utils.iDGenerator(),
                    student,
                    request.getParameter("intent"),
                    request.getParameter("date"),
                    request.getParameter("time"),
                    doctor
            );
            this.repo.addAppointment(appointments);
        }
        
        request.setAttribute("appointments", this.repo.retriveAppointments());
        request.setAttribute("students", this.sRepo.retrieveStudents());
        request.setAttribute("doctors", this.dRepo.retrieveDoctors());
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/appointment.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doDelete(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        
        if (id != null) {
            this.repo.deleteAppointment(id);
        }
        
        request.setAttribute("appointments", this.repo.retriveAppointments());
        request.setAttribute("students", this.sRepo.retrieveStudents());
        request.setAttribute("doctors", this.dRepo.retrieveDoctors());
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/appointment.jsp");
        dispatcher.forward(request, response);
    }
}
