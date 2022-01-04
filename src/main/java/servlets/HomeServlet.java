package servlets;

import Respositories.AppointmentRepository;
import Respositories.DiagnosisRepository;
import Respositories.StudentRepository;
import Respositories.UserRepository;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class HomeServlet extends HttpServlet {
   UserRepository userRepo = new UserRepository();
    AppointmentRepository appRepo = new AppointmentRepository();
     DiagnosisRepository dRepo = new DiagnosisRepository();
     StudentRepository sRepo = new StudentRepository();
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       
        request.setAttribute("users",userRepo.retrieveUsers() );
        request.setAttribute("appointments",appRepo.retriveAppointments());
        request.setAttribute("diagnosis",dRepo.retriveDiagnosis());
        request.setAttribute("students",sRepo.retrieveStudents());
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }

}
