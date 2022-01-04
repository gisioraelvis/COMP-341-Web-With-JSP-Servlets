package servlets;


import Respositories.DiagnosisRepository;
import entities.*;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateLabServlet extends HttpServlet{
    DiagnosisRepository repo = new DiagnosisRepository();
        @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        Diagnosis diagnosis = this.repo.getDiagnosis(id);
        request.setAttribute("diagnosis",diagnosis);
       
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/updateLabResult.jsp");
        dispatcher.forward(request, response);
    }
    @Override
     protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
      
        Diagnosis diagnosis = this.repo.getDiagnosis(id);
        ArrayList<Lab>labs = diagnosis.lab;
         for(Lab l:labs){
             String result = request.getParameter(l.test);
             l.results = result;
         }
        this.repo.addLabResults(labs, diagnosis.id);
        
       
        response.sendRedirect("lab");
    }
}