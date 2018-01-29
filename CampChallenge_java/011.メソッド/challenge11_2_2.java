/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class challenge11_2_2 extends HttpServlet {
    //追加
    void Keisan(int Num1,int Num2,boolean Authenticity,PrintWriter pw){
        int total=0;
        if(Authenticity == true){
            total = (Num1*Num2)*(Num1*Num2);
            pw.print(total);
        }
        else if(Authenticity == false){
            total = (Num1*Num2);
            pw.print(total);
        }
       }
 // Num2とAuthenticityの両方をデフォルトにしないと使えない 
 // void Keisan(int Num1,PrintWriter pw){
 //        Keisan(Num1,5,false,pw);
    
    void Keisan(int Num1,boolean Authenticity,PrintWriter pw){
        Keisan(Num1,5,Authenticity,pw);
    }
    void Keisan(int Num1,int Num2,PrintWriter pw){
        Keisan(Num1,Num2,false,pw);
    }


    

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
            
            System.out.println("here is start point!!!");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet challenge11_2_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet challenge11_2_2 at " + request.getContextPath() + "</h1>");
            Keisan(4,8,out);
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
