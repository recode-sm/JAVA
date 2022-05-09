
public class Ex {

	// main()메서드는 자바 프로그램의 시작점이다!
	// => main() 메서드에서부터 객체를 생성하고 사용할 수 있다!
	// 단, main() 메서드에서만 가능한 것은 아니고
	// main() 메서드 호출하는 다른 메시드에서도 사용 가능
	public static void main(String[] args) {
		/*
		 * 정의한 클래스는 설계도에 해당하므로 실제 사용을 하기 위해서는
		 * 반드시 실체(=객체)를 생성해야한다!
		 * => 클래스를 사용하여 메모리에 생성된 객체(실체)를
		 *    인스턴스(Instance)라고 함
		 *    
		 * < 클래스에 대한 인스턴스 생성 기본 문법 >
		 * 클래스명 변수명 = new 클래스명();
		 * 
		 * < 인스턴스 접근 기본 문법(멤버변수 접근 및 메서드 호출) >
		 * 참조변수명.멤버변수 또는 참조변수명.메서드()
		 */
		
		// Animal 클래스의 인스턴스 생성 과정
		// 1. Animal 클래스 타입 참조변수 선언
//		Animal ani;
		
		// 2. Animal 클래스 인스턴스 생성 및 주소값 저장
//		ani = new Animal();
		
		// 위의 두 문장을 한 문장으로 결합
		Animal ani = new Animal();
		
		// Animal 인스턴스에 접근하여 멤버변수 사용 및 메서드 호출
		// => 인스턴스 접근을 위해서는 반드시 인스턴스 주소가 필요하며,
		//    인스턴스 주소를 담고 있는 참조변수(ani)를 통해 접근이 가능함
		// 1. Animal 인스턴스의 멤버변수 name과 age에 값 저장
//		name = "멍멍이"; // 컴파일 에러 발생! 존재하지 않는 변수이므로 사용 불가
		// => 반드시 참조변수명.멤버변수 형태로 접근해야 한다!
		ani.name = "멍멍이"; // ani 인스턴스의 멤버변수 name에 "멍멍이" 저장
		System.out.println("이름 : " + ani.name);
		
		ani.age = 3;
		System.out.println("나이 : " + ani.age);
		
		ani.cry();
		
		System.out.println("-----------------------");
		
		// Animal 클래스의 두 번째 인스턴스(ani2) 생성
		// => 멤버변수 초기화 - 이름: 냐옹이, 나이: 2
		
		Animal ani2 = new Animal();
		ani2.name = "냐옹이";
		System.out.println("이름 : " + ani2.name);
		
		ani2.age = 2;
		System.out.println("나이 : " + ani2.age);
		
		ani2.cry();
		
		//--------------------------------------------------
		// 위의 두 인스턴스(ani, ani2) 구조
		//--------------------------------------------------
		// new
		// Animal 클래스 => 인스턴스1(ani) 인스턴스2(ani2)
		// 이름(name) "멍멍이" "냐옹이"
		// 나이(age) 3 2
		//--------------------------------------------------
		
		System.out.println("==================================");
		// Car 클래스의 인스턴스(car) 생성 및 멤버변수 초기화 후 출력
		// 제조사: 현대
		// 모델명: 그랜져
		// 배기량: 3000
		Car car = new Car();
		// => Heap 메모리 공간에 생성된 인스턴스 주소가 참조변수 car에 저장
		
		car.company = "현대";
		car.modelName = "그런져";
		car.cc = 3000;
		System.out.println("제조사 : " + car.company);
		System.out.println("모델명 : " + car.modelName);
		System.out.println("배기량 : " + car.cc);
		
		car.speedUp();
		
		System.out.println("-----------------------------");
		
		Car car2 = new Car();
		car2.company = "현대";
		car2.modelName = "제네시스";
		car2.cc = 3400;
		System.out.println("제조사 : " + car2.company);
		System.out.println("모델명 : " + car2.modelName);
		System.out.println("배기량 : " + car2.cc);
		
		car2.speedDown();
		
		System.out.println("==============================");
		
		// Student 클래스 인스턴스 생성
		// - 이름 : "홍길동", 번호 : 1, 과정명 : 자바(Java)스프링(Spring) 웹개발자 양성
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.id = 1;
		s1.className = "자바(Java)스프링(Spring) 웹개발자 양성";
		System.out.println("이름 : " + s1.name);
		System.out.println("번호 : " + s1.id);
		System.out.println("과정명 : " + s1.className);
		
		s1.rest();
		
		System.out.println("-------------------------------------");
		
		Student s2 = new Student();
		s2.name = "강진석";
		s2.id = 2;
		s2.className = "자바(Java)스프링(Spring) 웹개발자 양성";
		System.out.println("이름 : " + s2.name);
		System.out.println("번호 : " + s2.id);
		System.out.println("과정명 : " + s2.className);
		
		s2.study("자바");
		
		// Student 클래스 인스턴스2 생성
		// - 자신의 이름, 번호, 과정명 저장 후 출력
		
		
	} // main() 메서드 끝

} // Ex 메서드 끝

// 하나의 java 파일 내에 여러 개의 클래스를 정의할 수 있다!
// => 단! 파일명과 동일한 이름의 클래스 외에는 public 키워드 붙일 수 없다!
// 학생(Student) 클래스 정의
// 속성: 이름(name, 문자열), 번호(id, 정수), 과정명(className, 문자열)
// 메서드
// 1) 공부(study()) - 리턴값 없음, 매개변수 - 과목명(subjectName, 문자열)
//					  => "subjectName 과목 공부중!" 출력 
// 2) 휴식(rest()) - 리턴값 없음, 매개변수 없음 => "휴식!" 출력

class Student {
	//멤버변수 선언
	String name;
	int id;
	String className;
	
	//메서드 정의
	
	// 3. 파라미터 값 있고, 리턴값은 없는 메서드 정의
	public void study(String subjectName) {
		// 전달받은 파라미터 값을 사용하여 출력
		System.out.println( subjectName + " 과목 공부중!");
	}
	
	
	// 1. 파라미터 값 없고, 리턴값도 없는 메서드 정의
	public void rest() {
		System.out.println("휴식!");
	}
	
}









