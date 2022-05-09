
public class Test2 {

	public static void main(String[] args) {
		// 1. 파라미터도 없고, 리턴값도 없는 메서드 호출 연습
		// "Hello, World!" 문자열을 10번 출력하는 printHello() 메서드 호출
		printHello();
		
		// 구구단 2단 ~ 9단까지 출력하는 gugudan() 메서드 호출
		gugudan();
		
		System.out.println("===================================");
		
		// 2. 파라미터는 없고, 리턴값은 있는 메서드 호출 연습
		// 1 ~ 10까지 정수의 합(55)을 계산하여 리턴하는 sum() 메서드 호출하고,
		// 리턴되는 정수의 합(55)을 변수 total에 저장 후 출력
		int total = sum();
		System.out.println("1 ~ 10까지 정수의 합 : " + total);
		
//		System.out.println("1 ~ 10까지 정수의 합 : " + sum());
		
		System.out.println("-------------------------------------");
		
//		System.out.println("오늘의 날씨 : " + getWeather());
		
		String todayWeather = getWeather();
		System.out.println("오늘의 날씨 : " + todayWeather);
		
	} // main() 메서드 끝

	public static void printHello() {
		// printHello() 메서드가 호출되면 "Hello, World!" 문자열 10번 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "번째 : Hello, World!");
		}
	} // printHello() 메서드 끝
	// ---------------------------
	// 구구단 2단 ~ 9단까지 출력하는 gugudan() 메서드 정의
	// => 리턴값이 없으므로 리턴타입에 void 타입 명시
	// => 파라미터가 없으므로 메서드 선언부 소괄호 안에 아무것도 명시하지 않음.
	public static void gugudan() {
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(" < " + dan + "단 >");
			
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			System.out.println();
		}
	} // gugudan() 메서드 끝
	
	// 2. 파라미터는 없고, 리턴값만 있는 메서드 정의 연습
	// 1 ~ 10까지 정수의 합(55)을 계산하여 리턴하는 sum() 메서드 정의
	// => 메서드 파라미터가 없으므로 선언부 소괄호() 안에 아무것도 명시하지 않음
	//    리턴타입 부분에 정수를 리턴하는 int타입을 명시
	public static int sum() {
		// 1 ~ 10까지 정수의 합을 계산하여 결과값을 리턴
		int total = 0;
		for(int i = 1; i <= 10; i++) {
			total += i; // total = total + i;
		}
		
		return total;
	}
	// --------------------------------------
	// 오늘의 날씨("맑음")를 문자열로 리턴하는 getWeather() 메서드 정의
	public static String getWeather() {
//		return "맑음";
		
		String today = "맑음";
		return today;
	}
	
} // Test2 클래스 끝







