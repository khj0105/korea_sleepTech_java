package todo_app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import todo_app.entity.User;

public class UserRepository {
	List<User> users = new ArrayList<User>();
	private static final UserRepository instance = new UserRepository();
	
	private UserRepository() {}
	
	public static UserRepository getInstance() {
		return instance;
	}
	
	public void save(User user) {
		users.add(user);
	}
	
	public Optional<User> findById(long userid){
		return users.stream()
				.filter(user -> user.getUserid().equals(userid))
				.findFirst();
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public void delete(User user) {
		users.remove(user);
	}
}
