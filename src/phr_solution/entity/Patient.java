package phr_solution.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {// setter 처리
	private Long id;	// 환자 고유 번호
	private String name;
	private int age;
	private String gender;
}
