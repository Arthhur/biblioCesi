package cesi.biblio.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cesi.biblio.doa.BookDao;
import cesi.biblio.doa.UserDao;
import cesi.biblio.model.Book;
import cesi.biblio.model.UnknownBookException;
import cesi.biblio.model.UnknownUserException;
import cesi.biblio.model.User;

/**
 * Servlet implementation class ShowListBookByUser
 */
@WebServlet("/showListByUser")
public class ShowListBookByUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowListBookByUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*Long id = Long.parseLong(request.getParameter("id")) ;
		List<Book> books = new ArrayList<Book>() ;
		try {
			User user = UserDao.findUserById(id) ;
			books = user.getAllBooks() ;
			request.setAttribute("MyBooks", books);
		    ServletContext context = getServletContext();
		    RequestDispatcher dispatcher = context.getRequestDispatcher("/myBooks.jsp");
		    dispatcher.forward(request, response);
		} catch (UnknownUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
