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
import com.DAO.teacherDAO.TeacherDAO;
import com.DAO.teacherDAO.TeacherDAOImpl;
import com.classes.Subjects;
import com.classes.Teachers;

/**
 * Servlet implementation class DeleteSubjectServlet
 */
public class DeleteSubjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSubjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from adduserservlet");
		int subjectname = Integer.parseInt((String) request.getParameter("Subject_ID"));
		PrintWriter writer=response.getWriter();
		System.out.println(subjectname);
		SubjectDAO subjectdao=new SubjectDAOImpl();
		subjectdao.DeleteSubject(subjectname);
		writer.println("Sucessfully Deleted");
		RequestDispatcher dispatcher= request.getRequestDispatcher("MasterSubject.jsp");
		dispatcher.include(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
