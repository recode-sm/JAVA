
public class Test {

	public static void main(String[] args) {
		/*
		 * 4. 파라미터도 있고, 리턴값도 있는 메서드 호출
		 * => 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수"를 판별하고
		 *    판별 결과를 문자열로 리턴하는 checkNumber2() 메서드 호출
		 *    
		 */
		String result = checkNumber2(2);
		System.out.println("판별결과 : " + result);
		
		/*
		 * 5. 파라미터가 복수개 있고, 리턴값도 있는 메서드 호출
		 *    정수 2개를 전달하면 두 정수의 합을 리턴하는 sum()메서드를 호출
		 *    ex) sum(10,20) 전달 시 10 + 20 결과인 30이 리턴
		 *    ----------------------------------------------------------------- 
		 *    (산술)연산자 문자 1개와 정수 2개를 전달하면
		 *    두 정수에 대한 어떤 연산을 수행한 후
		 *    결과값을 리턴하는 operation()메서드를 호출하고 리턴되는 값을 출력
		 *    ex) 메서드('+',10,20) 전달 시 10 + 20 결과인 30이 리턴
		 *        메서드('-',10,20) 전달 시 10 - 20 결과인 -10이 리턴
		 *    
		 */
		// sum()메서드 호출
		int result2 = sum(10,20);
		System.out.println("계산 결과 : " + result2);
		
		System.out.println("===========================");
		
		// operation()메서드 호출
		int result3 = operation('+', 10, 20);
		System.out.println("연산 결과 : " + result3);
		
		result3 = operation('-', 10, 20);
		System.out.println("연산 결과 : " + result3);
		
		result3 = operation('A', 10, 20);
		System.out.println("연산 결과 : " + result3);
		

	} // main() 메서드 끝
	
	public static String checkNumber2(int num) {
//		if(num % 2 == 1) {
//			return "홀수";
//		} else {
//			return "짝수";
//		}
		// ------------------------------
//		if(num % 2 == 1) {
//			return "홀수";
//		} else if(num % 2 == 0) {
//			return "짝수";
//		}
//		
//		return "";
		// ------------------------------
		// if문과 else if 문 내에서 직접 리턴하지 않고
		// 리턴 데이터를 별도의 변수에 저장한 후, if문 종료 후 return 수행
		String result = "";
		
		if(num % 2 == 1) {
			result = "홀수";
		} else if(num % 2 == 0) {
			result = "짝수";
		}
		
		return result;
		
	} // checkNumber2()메서드 끝
	
	public static int sum(int num1, int num2) {
		System.out.println("숫자1 = " + num1);
		System.out.println("숫자2 = " + num2);
		return num1 + num2;
	} // sum() 메서드 끝
	
	public static int operation(char opr, int num1, int num2) {
		// 연산자 문자(char 타입) 판별(== 사용)
//		if(opr == '+') { // 덧셈
//			return num1 + num2;
//		} else if(opr == '-') { // 뺄셈
//		    return num1 - num2;
//		} else {
//			// 잘못된 연산자가 입력되었을 경우
//			// 오류 메시지 출력 후 0 리턴(가정)
//			System.out.println("연산자가 올바르지 않습니다.");
//			return 0;
//		}
		
		int result = 0;
		if(opr == '+') { // 덧셈
			result =  num1 + num2;
		} else if(opr == '-') { // 뺄셈
		    result = num1 - num2;
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		return result;
		// 주의! 변수 값을 리턴하는 경우 반드시 변수값 초기화 필수!!
	} // operation() 메서드 끝
	
	
} // Test 클래스 끝








