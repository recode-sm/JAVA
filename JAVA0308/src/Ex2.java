
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 정수 데이터의 진법 표현
		 * - 각 진법(10진법)의 숫자로 표기해야 하는 경우 정수 앞에
		 *   접두사를 붙여서 진법을 나타냄.
		 *   
		 * 1. 10진수: 정수 그대로 표현
		 * 2. 2진수: 정수 앞에 접두사 0b 붙임(0b1111)
		 * 3. 8진수: 정수 앞에 접두사 0 붙임(0777)
		 * 4. 16진수: 정수 앞에 접두사 0x 붙임(0x1A)
		 * => 8진수 앞에 숫자 0이 붙는데 0으로 시작하는 숫자
		 *    가령 전화번호등을 정수 리터럴로 표현할 때 문제가 발생할 수 있음. 
		 */
		System.out.println(15); //10진수 15
		System.out.println(0b1111); //2진수 1111 => 10진수 15로 변환되어 출력
//		System.out.println(0b1112); //오류발생: 2진수는 0또는 1만 사용이 가능!
		
		System.out.println(017); // 8진수 17 => 10진수 15로 변환되어 출력
//		System.out.println(018); //오류발생: 8진수는 0~7 사이의 숫자만 사용 가능!
		
		System.out.println(0xF); //16진수 F => 10진수 15로 변환되어 출력
//		System.out.println(0xG); //오류발생: 16진수는 0~F 사이의 숫자만 사용 가능!
				
		
	}

}
