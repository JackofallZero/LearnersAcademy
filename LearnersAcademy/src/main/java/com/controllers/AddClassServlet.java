package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.ClassesDAO.ClassDAO;
import com.DAO.ClassesDAO.ClassesDAOImpl;
import com.DAO.StudentDAO.StudentDAOImpl;
import com.DAO.StudentDAO.StudentDao;
import com.classes.Classes;
import com.classes.Students;

/**
 * Servlet implementation class AddClassServlet
 */
public class AddClassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddClassServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from adduserservlet");
		String classname = (String) request.getParameter("Class_name");
		PrintWriter writer=response.getWriter();
		System.out.println(classname);
		Classes class1 = new Classes(classname);
		ClassDAO classdao = new ClassesDAOImpl();
		
		int result=classdao.AddClass(class1);
		if(result>0){  
			writer.print("Successfully Added Subject"); 
			RequestDispatcher dispatcher= request.getRequestDispatcher("ClassMaster.jsp");
			dispatcher.include(request, response);
			}  
			else  
			{  
			writer.print("Sorry, error");	
			RequestDispatcher dispatcher= request.getRequestDispatcher("ClassMaster.jsp");
			dispatcher.include(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
