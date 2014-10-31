/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.NewHibernateUtil;
import model.Trabajador;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author brain
 */
public class GuardarTrabajador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
   SessionFactory factory= NewHibernateUtil.getSessionFactory();
   Session sesion= factory.openSession();
   Transaction tranza = sesion.beginTransaction();
   String nombre=request.getParameter("nombre");
   String paterno=request.getParameter("paterno");
   String materno= request.getParameter("materno");
   Trabajador t=new Trabajador(nombre, paterno, materno);
   
   sesion.save(t);
   tranza.commit();
   sesion.close();
   
  
    }



}
