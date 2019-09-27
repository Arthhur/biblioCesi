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
import cesi.biblio.model.Book;

/**
 * Servlet implementation class ShowListBookServlet
 */
@WebServlet("/showList")
public class ShowListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int cmpt = 0 ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowListBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 List<Book> books = new ArrayList<Book>() ;
	       if(this.cmpt == 0) {
	    	   Book b1 = new Book(1L, "Les Misérables", "Victor Hugo", false) ;
	           Book b2 = new Book(1L, "Le tour du monde en 80 jours", "Jules Verne", true) ;
	           Book b3 = new Book(1L, "Croc blanc", "Jack London", false) ;

	           BookDao.addBook(b1) ;
	           BookDao.addBook(b2) ;
	           BookDao.addBook(b3) ;
	           this.cmpt++ ;
	       }
	       books = BookDao.getAllBooks() ;
	       request.setAttribute("Books", books);
	       
	       ServletContext context = getServletContext();
	       RequestDispatcher dispatcher = context.getRequestDispatcher("/listBook.jsp");
		   dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
