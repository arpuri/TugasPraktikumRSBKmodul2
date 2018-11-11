/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.session.jualsempolan;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ardel
 */
public class sempolServlet extends HttpServlet {

    @EJB
    private jualsempolan jualsempolan;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
       protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {            
             out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<out.println(\"<head>\");>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Dup</title>");
            out.println("<link href=\"https://fonts.googleapis.com/css?family=Poppins:100,300,500\" rel=\"stylesheet\">");
            out.println("<link rel=\"stylesheet\" href=\"css/linearicons.css\">");
            out.println("<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">");
            out.println("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">");
            out.println("<link rel=\"stylesheet\" href=\"css/nice-select.css\">");
            out.println("<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">");
            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">");
            out.println("<link rel=\"stylesheet\" href=\"css/main.css\">");
            out.println("</head>");
            out.println("<body class=\"dup-body\">");
            out.println("<div class=\"dup-body-wrap\">");
            
            String jml = request.getParameter("jml");
            
            if ((jml != null) && (jml.length() > 0)) {
                double d = Double.parseDouble(jml);
                if (request.getParameter("Harga Sempolan") != null){
                    String tt = jualsempolan.harga(d);
                   out.println("<section class=\"banner-area relative\">");
                out.println("<div class=\"overlay overlay-bg\"></div>");
                out.println("<div class=\"container\">");
                out.println("<div class=\"row fullscreen align-items-center justify-content-between\">");
                out.println("<div class=\"col-lg-6 col-md-7 col-sm-8\">");
                out.println("<div class=\"banner-content\">");
                out.println("<h1>Kamu Harus Membayar</h1>");
                out.println("<h2> Rp."+tt+"</h2>");
                out.println("</div>");
                out.println("</div>");
                out.println("<div class=\"col-lg-5 col-md-5 col-sm-4\">");
                out.println("<img src=\"img/banner.png\" alt=\"\" class=\"img-fluid\">");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</section>"); 
                    
                    
                    
                }  
                
                
            } else {
                out.println("<section class=\"banner-area relative\">");
                out.println("<div class=\"overlay overlay-bg\"></div>");
                out.println("<div class=\"container\">");
                out.println("<div class=\"row fullscreen align-items-center justify-content-between\">");
                out.println("<div class=\"col-lg-6 col-md-8 col-sm-8\">");
                out.println("<div class=\"banner-content\">");
                out.println("<h1>Sempolan Nikmat <br> Bermacam Rasa</h1>"); 
                out.println("<form method=\"get\">");
                out.println("<p>isi jumlah sempolan</p>");
                out.println("<p><input type=\"text\" name=\"jml\" placeholder=\"Isikan Jumlah Sempolan\" required class=\"single-input-primary\"><p>");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"Harga Sempolan\" value=\"Harga Sempolan\" class=\"genric-btn primary circle\">");
                out.println("</form>");
                out.println("</div>");
                out.println("</div>");
                out.println("<div class=\"col-lg-5 col-md-5 col-sm-4\">");
                out.println("<img src=\"img/banner.png\" alt=\"\" class=\"img-fluid\">");
                out.println("</div>");
                out.println("</div>");
                out.println("</div>");
                out.println("</section>");  
                
               
            }
        
        } finally {
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
            out.close();
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
