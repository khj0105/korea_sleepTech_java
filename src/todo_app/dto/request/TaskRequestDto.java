package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskRequestDto {
	private String Title;
	private String Content;
	private String Status;
	private String Category;
}
