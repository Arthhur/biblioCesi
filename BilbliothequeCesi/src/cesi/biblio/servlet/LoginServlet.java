package cesi.biblio.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cesi.biblio.doa.BookDao;
import cesi.biblio.doa.UserDao;
import cesi.biblio.model.Book;
import cesi.biblio.model.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int cmpt = 0 ;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest = (HttpServletRequest) request ;
		HttpSession session = request.getSession();
		String username = request.getParameter("user") ;
		String password = request.getParameter("password") ;
		
		if(username.length() != 0 && password.length() != 0) {
			User user = new User(1L, username, password) ;
			UserDao.addUser(user);
			session.setAttribute("User", user);
			
			if(this.cmpt == 0) {
		    	   Book b1 = new Book(1L, "Les Misérables", "Victor Hugo", false) ;
		           Book b2 = new Book(1L, "Le tour du monde en 80 jours", "Jules Verne", true) ;
		           Book b3 = new Book(1L, "Croc blanc", "Jack London", false) ;

		           BookDao.addBook(b1) ;
		           BookDao.addBook(b2) ;
		           BookDao.addBook(b3) ;
		           this.cmpt++ ;
		    }
			HttpServletResponse res = (HttpServletResponse) response;	
			res.sendRedirect( httpRequest.getContextPath() + "/connexion.jsp" );
		}
		else {
			HttpServletResponse res = (HttpServletResponse) response;	
			res.sendRedirect( httpRequest.getContextPath() + "/connexion.jsp" );
		}
		
		
		
		
			
	}

}
