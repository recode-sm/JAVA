
public class Ex {

	public static void main(String[] args) {
		/*
		 * 파라미터 생성자
		 * - 생성자 호출 시점에서 전달해야할 데이터가 있을 경우
		 *   생성자 파라미터(매개변수)를 선언할 수 있음(= 메서드와 동일)
		 * - 전달받은 데이터는 인스턴스 변수를 초기화하는 용도로 사용
		 * - 즉, 객체마다 다른 데이터를 가진 채로 인스턴스를 생성하기 위해 사용
		 * 
		 * < 파라미터 생성자 정의 기본 문법 >
		 * < 생성자 정의 기본 문법>
		 * [접근제한자] 클래스명(매개변수선언..) {
		 * 		// 생성자 호출 시점에서 파라미터에 데이터를 전달하여
		 * 		// 인스턴스 내의 인스턴스 변수를 초기화함
		 *		   인스턴스변수명 = 데이터;
		 * }
		 * 
		 * => 파라미터 생성자 자동 생성 단축키 : Alt + Shift + S -> O
		 *    (단, 멤버변수가 하나도 없을 경우 자동 생성창 실행되지 않음)
		 * 
		 */
		
		Person p = new Person("강진석", 20);
		p.showPersonInfo();
		// 주의!! 파라미터 생성자를 정의했다면
		// 파라미터 개수에 맞게 인스턴스를 생성해야 함!!
//		Person p = new Person("강진석", 20,"대한민국");
		// 오류발생! The constructor Person(String, int, String) is undefined
		
		System.out.println("-------------------------------");
		
		Person p2 = new Person(); // 오류발생!
		// The constructor Person() is undefined
		// => 파라미터 생성자를 하나라도 정의한다면
		//    컴파일러에 의해 기본 생성자가 자동으로 생성되지 않음!!
		//    기본 생성자를 호출할 수 없게 됨.
		// => 해결책은 기본생성자를 직접 정의를 하면 됨.
		
		p2.showPersonInfo();
		
		System.out.println("-------------------------------");
		
		Person p3 = new Person("이순신",44);
		p3.showPersonInfo();
		
	}

}

class Person {
	// 멤버변수
	String nation;
	String name;
	int age;
	
	// 생성자를 정의하지 않으면 기본 생성자가 자동으로 생성됨
	public Person() {
		System.out.println("기본 생성자 호출됨!");
	}
	
	// String, int 타입 데이터를 전달받는 파라미터 생성자 정의
	public Person(String newName, int newAge) {
		System.out.println("Person(Sting,int) 생성자 호출됨!");
		
		// 전달받은 파라미터값을 인스턴스 변수에 저장
		name = newName;
		age = newAge;
		
		// 만약, 국가명(nation)은 무조건 "대한민국"으로 고정하는 경우
		// 별도로 파라미터 값을 전달받지 않고 생성자 내에서 "대한민국"으로 초기화
		nation = "대한민국";
	}
	
	// 파라미터 생성자 자동 생성 단축키 : Alt + Shift + S -> O
	public Person(String nation, String name, int age) {
		this.nation = nation;
		this.name = name;
		this.age = age;
	}

	
	
	
	// 메서드
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("국가 : " + nation);
	}
	
}





