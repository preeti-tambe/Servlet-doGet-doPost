

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<b> Welcome To Registration Page GET<b><br/>");
		String name =  request.getParameter("uname");
		String pass =  request.getParameter("upass");
		String add1 =  request.getParameter("add");
		
		out.print("NAME ="+name+"<br/>");
		out.print("Password="+pass+"<br/>");
		out.print("ADDRESS ="+add1+"<br/>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<b> Welcome To Registration Page POST<b><br/>");
		String name =  request.getParameter("uname");
		String pass =  request.getParameter("upass");
		String add1 =  request.getParameter("add");
		
		out.print("NAME ="+name+"<br/>");
		out.print("Password="+pass+"<br/>");
		out.print("ADDRESS ="+add1+"<br/>");
		
	}

}
