package cesi.biblio.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cesi.biblio.doa.BookDao;
import cesi.biblio.model.Book;
import cesi.biblio.model.UnknownBookException;

/**
 * Servlet implementation class ShowOneBookServlet
 */
@WebServlet("/showOneBook")
public class ShowOneBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowOneBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long id = Long.parseLong(request.getParameter("id"));
		try {
			Book book = BookDao.findBookById(id) ;
			request.setAttribute("Book", book);
		    ServletContext context = getServletContext();
		    RequestDispatcher dispatcher = context.getRequestDispatcher("/oneBook.jsp");
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
