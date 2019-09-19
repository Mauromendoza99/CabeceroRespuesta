/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "GerneracionExcelServlet", urlPatterns = {"/GerneracionExcelServlet"})
public class GerneracionExcelServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
            
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-Disposition","attachment; filename=excelEjemplo.xls");
            
            response.setHeader("Pragma", "no-cache");
            response.setHeader("Cache-Control", "no-store");
            response.setDateHeader("Expires", -1);
            
            out.println("\tValores");
            out.println("\t1");
            out.println("\t2");
            out.println("Total\t=SUMA(B2:B3)");
            
        }
    }

    

}
