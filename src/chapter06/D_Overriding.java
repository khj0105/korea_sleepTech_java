package chapter06;





// == 오버라이딩 특징 == //
// - 메서드 시그니처가 일치!
//		: 부모 클래스의 메서드와 동일한 이름, 매개변수 구성을 가져야 함.
//			반환 타입은 같거나 자동 형 변환이 가능하게 작성
//	- 메서드명 바로 위에 @Override 어노테이션을 작성!
//	- 다형성 구현
//		: 하나의 이름으로 여러 기능을 수행하는 코드 작성
//	- 재사용성, 확장성 향상
//		: 기존의 코드 변경 없이, 새로운 기능 추가와 변경 가능

class AnimalClass {
	void sound() {
		System.out.println("동물이 울음소리를 냅니다.");
	}
}

class DogClass extends AnimalClass{
	// 코드 어노테이션
	// : 코드에 메타데이터를 제공하는 방법
	
	@Override
	void sound() {
		System.out.println("강아지가 멍멍하고 짖습니다.");
	}
}

class CatClass extends AnimalClass{
	@Override
	void sound() {
		System.out.println("고양이가 야옹하고 웁니다.");
	}
}

public class D_Overriding {
	public static void main(String[] args) {
		AnimalClass animalClass = new AnimalClass();
		animalClass.sound(); // 동물이 울음소리를 냅니다.
		CatClass catClass = new CatClass();
		DogClass dogClass = new DogClass();
		
		dogClass.sound(); // 강아지가 멍멍하고 짖습니다.
		catClass.sound(); // 고양이가 야옹하고 웁니다.
		
		// >> 해당 상태나 동작을 반드시 가지지만!
		// 		상속받는 클래스마다 차이를 두고싶은 경우
		
		// == 오버로딩(Overloading) VS 오버라이딩(Overriding) == //
		// : 메서드의 이름을 재사용하는 방법 (다형성 - 같은 이름으로 다른 행위)
		
		// 1) 오버로딩
		// - "같은 클래스 내에서" 같은 이름을 가진 메서드를 여러 개 정의
		// : 메서드명 동일
		// 		매개변수의 타입, 개수, 순서 중 적어도 하나 이상은 달라야 함
		//		>> 반환 타입 상관 X
		//	: 메서드 동작을 다양한 상황에 맞게 조정
		
		// 2) 오버라이딩
		// - "상속 관계"에 있는 클래스에서 사용
		// : 메서드의 시그니처(반환타입, 이름, 매개변수)가 동일
		// : 메서드의 동작을 변경하거나 확장
		// +) @Override 어노테이션 사용: 컴파일러에게 전달
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
