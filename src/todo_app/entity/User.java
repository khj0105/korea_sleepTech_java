package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {
	private Long userid;
	private String password;
	private String name;
	private String email;
	private String gender;
}
