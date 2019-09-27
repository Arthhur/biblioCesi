package cesi.biblio.model;

public class UnknownUserException extends Exception{
	public UnknownUserException(Long id) {
		super("The user with id=" + id + " doesn't exist.");
	}
}

