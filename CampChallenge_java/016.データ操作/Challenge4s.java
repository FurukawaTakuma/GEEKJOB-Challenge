/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package データ操作;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class Challenge4s extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Challenge4s</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Challenge4s at " + request.getContextPath() + "</h1>");
            
            request.setCharacterEncoding("UTF-8");
//            if (type == 1) {
//                System.out.print("雑貨");
//            } else if (type == 2) {
  //              System.out.print("生鮮食品");
 //           } else if (type == 3) {
   //             System.out.print("その他");

            out.println(request.getParameter("count")+"個");
            
            if((request.getParameter("type")).equals("1")){
            out.println("雑貨");
            }
            else if((request.getParameter("type")).equals("2")){
            out.println("生鮮食品");
            }
            else if((request.getParameter("type")).equals("1")){
            out.println("その他");
            }
            int s =Integer.valueOf(request.getParameter("count"));
            int t =Integer.valueOf(request.getParameter("total"));
            
            out.println("単価"+t/s);
            
            if(t<3000){
                out.print("ポイント0");
            }
            else if(5000<=t){
                out.print("ポイント"+t*0.05);
            }
            else{
                out.print("ポイント"+t*0.04);
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
