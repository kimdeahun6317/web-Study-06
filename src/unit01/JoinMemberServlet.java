package unit01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MemberServlet")
public class JoinMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public JoinMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}


	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		/*
		 * String name = request.getParameter("name"); String userid =
		 * request.getParameter("userid"); String nickname =
		 * request.getParameter("nickname"); String pwd = request.getParameter("pwd");
		 * String email = request.getParameter("email"); String phone =
		 * request.getParameter("phone");
		 * 
		 * request.setAttribute("name", name); request.setAttribute("userid", userid);
		 * request.setAttribute("nickname", nickname); request.setAttribute("pwd", pwd);
		 * request.setAttribute("email", email); request.setAttribute("phone", phone);
		 */
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("03_addMember.jsp");
		dispatcher.forward(request, response);
		
	}

}
