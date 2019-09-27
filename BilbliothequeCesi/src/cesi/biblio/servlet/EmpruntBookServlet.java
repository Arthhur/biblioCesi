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
import javax.servlet.http.HttpSession;

import cesi.biblio.doa.BookDao;
import cesi.biblio.model.Book;
import cesi.biblio.model.UnknownBookException;
import cesi.biblio.model.User;

/**
 * Servlet implementation class EmpruntBookServlet
 */
@WebServlet("/empruntBook")
public class EmpruntBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpruntBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest = (HttpServletRequest) request ;
		HttpSession session = request.getSession();
		Long id = Long.parseLong(request.getParameter("id"));
		User user = (User)session.getAttribute("User") ;
		List<Book> books = new ArrayList<Book>() ;
		
		try {
			Book book = BookDao.findBookById(id) ;
			user.addBook(book);
			books = BookDao.getAllBooks() ;
			BookDao.emprunter(id); 		       
	       ServletContext context = getServletContext();
	       RequestDispatcher dispatcher = context.getRequestDispatcher("/myBooks.jsp");
		   dispatcher.forward(request, response);
		} catch (UnknownBookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
