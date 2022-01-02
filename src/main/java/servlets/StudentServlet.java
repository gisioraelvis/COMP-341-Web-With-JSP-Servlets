package servlets;

/**
 *
 * @author ojay
 */
import Respositories.StudentIO;
import entities.FamilyDoctor;
import entities.NextOfKin;
import entities.Student;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import utils.Utils;

public class StudentServlet extends HttpServlet {
        private StudentIO studentIo = new StudentIO();

        @Override
        public void doGet(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {
                response.setContentType("text/html");
                ArrayList<Student> students = this.studentIo.retrieveStudents();
                request.setAttribute("students", students);

                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/students.jsp");
                dispatcher.forward(request, response);
        }

        @Override
        public void doPost(HttpServletRequest request,
                        HttpServletResponse response)
                        throws ServletException, IOException {
                response.setContentType("text/html");
                NextOfKin nextOfKin;
                nextOfKin = new NextOfKin(
                                request.getParameter("nfKname"),
                                request.getParameter("nfKphone"),
                                request.getParameter("nfKaddress"));

                // Familydoctor object
                FamilyDoctor familyDoctor = new FamilyDoctor(
                                request.getParameter("fDname"),
                                request.getParameter("fDphone"),
                                request.getParameter("fDaddress"));
                // Student object

                Student student = new Student(
                                Utils.iDGenerator(),
                        request.getParameter("regNo"),
                                request.getParameter("surname"),
                                request.getParameter("firstName"),
                                request.getParameter("lastName"),
                                request.getParameter("phone"),
                                request.getParameter("email"),
                                request.getParameter("gender"),
                                request.getParameter("maritalStatus"),
                                request.getParameter("nationality"),
                                request.getParameter("religion"),
                                nextOfKin,
                                request.getParameter("privateHospital"),
                                request.getParameter("admission"),
                                request.getParameter("reasonAdmission"),
                                request.getParameter("previousIllness"),
                                request.getParameter("medicalHistory"),
                                request.getParameter("vision"),
                                request.getParameter("hearing"),
                                request.getParameter("hearing"),
                                request.getParameter("hbLevel"),
                                request.getParameter("bloodGroup"),
                                request.getParameter("urineChemistry"),
                                request.getParameter("onTreatment"),
                                request.getParameter("anyObservation"),
                                request.getParameter("studentFits"),
                                familyDoctor);
                this.studentIo.add(student);
                ArrayList<Student> students = this.studentIo.retrieveStudents();
                request.setAttribute("students", students);

                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/students.jsp");
                dispatcher.forward(request, response);
        }

}
