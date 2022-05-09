
public class Test2 {

	public static void main(String[] args) {
		// Manager 인스턴스 생성
		Manager m = new Manager("홍길동", 4000, "개발팀");
				
		// getManager() 메서드 호출
		System.out.println(m.getManager());

	}

}

/*
 * 직원(Employee) 클래스
 * 멤버변수
 *  - 직원이름(name, 문자열)
 *  - 연봉(salary, 정수)
 * 메서드
 *  - 직원 정보를 문자열로 결합하여 리턴하는 getEmployee() 메서드 정의
 *    (파라미터값 없음, 리턴값 있음)
 *    => 직원이름과 연봉을 문자열로 결합하여 리턴(홍길동,3000)
 */

class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name + " , " + salary;
	}
}

/*
 * Employee 클래스를 상속받는 Manager 클래스 정의
 * - 이름, 연봉, 부서명(depart, 문자열) 멤버변수
 * - 이름, 연봉, 부서명을 문자열로 결합하여 리턴하는 getManager() 메서드
 * - 인스턴스 생성 시 직원이름, 연봉, 부서명의 초기값을 전달 받아 생성
 */

class Manager extends Employee {
	String depart;
	
//	public Manager() {} 
	// 생성자를 정의하면 기본 생성자는 자동으로 생성되지 않음
	
	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	public String getManager() {
		return getEmployee() + " , " + depart;
	}
	
}






