package servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import to.User;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
//		out.append("<html><body>"
//				+ "<h1>Hello World Servlet</h1>");
////		out.append("Served at: ").append(request.getContextPath());
		String firstName=request.getParameter("first_name");
		String lastName=request.getParameter("last_name");
//		out.append("First Name: "+firstName);
//		out.append("<br/>");
//		out.append("Last Name: "+lastName);
//		out.append("</body></html>");
		User user=new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		HttpSession session=request.getSession();
		session.setAttribute("firstName", firstName);
		request.setAttribute("user", user);
		request.getRequestDispatcher("/jsp/HelloWorld.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

