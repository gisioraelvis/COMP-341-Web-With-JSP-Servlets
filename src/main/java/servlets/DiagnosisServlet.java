package servlets;

import Respositories.DiagnosisRepository;
import Respositories.DoctorRepository;
import Respositories.UserRepository;

import entities.Diagnosis;
import entities.Lab;

import entities.User;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ojay
 */
public class DiagnosisServlet extends HttpServlet {

    DiagnosisRepository repo = new DiagnosisRepository();
    UserRepository userRepo = new UserRepository();
    DoctorRepository doctorRepo = new DoctorRepository();

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("diagnosis", this.repo.retriveDiagnosis());
        request.setAttribute("users", this.userRepo.retrieveUsers());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/diagnosis.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sId = request.getParameter("userId");
        String tests = request.getParameter("tests");
        User user = this.userRepo.retrieveUser(sId);

        if (user != null) {
            String diagnosisId = utils.Utils.iDGenerator();
            ArrayList<Lab> labs = new ArrayList<Lab>();
            for(String s:tests.split(",")){
                labs.add(new Lab(s,diagnosisId));
            }
            Diagnosis d = new Diagnosis(user,
                    diagnosisId,
                    request.getParameter("consultation"),
                    request.getParameter("notes"),
                    request.getParameter("prescription"),
                    labs
            );
            this.repo.addDiagnosis(d);
        }

        request.setAttribute("diagnosis", this.repo.retriveDiagnosis());
        request.setAttribute("users", this.userRepo.retrieveUsers());
        request.setAttribute("doctors", this.doctorRepo.retrieveDoctors());

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/diagnosis.jsp");
        dispatcher.forward(request, response);
    }
}
