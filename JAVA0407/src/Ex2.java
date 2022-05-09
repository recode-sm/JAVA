
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 접근제한자
		 * - 클래스, 메서드, 멤버변수 등의 접근 제한 용도로 사용하는 키워드
		 * - (넓음) public > protected > default > private (좁음)
		 *   => 단, default 접근제한자는 별도의 키워드 없이 생략하면 적용
		 *   
		 * 1. Private 접근제한자
		 * - 외부 클래스에서 접근하지 못하고, 자신의 클래스 내에서만 접근 가능
		 * - 자신의 클래스 내에서 private 멤버변수 값에 접근하여
		 *   멤버변수의 값을 변경하거나 리턴하는 역할의 메서드를 정의하여 제공
		 */
		
		//Person2 클래스 인스턴스 생성 및 멤버변수 초기화
		Person2 p = new Person2();
		p.name = "홍길동";
		p.age = -20;
		// => 특정 인스턴스의 멤버변수 값을 외부에서 함부로 변경할 경우
		//    잘못된 값을 입력하는 등 문제가 발생해도 제어가 불가능하다.
		// => 외부에서 인스턴스 내부의 멤버변수 값을 함부로 변경하지 못하도록
		//    클래스 내에서 멤버변수 선언 시 private 접근제한자를 사용하여 선언
		
		System.out.println("=========================");
		
		Person3 p2 = new Person3();
		// => Person3 클래스의 모든 멤버변수에 private 접근제한자가 적용되므로
		//    외부클래스에서 인스턴스를 통해 접근할 때 멤버변수가 보이지 않음.
		//    => The field Person3.변수명 is not visible
//		p2.name = "홍길동"; // 오류발생! 멤버변수 name값 변경 불가
//		p2.age = -20; // 오류발생! 멤버변수 age값 변경 불가
		

	} // main() 메서드 끝
	
} // Ex2 클래스 끝

class Person2 {
	// 멤버변수 등에 접근제한자를 생략할 경우 기본 접근제한자 default가 적용됨 
	String name; // default 접근제한
	int age; // default 접근제한
}

class Person3 {
	// 외부에서 멤버변수 값을 변경하지 못하도록 접근 제한을 위해
	// 멤버변수 선언부 앞에 private 접근제한자를 붙일 수 있다!
	private String name;
	private int age;
	
	// private 접근제한자가 적용된 멤버변수는 외부에서 접근이 불가능하므로
	// 멤버변수에 값을 저장할 수가 없게 됨!
	// => 따라서, 해당 변수 값에 대신 접근해주는 메서드를 정의하여
	//    외부와 상호작용을 통해 멤버변수를 간접적으로 제어하도록 할 수 있다!
}



