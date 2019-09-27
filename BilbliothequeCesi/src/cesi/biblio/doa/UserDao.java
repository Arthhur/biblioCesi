package cesi.biblio.doa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cesi.biblio.model.User;
import cesi.biblio.model.UnknownUserException;
import cesi.biblio.model.User;

public class UserDao {
	private static List<User> users = new ArrayList<User>();
	private static Long idSequence = 1L;
	
	private UserDao() { }
	
	
	public static void addUser(User user) {
		user.setId(idSequence++);
		users.add(user);
	}
	
	
	public static User findUserById(Long id) throws UnknownUserException {
		int index = getUserIndexById(id);
		if(index > -1) {
			User user = users.get(index);
			return user;
		}
		throw new UnknownUserException(id);
	}
	
	
	public static List<User> getAllUsers() {
		return Collections.unmodifiableList(users);
	}
	
	
	public static void removeUser(User user) throws UnknownUserException {
		removeUser(user.getId());
	}
	
	
	public static void removeUser(Long id) throws UnknownUserException {
		int index = getUserIndexById(id);
		if(index > -1) {
			users.remove(index);
		} else {
			throw new UnknownUserException(id);
		}
	}
	
	private static int getUserIndexById(Long id) {
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if(user.getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

}
