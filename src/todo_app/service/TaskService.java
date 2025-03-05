package todo_app.service;

import java.util.List;

import todo_app.entity.Task;

public interface TaskService {
	void createUser(Task task );
	List<Task> getallTask();
	List<Task> findTaskById();
	void deleteUser(Long userid);
}
