
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * - 생성자 : 클래스명과 이름이 같고 리턴타입이 없는 메서드의 일종
		 * - 생성자는 상속되지 않음.
		 *   => 상속받을 경우 자신의 클래스 이름과 생성자 이름이 다르기 때문에
		 *      생성자 정의 규칙을 위반하게 됨.
		 * - 상속 관계에서 인스턴스를 생성할 때
		 *   서브클래스의 인스턴스가 생성되기 전에 슈퍼클래스의 인스턴스를
		 *   먼저 생성한 후 서브클래스의 인스턴스를 생성함.
		 *   => 서브클래스의 생성자가 호출되면 가장 먼저
		 *      슈퍼클래스의 생성자를 호출하여 슈퍼클래스의 인스턴스를 생성하고
		 *      그 후에 서브클래스의 인스턴스가 생성되어 생성자 코드가 실행됨.
		 */
		
		Manager m = new Manager();
		/*
		 * Manager 인스턴스를 생성하는 과정
		 * => 서브클래스의 인스턴스를 생성하는 과정에서
		 *    서브클래스 생성자에서 인스터스 생성 전 슈퍼클래스의 생성자 호출
		 *    즉, 슈퍼클래스의 인스턴스가 생성된 후 서브클래스의 인스턴스 생성됨
		 * 1) new Manager() 코드에 의해서 Manager() 생성자로 이동
		 * 2) Manager() 생성자에서 슈퍼클래스 Employee의 생성자 Employee() 호출
		 *    => super(); 가 자동으로 생성됨
		 * 3) Employee() 생성자에서 슈퍼클래스 Object의 생성자 Object() 호출
		 * 4) Object 인스턴스가 생성되고, Object() 생성자 내의 코드 실행됨.
		 * 5) Empolyee 인스턴스가 생성되고, Employee() 생성자 내의 코드 실행됨.
		 * 6) Manager 인스턴스가 생성되고, Manager() 생성자 내의 코드 실행됨.
		 */
		
		System.out.println("-------------------------");
		
		// Employee 클래스의 이름, 연봉을 전달하는 생성자는
		// Manager 클래스에 상속되지 않으므로 호출할 수 없다!
//		Manager m2 = new Manager("홍길동", 4000); //컴파일에러 발생!
		Manager m2 = new Manager("홍길동", 4000, "개발팀");

	}

}

class Employee {
	String name;
	int salary;
	
	
	public Employee() {
		super(); // Object() 생성자 호출됨
		System.out.println("Empolyee() 생성자 호출됨!");
	}
	
	// 만약, 파라미터 생성자를 정의했을 때 기본 생성자가 없을 경우
	// 서브클래스의 생성자에서 기본적으로 슈퍼클래스의 기본생성자를 호출하므로
	// 서브클래스의 생성자에서 컴파일러 에러가 발생할 수 있음!
	// => 슈퍼클래스의 파마리터 생성자를 정의할 때 기본 생성자도 정의 필요
	
	// 이름, 연봉을 전달받아 초기화하는 파라미터 생성자 정의
	public Employee(String name, int salary) {
		super();
		System.out.println("Employee(String, int) 생성자 호출됨");
		this.name = name;
		this.salary = salary;
	}
	
	public void showEmployeeInfo() {
		System.out.printf("%s , %d \n", name, salary);
	}

	
}

// Employee 클래스를 상속받는 서브클래스 Manager 클래스 정의
class Manager extends Employee {
	// 만약, Employee 클래스의 파라미터 생성자만 정의한다면
	// 슈퍼클래스의 파라미터 생성자의 정의로 기본 생성자가 만들어지지 않아 오류 발생!
	// Implicit super constructor Employee() is undefined for default constructor.
	// Must define an explicit constructor
	
	String depart; // 부서명
	
	public Manager( ) {
		super(); // Employee의 기본 생성자 호출
		// 서브클래스의 생성자를 호출하게 되면
		// 내부적으로 가장 먼저 슈퍼클래스의 기본생성자를 자동으로 호출하게 됨
		// => 슈퍼클래스 생성자의 작업이 종료된 후 서브클래 생성자의 작업 수행
		System.out.println("Manager() 생성자 호출됨");
	}
	
	public Manager(String name, int salary, String depart) {

		System.out.println("Manager(String,int,String) 생성자 호출됨");
		
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	public void showManagerInfo() {
		System.out.printf("%s , %d , %s \n", name, salary, depart);
	}
	
}









