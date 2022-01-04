/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import Respositories.DiagnosisRepository;
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
public class LabServlet extends HttpServlet{
    DiagnosisRepository repo = new DiagnosisRepository();
        @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("labs", this.repo.retriveDiagnosis());
       
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/lab.jsp");
        dispatcher.forward(request, response);
    }
}
