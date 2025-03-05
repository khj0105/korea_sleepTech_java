package todo_app.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskResponseDto {
	private String Title;
	private String Content;
	private String Status;
	private String Category;
}
