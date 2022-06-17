package regular_expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 정규표현식(Regular Expression)
		 * - 텍스트 데이터 중에서 원하는 조건(패턴, pattern)과 일치하는
		 *   문자열을 찾아 내기 위해 사용하는 것
		 * - 미리 정의된 기호와 문자를 이용하여 작성한 문자열
		 * - 정규식을 이용하면 많은 양의 텍스트 파일 중에서 원하는 데이터를
		 *   손쉽게 뽑아내거나 입력된 데이터가 형식에 맞는지 체크할 수 있다.
		 *   
		 * 정규표현식을 활용하는 클래스
		 * 1. java.util.regex.Pattern 클래스
		 *  - 정규표현식 문자열을 컴파일한 후 객체로 관리
		 *  - 해당 객체를 활용하여 전체 문자열이 정규표현식과 일치하는 판별 가능
		 *    ex) 전화번호 형식 검증, 패스워드 길이 규칙 검증 등
		 *        => 단, 패스워드 복잡도 검사 등의 부분 규칙 검사 불가
		 *  - 공개된 생성자가 없으며, Pattern 클래스의 static 메서드인
		 *    complie() 메서드를 통해 객체를 리턴받아 사용
		 *  - Pattern 클래스의 static 메서드인 matches() 메서드를 사용하여
		 *    정규표현식과 일치하는지 판별 가능
		 * 2. java.util.regex.Mather 클래스
		 *  - 부분 규칙 검사 가능
		 */
		
		// ---------------------------------
		// 1. 한글 이름(2 ~ 5자) 검증
		String name = "홍길동";
		String nameRegex = "^[가-힣]{2,5}$";
//		
//		if(Pattern.matches(nameRegex, name)) {
//			System.out.println("올바른 한글 이름입니다!");
//		} else {
//			System.out.println("잘못된 한글 이름입니다!");
//		}
		
		System.out.println("----------------------------------");
		
		// 2. 이름을 입력받아 검증
//		Scanner sn = new Scanner(System.in);
//		String inputName = "";
//		System.out.println("이름을 입력하세요 : ");
//		inputName = sn.next();
//
//		if(Pattern.matches(nameRegex, inputName)) {
//			System.out.println("올바른 한글 이름입니다!");
//		} else {
//			System.out.println("잘못된 한글 이름입니다!");
//		}
		
		System.out.println("------------------------------");
		
		// 영문자(대문자 또는 소문자) 판별 정규표현식
//		String engRegex = "[A-Za-z]";
		// 영문 대문자와 소문자를 별도로 구분하여 판별하는 정규표현식
		String engUpperRegex = "[A-Z]"; // 대문자
		String engLowerRegex = "[a-z]"; // 소문자
		
		// 숫자를 판별하는 정규표현
		String numRegex = "[0-9]";
		
		//특수문자(!@#$%) 판별하는 정규표현식
		String specRegex = "[!@#$%]";
		
		// 패스워드 길이를 판별하는 정규표현식
		// => 영문자(대문자,소문자), 숫자, 특수문자(!@#$%) 조합 8 ~ 16자리로 시작하고 끝
		String lengthRegex = "^[A-Za-z0-9!@#$%]{8,16}$";
		
		System.out.println("------------------------------");
		// 3. 패스워드 입력받아 검증
//		System.out.println("패스워드 입력 : ");
//		Scanner sp = new Scanner(System.in);
//		String password = sp.next();
//		
//		if(Pattern.matches(lengthRegex, password)) {
//			System.out.println(password + " : 길이 규칙 적합!");
//		} else {
//			System.out.println(password + " : 길이 규칙 부적합!");
//		}
		
		System.out.println("------------------------------");
//		// 4. 길이 규칙에 적합일 경우 영문자가 포함되어 있는지 확인 
//		//    있다면 보안레벨을 1 증가
//		System.out.println("패스워드 입력 : ");
//		Scanner sp = new Scanner(System.in);
//		String password = sp.next();
//		int securityLevel = 0;
//		
//		if(Pattern.matches(lengthRegex, password)) {
//			System.out.println(password + " : 길이 규칙 적합!");
//			if(Pattern.compile(engUpperRegex).matcher(password).find()) {
//				System.out.println("대문자가 포함되어 있으므로 보안 등급 +1 증가");
//				securityLevel++;
//			}
//		} else {
//			System.out.println(password + " : 길이 규칙 부적합!");
//		}
//		
//		System.out.println("보안 등급은 " + securityLevel + "");
//		
//		switch(securityLevel) {
//			case 1 : System.out.println("위험!"); break;
//			default : System.out.println("사용 불가능한 패스워드!");
//		}
		
		System.out.println("------------------------------");
		
		// 5. 다수의 문자가 포함되어 있는지 확인
		System.out.println("패스워드 입력 : ");
		Scanner sp = new Scanner(System.in);
		String password = sp.next();
		int securityLevel = 0;
		
		if(Pattern.matches(lengthRegex, password)) {
			System.out.println(password + " : 길이 규칙 적합!");
			if(Pattern.compile(engUpperRegex).matcher(password).find()) {
				System.out.println("대문자가 포함되어 있으므로 보안 등급 +1 증가");
				securityLevel++;
			}
			
			if(Pattern.compile(engLowerRegex).matcher(password).find()) {
				System.out.println("소문자가 포함되어 있으므로 보안 등급 +1 증가");
				securityLevel++;
			}
			
			if(Pattern.compile(numRegex).matcher(password).find()) {
				System.out.println("숫자가 포함되어 있으므로 보안 등급 +1 증가");
				securityLevel++;
			}
			
			
		} else {
			System.out.println(password + " : 길이 규칙 부적합!");
		}
		
		System.out.println("보안 등급은 " + securityLevel + "");
		
		switch(securityLevel) {
			case 3 : System.out.println("안전!"); break;
			case 2 : System.out.println("보통!"); break;
			case 1 : System.out.println("위험!"); break;
			default : System.out.println("사용 불가능한 패스워드!");
		}
		
		
	}

}

















