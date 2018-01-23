package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.MySQLAccess;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/MySQLQueryServlet")
public class MySQLQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MySQLQueryServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		serve(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void serve(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.print("<font color=\"green\" size=\"+1\">Welcome to the simple sample for MySQL</font>");
			out.print("<br/><font color=\"red\">If NO records are displayed, insert rows in the table</font>");
			out.print("<br/>");
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Setup the connection with the DB
			connection = DriverManager.getConnection("jdbc:mysql://localhost/test?user=vpanchat&password=p1kvijay&useSSL=false");
			// Statements allow to issue SQL queries to the database
			statement = connection.createStatement();
			// Result set get the result of the SQL query
			resultSet = statement.executeQuery("select * from test.user");
			while (resultSet.next()) {
				// It is possible to get the columns via name
				// also possible to get the columns via the column number
				// which starts at 1
				// e.g. resultSet.getSTring(2);
				String user = resultSet.getString("username");
				String website = resultSet.getString("email");
				String summary = resultSet.getString("password");
				Timestamp timestamp = resultSet.getTimestamp("create_time");
				out.println("User: " + user);
				out.println("Website: " + website);
				out.println("summary: " + summary);
				out.println("timestamp" + timestamp);
			}

		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			out.print("Exception: " + e.toString());
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}
