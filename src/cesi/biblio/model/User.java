package cesi.biblio.model;

import java.util.ArrayList;
import java.util.List;

import cesi.biblio.doa.BookDao;

public class User {
	private Long id = 1L ;
	private String username = "" ;
	private String password = "" ;
	private List<Book> books = new ArrayList<Book>() ;
	
	public User(Long id, String username, String password) {
		this.id = id ;
		this.username = username ;
		this.password = password ;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		this.books.add(book) ;
	}
	
	public void removeBook(Book book) throws UnknownBookException{
		this.books.remove(book) ;
	}
	
	public List<Book> getAllBooks() {
		return this.books ;
	}
	
}
