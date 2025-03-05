package todo_app.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import todo_app.entity.Task;

public class TaskRepository {
	private List<Task> tasks = new ArrayList<Task>();
	
	private static final TaskRepository instance = new TaskRepository();
	
	private TaskRepository() {}
	
	public static TaskRepository getInstance() {
		return instance;
	}
	
	public void save(Task task) {
		tasks.add(task);
	}
	
	public Optional<Task> findbyId(String title) {
		return tasks.stream()
				.filter(task -> task.getTitle().equals(title))
				.findFirst();
	}
	
	public List<Task> findAll() {
		return tasks;
	}
	
	public Optional<Boolean> update(String content){
		return tasks.stream()
				.map (task -> task.getContent().equals(content))
				.findFirst();
	}
	
	public void delete(Task task) {
		tasks.remove(task);
	}
}