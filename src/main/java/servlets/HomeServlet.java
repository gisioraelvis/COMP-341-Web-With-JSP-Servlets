package servlets;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class HomeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        // PrintWriter out = response.getWriter();
        // out.println("test");
        // out.close();
        RequestDispatcher  dispatcher = getServletContext().getRequestDispatcher("/home.jsp");
        dispatcher.forward(request, response);
    }

}
