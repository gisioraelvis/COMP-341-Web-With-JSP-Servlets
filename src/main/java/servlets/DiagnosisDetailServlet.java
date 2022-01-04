package servlets;

import Respositories.DiagnosisRepository;
import entities.Diagnosis;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DiagnosisDetailServlet extends HttpServlet {

    DiagnosisRepository repo = new DiagnosisRepository();
   

    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        Diagnosis diagnosis = this.repo.getDiagnosis(id);
        request.setAttribute("diagnosis",diagnosis);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/diagnosisDetail.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String sId = request.getParameter("userId");
        String tests = request.getParameter("tests");

//        if (user != null) {
//            String diagnosisId = utils.Utils.iDGenerator();
//            ArrayList<Lab> labs = new ArrayList<Lab>();
//            for(String s:tests.split(",")){
//                labs.add(new Lab(s,diagnosisId));
//            }
//            Diagnosis d = new Diagnosis(user,
//                    diagnosisId,
//                    request.getParameter("consultation"),
//                    request.getParameter("notes"),
//                    request.getParameter("prescription"),
//                    labs
//            );
//            this.repo.addDiagnosis(d);
//        }

        request.setAttribute("diagnosis", this.repo.retriveDiagnosis());


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/diagnosis.jsp");
        dispatcher.forward(request, response);
    }
}
