package cesi.biblio.doa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cesi.biblio.model.Book;
import cesi.biblio.model.UnknownBookException;

public class BookDao {
	private static List<Book> books = new ArrayList<Book>();
	private static Long idSequence = 1L;
	
	private BookDao() { }
	
	
	public static void addBook(Book book) {
		book.setId(idSequence++);
		books.add(book);
	}
	
	
	public static void updateBook(Book book) throws UnknownBookException {
		int index = getBookIndexById(book.getId());
		if(index > -1) {
			books.set(index, book);
		} else {
			throw new UnknownBookException(book.getId());
		}
	}
	
	
	public static Book findBookById(Long id) throws UnknownBookException {
		int index = getBookIndexById(id);
		if(index > -1) {
			Book book = books.get(index);
			return book;
		}
		throw new UnknownBookException(id);
	}
	
	
	public static List<Book> getAllBooks() {
		return Collections.unmodifiableList(books);
	}
	
	
	public static void removeBook(Book book) throws UnknownBookException {
		removeBook(book.getId());
	}
	
	
	public static void removeBook(Long id) throws UnknownBookException {
		int index = getBookIndexById(id);
		if(index > -1) {
			books.remove(index);
		} else {
			throw new UnknownBookException(id);
		}
	}
	
	private static int getBookIndexById(Long id) {
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if(book.getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}


}
