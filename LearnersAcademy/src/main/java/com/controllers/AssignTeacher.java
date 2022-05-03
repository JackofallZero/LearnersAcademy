package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.DAO.ClassesDAO.ClassDAO;
import com.DAO.ClassesDAO.ClassesDAOImpl;
import com.classes.Classes;

/**
 * Servlet implementation class AssignTeacher
 */
public class AssignTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AssignTeacher() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int teacher_id =  Integer.parseInt(request.getParameter("Teacher_ID"));
		int class_id = Integer.parseInt(request.getParameter("Class_ID"));
		ClassDAO classdao = new ClassesDAOImpl();
		classdao.AssignTeacher(teacher_id, class_id);
		PrintWriter out = response.getWriter();
		out.println("Successfully Assigned");
		RequestDispatcher rd = request.getRequestDispatcher("Profile.jsp");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
