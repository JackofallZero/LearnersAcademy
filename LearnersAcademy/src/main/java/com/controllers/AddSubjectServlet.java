package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.SubjectDAO.SubjectDAO;
import com.DAO.SubjectDAO.SubjectDAOImpl;
import com.classes.Subjects;

/**
 * Servlet implementation class AddSubjectServlet
 */
public class AddSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Hello from adduserservlet");
		String Subjectname = (String) request.getParameter("Subject_name");
		PrintWriter writer=response.getWriter();
		System.out.println(Subjectname);
		Subjects obj = new Subjects(Subjectname);
		SubjectDAO subjectdao=new SubjectDAOImpl();
		int result=subjectdao.AddSubject(obj);
		if(result>0){  
			writer.print("Successfully Added Subject");
			RequestDispatcher dispatcher= request.getRequestDispatcher("MasterSubject.jsp");
			dispatcher.include(request, response);
			}  
			else  
			{  
			writer.print("Sorry, error");  
			RequestDispatcher dispatcher= request.getRequestDispatcher("MasterSubject.jsp");
			dispatcher.include(request, response);
			
			}  
	}
	}


