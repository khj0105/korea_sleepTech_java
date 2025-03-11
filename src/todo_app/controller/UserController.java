package todo_app.controller;

import todo_app.service.UserService;

public class UserController {
	private UserService service;
	
	public UserController() {
		this.service = new UserService();
	}
	
}
