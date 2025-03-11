package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserSignUpRequestDto {
	private String userid;
	private String password;
	private String name;
	private String email;
	private String gender;
	private int age;
}
