package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.StudentDAO.StudentDAOImpl;
import com.DAO.StudentDAO.StudentDao;
import com.DAO.teacherDAO.TeacherDAO;
import com.DAO.teacherDAO.TeacherDAOImpl;
import com.classes.Students;
import com.classes.Teachers;

/**
 * Servlet implementation class AddStudentServlet
 */
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from adduserservlet");
		String Studentname = (String) request.getParameter("Student_name");
		int classname = Integer.parseInt((String) request.getParameter("Class_ID"));
		PrintWriter writer=response.getWriter();
		System.out.println(Studentname);
		Students student = new Students(Studentname);
		StudentDao studentdao=new StudentDAOImpl();
		int result=studentdao.addStudent(student,classname);
		if(result>0){  
			writer.print("Successfully Added Subject");
			RequestDispatcher dispatcher= request.getRequestDispatcher("StudentMaster.jsp");
			dispatcher.include(request, response);
			}  
			else  
			{  
			writer.print("Sorry, error");
			RequestDispatcher dispatcher= request.getRequestDispatcher("StudentMaster.jsp");
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
