/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import Respositories.DoctorRepository;
import entities.Doctor;
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
public class DoctorServlet extends HttpServlet {

    DoctorRepository doctorIo = new DoctorRepository();

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("doctors", doctorIo.retrieveDoctors());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/doctor.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Doctor doctor = new Doctor(
                utils.Utils.iDGenerator(),
                request.getParameter("name"),
                request.getParameter("phone"),
                request.getParameter("email")
        );
        doctorIo.add(doctor);
        request.setAttribute("doctors", doctorIo.retrieveDoctors());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/doctor.jsp");
        dispatcher.forward(request, response);
    }

}
