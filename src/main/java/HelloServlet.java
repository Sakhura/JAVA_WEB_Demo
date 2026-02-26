import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String nombre = request.getParameter("nombre");

        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Hola, " + (nombre != null ? nombre : "visitante") + "</h2>");
        out.println("<a href='index.jsp'>Volver</a>");
        out.println("</body></html>");
    }

    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{

        request.setCharacterEncoding("UTF-8");
        String msg = request.getParameter("msg");

        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Mensaje Recibido</h2>");
        out.println("<p>" + msg + "</p>");
        out.println("<a href='index.jsp'>Volver</a>");
        out.println("</body></html>");
    }


}
