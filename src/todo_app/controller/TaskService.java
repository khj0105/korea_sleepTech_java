package todo_app.controller;

import java.util.List;

import todo_app.dto.request.TaskRequestDto;
import todo_app.dto.response.TaskResponseDto;

public class TaskService {
	public TaskService service;
	
	public TaskService() {
		this.service = new TaskService();
	}
	
	public void createTask(TaskRequestDto dto) {
		service.createTask(dto);
	}
	
	public List<TaskResponseDto> getAllTask() {
		return service.getAllTask();
	}
	
	public List<TaskResponseDto> filterTaskByTitle(String Title) {
		return service.filterTaskByTitle(Title);
	}
	
	public void deleteTask(Long id) {
		service.deleteTask(id);
	}
}
