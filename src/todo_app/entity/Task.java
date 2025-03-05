package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
	private String Title;
	private String Content;
	private String Status;
	private String Category;
}
