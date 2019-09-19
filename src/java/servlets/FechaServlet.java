/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "FechaServlet", urlPatterns = {"/FechaServlet"})
public class FechaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               try (PrintWriter out = response.getWriter()) {

                   response.setContentType("text/html;charset=UTF-8");
                   response.setHeader("refresh", "1");
                   Date fecha = new  Date();
                   SimpleDateFormat formateador = new SimpleDateFormat("Hora actualizada");
                   String fechaConFormato = formateador.format(fecha);
                   
                 out.println("<html>");
                 out.println("<head>");
                 out.println("<title>Servlet FechaServlet</title>");            
                 out.println("</head>");
                 out.println("<body>");
                 out.println("<h1>Fecha actualizada: "+ fechaConFormato +"</h1>");
                 out.println("</body>");
                 out.println("</html>");
        }
    }


}
