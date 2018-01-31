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
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class Challenge11_4_1 extends HttpServlet {
    HashMap<String, String> PRDATA(String IDNo){

        
        HashMap<String,String> User1 = new HashMap<String,String>();
            User1.put("Name","Aさん");
            User1.put("BirthDay","1月1日");
            User1.put("Address","Aさんの住所");
    
        
        HashMap<String,String> User2 = new HashMap<String,String>();
            User2.put("Name","Bさん");
            User2.put("BirthDay","2月2日");
            User2.put("Address","Bさんの住所"); 
            
        HashMap<String,String> User3 = new HashMap<String,String>();
            User3.put("ID", "3");
            User3.put("Name","Cさん");
            User3.put("BirthDay","3月3日");
            User3.put("Address","Cさんの住所");
            
//       ArrayList<HashMap> DATA = new ArrayList<HashMap>();
//            DATA.add(User1);
//            DATA.add(User2);
//            DATA.add(User3);
            
            if( IDNo.equals("User1") ){
                return User1;
            }// 以下、else if ... と続く
            
            else if(IDNo.equals("User2")){
                return User2;
            }
            
            else if(IDNo.equals("User3")){
                return User3;
            }
            else{
                return null;
            }
//        for( HashMap<String, String> user : DATA ){
//          if( user.get("Name").equals( IDNo ) ){
//                return user;
//           }
//       }    
            
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

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Challenge11_4_1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Challenge11_4_1 at " + request.getContextPath() + "</h1>");
//        ArrayList<String> DATA = new ArrayList<String>();
        HashMap<String,String> User = new HashMap<String,String>();

        //ここの""がパスワード
        User = PRDATA("User1");
            out.print(User.get("Name")+"<br>");
            out.print(User.get("BirthDay")+"<br>");
            out.print(User.get("Address")+"<br>");
        
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
