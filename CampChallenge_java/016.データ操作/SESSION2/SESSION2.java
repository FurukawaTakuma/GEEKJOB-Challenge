/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package データ操作;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author guest1Day
 */
public class SESSION2 extends HttpServlet {

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
            out.println("<title>Servlet SESSION2</title>");
            out.println("</head>");
            out.println("<body>");

            request.setCharacterEncoding("UTF-8");

            HttpSession hsnm = request.getSession();
            String name = request.getParameter("name");
            String gender = request.getParameter("gendar");
            String hobby = request.getParameter("hobby");
            //名前


                out.println(request.getParameter("name")+"<br>");
                hsnm.setAttribute("rsname",name);

            
            //性別
/*            if (hsnm == null) {
                out.println(gender+"<br>");
                hsnm = request.getSession(true);
                hsnm.setAttribute("gnd", gender);
            } else {
 */               
                if (gender.equals("male")) {
                    hsnm.setAttribute("gnd", "male");
                    out.println("性別は男"+"<br>");
                } else if (gender.equals("female")) {
                    hsnm.setAttribute("gnd","female");
                    out.println("性別は女"+"<br>");
                }
/*                out.println("session success<br>");
            }
*/            
            //趣味
/*            if(hsnm==null){
                out.println("趣味は"+hobby+"です。<br>");
                hsnm = request.getSession(true);
                hsnm.setAttribute("hby", hobby);
            }
*/

                out.println("趣味は"+hobby+"です。<br>");
                hsnm.setAttribute("hby",hobby);

            
/*            request.setAttribute("rsname",hsnm.getAttribute("name"));
            request.setAttribute("rsgendar",hsnm.getAttribute("gendar"));
            request.setAttribute("rshby",hsnm.getAttribute("hby"));
*/            
            RequestDispatcher rd = request.getRequestDispatcher("SESSION[2].jsp");
            rd.forward(request,response);
            
            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            System.out.print(e);
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
