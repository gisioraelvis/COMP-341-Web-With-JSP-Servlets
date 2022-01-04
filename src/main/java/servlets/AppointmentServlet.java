/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import Respositories.AppointmentRepository;
import Respositories.DoctorRepository;

import Respositories.UserRepository;
import entities.Doctor;

import entities.Appointment;
import entities.User;
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
    UserRepository userRepo = new UserRepository();
    DoctorRepository doctorRepo = new DoctorRepository();

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("appointments", this.repo.retriveAppointments());
        request.setAttribute("users", this.userRepo.retrieveUsers());
        request.setAttribute("doctors", this.doctorRepo.retrieveDoctors());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/appointment.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sId = request.getParameter("userId");
        String dId = request.getParameter("doctorId");
        User user = this.userRepo.retrieveUser(sId);
        Doctor doctor = this.doctorRepo.retrieveDoctor(dId);
        if (doctor != null && user != null) {
            Appointment appointments = new Appointment(
                    utils.Utils.iDGenerator(),
                    user,
                    request.getParameter("intent"),
                    request.getParameter("date"),
                    request.getParameter("time"),
                    doctor
            );
            this.repo.addAppointment(appointments);
        }

        request.setAttribute("appointments", this.repo.retriveAppointments());
        request.setAttribute("users", this.userRepo.retrieveUsers());
        request.setAttribute("doctors", this.doctorRepo.retrieveDoctors());

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
        request.setAttribute("users", this.userRepo.retrieveUsers());
        request.setAttribute("doctors", this.doctorRepo.retrieveDoctors());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/appointment.jsp");
        dispatcher.forward(request, response);
    }
}
