package nested_class;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 익명 클래스(annoymous class)
		 * - 이름이 없는 객체
		 * - 클래스 선언과 객체의 생성을 동시에 하기 때문에 단 한번 사용될 수 있고
		 *   오직 하나의 객체만을 생성할 수 있는 일회용 클래스
		 * - 이름이 없기 때문에 생성자도 가질 수 없다.
		 * - 부모클래스의 이름이나 구현하고자 하는 인터페이스의 이름을 사용해서 정의하므로
		 *   하나의 클래스로 상속받는 동시에 인터페이스를 구현하거나 하나 이상의
		 *   인터페이스를 구현할 수 없다.
		 * - 하나의 단 하나의 클래스를 상속받거나 단 하나의 인터페이스만 구현할 수 있음.
		 * 
		 * < 익명 클래스 문법 >
		 * new 슈퍼클래스이름() {
		 * 		// 멤버 선언
		 * }
		 * 
		 * 또는
		 * new	구현인터페이스이름() {
		 * 		// 멤버 선언
		 * }
		 * 
		 */
		

	}

}

class AnnoymousClass {
	Object o = new Object(){ void method() {} };
	
	static Object o2 = new Object() { void method() {} };
	
	public void myMethod() {
		Object o3 = new Object(){ void method() {} };
	}
}








