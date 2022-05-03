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

/**
 * Servlet implementation class DeleteTeacherServlet
 */
public class DeleteTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTeacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from adduserservlet");
		int teachername = Integer.parseInt(request.getParameter("Teacher_ID"));
		PrintWriter writer=response.getWriter();
		System.out.println(teachername);
		TeacherDAO teacherdao=new TeacherDAOImpl();
		teacherdao.DeleteTeacher(teachername);
		writer.println("Sucessfully Deleted");
		RequestDispatcher dispatcher= request.getRequestDispatcher("TeacherMaster.jsp");
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
