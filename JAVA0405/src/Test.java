
public class Test {

	public static void main(String[] args) {
		/*
		 * < 메서드 정의 기본 문법>
		 * [제한자] 리턴타입 메서드명([매개변수선언..]) {
		 * 		// 메서드 호출 시 수행할 코드들..
		 * 		[return [리턴값];]
		 * }
		 * 
		 * < 메서드 형태 4가지 >
		 * 1. 파라미터도 없고, 리턴값도 없는 메서드
		 * 2. 파라미터는 없고, 리턴값만 있는 메서드
		 * 3. 파라미터만 있고, 리턴값은 없는 메서드
		 * 4. 파라미터도 있고, 리턴값도 있는 메서드
		 */
		
		/*
		 * 메서드 유형 1번 연습
		 * => 파라미터도 없고, 리턴값도 없는 메서드
		 * 
		 * => 메서드가 호출되면 자신의 이름을 10번 출력하는 printName() 메서드
		 */
		// ------------- 메서드 호출 위치----------
		printName();
		
		System.out.println("===================================");
		
		/*
		 * 메서드 유형 2번 연습
		 * => 파라미터는 없고, 리턴값은 있는 메서드
		 * => 메서드가 호출되면 10 + 20 값을 리턴하는 sum() 메서드
		 */
		// ------------- 메서드 호출 위치 ----------
//		int result = sum();
//		System.out.println(result);
		System.out.println(sum());
		
		System.out.println("================================");
		
		/*
		 * 3. 파라미터만 있고, 리턴값은 없는 메서드 호출
		 *    => 문자열을 1개 전달하면 해당 문자열을 출력하는 print() 메서드 호출
		 */
		// ------------- 메서드 호출 위치 ----------
		print("아이티윌 부산교육센터");
		
		// => 정수를 1개 전달하면 해당 정수에 대해 "홀수", "짝수" 판별하는
		//    checkNumber() 메서드 호출
		checkNumber(1);
		
		

	} // main() 메서드 끝
	
	// ----------- 메서드 정의 위치 -------------
	public static void printName() {
		// 이름 10번 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println("강진석");
		}
	} // printName() 메서드 끝
	
	public static int sum() {
		// 10 + 20 결과값을 리턴
//		return 10 + 20;
		
		int sum = 10 + 20;
		return sum;
	} // sum() 메서드 끝
	
	public static void print(String str) {
		System.out.println(str);
	} // print() 메서드 끝
	
	// ==============================================
	// 3. 파라미터만 있고, 리턴값은 없는 메서드 정의
	// => 정수를 1개 전달받아 해당 정수에 대해 "홀수" "짝수" 판별하는
	// checkNumber() 메서드 정의
	public static void checkNumber(int num) {
		if(num % 2 == 1) {
			System.out.println(num + " : 홀수!");
		} else {
			System.out.println(num + " : 짝수!");
		}
	} // checkNumber() 메서드 끝
	
	
	
	

} // Test 클래스 끝
