
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 변수(Variable)
		 * - 데이터를 저장하는 메모리 공간
		 * - 변수 공간에는 한 번에 하나의 데이터만 저장 가능하며,
		 *   새로운 데이터를 저장하면 기존의 데이터는 제거됨.
		 * - 변수를 사용하기 위해서는 반드시 변수를 선언한 후에 저장 가능.
		 * - 데이터를 저장하는 작업을 '변수의 초기화'라고 함.
		 *   => 변수 초기화 작업 없이 변수 사용 불가능
		 * - 변수명을 작성할 때는 '식별자 작성 규칙'을 따름
		 * 
		 * <변수 선언 기본 문법>
		 * 데이터타입 변수명;
		 * 
		 * <변수 초기화 기본 문법>
		 * 변수명 = 데이터;  
		 * 
		 * <변수 사용법>
		 * 변수 사용을 위해서는 특정 작업에 변수명을 지정하면
		 * 해당 변수에 저장된 값을 사용할 수 있다!
		 */
		
		//변수 선언
		int a; //int형 데이터를 저장할 공간을 생성하고, 이름을 a라고 지정
		
		//변수 초기화(반드시 변수 선언 후에 초기화 가능)
		a = 10;
//		오류 발생: a cannot be resolved to a variable
//		해결 방법: 변수를 선언
		
		//변수에 접근하여 값을 출력하기(반드시 초기화 후에 사용 가능)
		System.out.println(a);
//		오류 발생: The local variable a may not have been initialized
//		해결 방법: 변수 초기화
		
		//변수에 새로운 값(데이터)을 저장하면, 기존의 값(데이터)는 제거됨.
		a = 99; //기존에 저장된 정수 10을 버리고 새로운 정수 99로 교체
		
		System.out.println(a); //교체된 정수 99 출력됨.
		
	}

}
