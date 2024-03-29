
public class Ex3 {

	public static void main(String[] args) {
		/* <식별자 작성 규칙>
		   <필수>
			1. 첫 글자는 숫자 사용 불가
			2. 특수문자는 $(달러) 또는 _(언더스코어) 만 사용 가능
			3. 대소문자 구별
			4. 키워드(예약어) 사용 불가
			5. 공백 사용 불가
			---------------------------------------------------------------------
		   <권장사항>
			6. 의미가 있는 단어 사용
			7. 변수명의 첫 단어는 소문자로 작성하고, 두 번째 단어부터 첫 글자는
			   모두 대문자로 작성
    		    => Camel-case 표기법 사용
    		e.g.) studentName
    		(참고. 클래스명은 첫 단어도 첫 글자를 대문자로 표기 => Pascal-case 표기법)
			8. 길이 제한 없음.
			9. 한글 사용 가능하지만 사용하지 않음.
		 * 
		 */
		
		//1. 첫 글자는 숫자 사용 불가
//		int 7eleven; //사용 불가
		int sevenEleven; //사용 가능
		
		//2. 특수문자는 $(달러) 또는 _(언더스코어) 만 사용 가능
		int $ystem; //사용 가능
		int my_name; //사용 가능
//		int channel#5 //사용 불가!($ 또는 _ 만 가능)
		
		//3. 대소문자 구별
		int age; //소문자 age와
		int AGE; //대문자 AGE는 다른 식별자로 취급됨.
		
		//4. 키워드(예약어) 사용 불가
//		int int;
//		int switch;
//		int char;
		
		//5. 공백 사용 불가
//		int my name; //사용 불가
		
		//6. 한글 사용 가능
		int 나이;
		
		//변수 선언 및 초기화
//		int b; //변수 b 선언
//		b = 10; //변수 b에 정수 10을 초기화
//		System.out.println(b);
		
		//변수 선언 및 초기화를 동시에 진행
		int b = 10;
		System.out.println(b);
		
	}

}
