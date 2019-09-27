package cesi.biblio.model;

public class UnknownBookException extends Exception{
	public UnknownBookException(Long id) {
		super("The product with id=" + id + " doesn't exist.");
	}
}

