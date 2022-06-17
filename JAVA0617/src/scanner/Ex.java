package scanner;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Scanner
		 * - 화면, 파일, 문자열과 같은 입력소스로부터 문자데이터를
		 *   읽어오는데 사용되는 클래스
		 * - 여러형태의 생서자를 오버로딩하여 지원하므로 다양한
		 *   입력소스로부터 데이터를 읽을 수 있다.
		 *   (ex. scanner(String source), scanner(file source) 등)
		 * - 정규포현식(Regular expression)을 이용한 라인단위의 검색을 지원한다.
		 * - nextXXX() 메서드를 통해 입력을 받고 이를 다시 변환하는 수고를 덜어준다.
		 *   (ex. nextInt() : int, nextLine() : String)
		 * - Scanner 를 사용하기 위해서는 java.util.Sanner import 필요
		 * 
		 * < Scanner 설정 문법 >
		 * Scanner 변수 = new Scanner(); // 입력을 받을 시 System.in 활용
		 * 변수.nextXXX() 메서드를 호출하여 입력 받음
		 */

		Scanner scan = new Scanner(System.in);
		String input = "";
		do {
			System.out.println("원하는 값을 입력하세요. 프로그램을 종료하려면 Q를 입력하세요 : ");
			
//			input = scan.next();
			// => 입력한 값을 input 변수에 대입
			// => 공백을 허용하지 않음
			// => 아이티윌 아이티윌 : 아이티윌만 출력
			
			input = scan.nextLine();
			// => 라인 전체를 문자열로 인식함
			// => 아이티윌 아이티윌 : 아이티윌 아이티윌 출력
		
			System.out.println("입력하신 값은 " + input + " 입니다.");
			
			
		} while(!input.equals("Q"));
		
	}

}








