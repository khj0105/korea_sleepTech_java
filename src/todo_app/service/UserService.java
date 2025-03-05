package todo_app.service;

import java.util.List;

import todo_app.entity.User;

public interface UserService {
	void createUser(User user);
	List<User> findUserById();
	List<User> getallUsers();
	void deleteUser(Long userid);
}
