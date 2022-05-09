
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 생성자 오버로딩
		 * - 메서드 오버로딩과 동일
		 * - 생성자 호출 시 다양한 형태의 파라미터를 전달하여
		 *   객체를 다양하게 초기화 하는 목적
		 */
		
		// 파라미터 생성자를 하나라도 정의할 경우
		// 컴파일러에 의해 기본 생성자가 자동으로 생성되지 않음.
		// 따라서, 기본 생성자를 호출해야 하는 경우 직접 기본 생성자를 정의!
		Person2 p = new Person2();
		p.showPersonInfo();
		
		System.out.println("------------------------------");
		
		Person2 p2 = new Person2("홍길동", "901010-1234567");
		p2.showPersonInfo();
		
		System.out.println("------------------------------");
		
		Person2 p3 = new Person2("한국", "홍길동", "901010-1234567");
		p3.showPersonInfo();

	}

}

class Person2 {
	String nation;
	String name;
	String jumin;
	
	public Person2() {
		System.out.println("Person2() 생성자 호출됨!");
	}
	
	// 국가는 자동으로 "대한민국"으로 초기화하고
	// 파라미터 2개(name, jumin)를 전달받아 초기화하는 생성자 정의
	public Person2(String newName, String newJumin) {
		System.out.println("Person2(String, String) 생성자 호출됨!");
		nation = "대한민국";
		name = newName;
		jumin = newJumin;
	}
	
	// 파라미터 3개(nation, name, jumin)를 전달받아 초기화하는 생성자 정의
	public Person2(String newNation ,String newName, String newJumin) {
		System.out.println("Person2(String, String, String) 생성자 호출됨!");
		nation = newNation;
		name = newName;
		jumin = newJumin;
	}
	
	// 국가명, 이름, 주민번호를 출력하는 showPersonInfo() 메서드 정의
	public void showPersonInfo() {
		System.out.println("국가 : " + nation);
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + jumin);
	}
	
}









