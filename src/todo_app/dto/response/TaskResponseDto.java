package todo_app.dto.response;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskResponseDto {
	private Long id;
	private Long userid;
	private String Title;
	private String Content;
	private String Status;
	private String Category;
	private Date date;
}
