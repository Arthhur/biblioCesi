package cesi.biblio.model;

public class UnknownBookException extends Exception{
	public UnknownBookException(Long id) {
		super("The book with id=" + id + " doesn't exist.");
	}
}

