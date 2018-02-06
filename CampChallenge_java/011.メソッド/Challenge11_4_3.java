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
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author guest1Day
 */
public class Challenge11_4_3 extends HttpServlet {
    
    ArrayList<HashMap> PRData(String A){
        HashMap<String, String> Data1 = new HashMap<String, String>();
        Data1.put("ID","1111");
        Data1.put("Name","Aさん");
        Data1.put("Birth","1月1日");
        Data1.put("Address","住所A");

        HashMap<String, String> Data2 = new HashMap<String, String>();
        Data2.put("ID","2222");
        Data2.put("Name","Bさん");
        Data2.put("Birth","2月2日");
        Data2.put("Address",null);
        
        HashMap<String, String> Data3 = new HashMap<String, String>();
        Data3.put("ID","3333");
        Data3.put("Name","Cさん");
        Data3.put("Birth","3月3日");
        Data3.put("Address","住所C");
        
        ArrayList<HashMap> Data = new ArrayList<HashMap>();
        Data.add(Data1);
        Data.add(Data2);
        Data.add(Data3);
        
        return Data;
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
            out.println("<title>Servlet Challenge11_4_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Challenge11_4_2 at " + request.getContextPath() + "</h1>");
            
            ArrayList<HashMap> Profile = new ArrayList<HashMap>();
            Profile = PRData("");
            //limitを宣言
            Integer limit = 2;
            
            for( HashMap<String,String> user:Profile){
                //limitを使って2名までで表示を止める条件
                if(limit>0){
                out.println(user.get("Name"));
                out.println(user.get("Birth"));
                limit--;
                //
                if(user.get("Address")==null){
                    out.print("<br>");
                continue;
                }
                else{
                    out.println(user.get("Address")+"<br>");
                }
            }
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
