package todo_app.dto.request;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskRequestDto {
	private Long id;
	private String Title;
	private String Content;
	private String Status;
	private String Category;
	private Date date;
}

	