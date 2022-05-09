
public class Ex {

	public static void main(String[] args) {
		/*
		 * 데이터타입(Data Type) = 자료형
		 * - 사용할 데이터의 종류를 구분해 놓은 것
		 * - 기본 데이터타입(Primitive Type = 기본형)
		 * - 참조 데이터타입(Reference Type = 참조형)
		 * 
		 * 1. 기본 데이터타입(8가지)
----------------------------------------------------------------------------
					1Byte(8bit)	2Byte(16bit)	4Byte(32bit)	8Byte(64bit)
----------------------------------------------------------------------------					
		 * 논리형	boolean
		 * 정수형	byte		short			int				long
		 * 실수형								float			double
		 * 문자형				char
		 * 
		 * <정수형 데이터타입 표현 범위>
		 * - 메모리 크기에 따라 표현 가능한 정수의 범위 달라짐
		 * - byte(1Byte = 8bit) : 2^8 = 256가지 = -128 ~ +127 표현 가능
		 *   short(2Byte = 16bit) : 2^16 = 65536가지 = -32768 ~ +32767
		 *   int(4Byte = 32bit) : 2^32 = 약 -21억 ~ +21억 => 정수의 기본형
		 *   long(8Byte = 64bit) : 2^64 = 약 -922경 ~ + 922경
		 *   
		 *   
		 *   
		 */
		//byte 타입 변수 b 선언(데이터타입 변수명)
//		byte b;
		//byte 타입 변수 b에 정수 100 저장(변수명 = 데이터)
//		b = 100;
		
		//위의 두 문장(선언 및 초기화)을 한 문장으로 결합
		byte b = 100;
		
		//byte 타입 변수 b의 값을 화면에 출력
		System.out.println(b); //변수 b에 저장된 정수 100 출력됨
		
		b = 127;
//		b = 128;
		// 오류발생: Type mismatch: cannot convert from int to byte
		// byte 타입에 저장 가능한 정수 범위 -128 ~ 127까지
		
		b = -128;
		System.out.println(b);
		
		//short 타입 변수 s를 선언하고 정수 128 저장
		short s = 128;
		System.out.println(s);
		
		s = 32767;
//		s = 32768;
		// 오류발생: Type mismatch: cannot convert from int to byte
		// short 타입 저장 가능한 정수 범위 -32768 ~ 32767까지
		
		//int형 변수 i를 선언하고 정수 32768 저장 후 출력
		int i = 32768;
		System.out.println(i);
		
		i = 2147483647;
//		i = 2147483648;
		//오류발생: The literal 2147483648 of type int is out of range 
		//=> 정수에 접미사가 없으면 기본적으로 int형의 기본범위를 사용
		//=> 최대치가 2147483647 까지만 표기가 가능하다.
		//=> int 범위를 벗어나는 리터럴은 반드시 접미사 L을 붙여서
		//=> long 타입으로 표기해야 한다!!
		
//		i = 2147483648L;
		//오류발생: Type mismatch: cannot convert from long to int
		//long 타입 정수는 int 타입 변수에 저장할 수 없음.
		
		long l = 2147483648L;
		System.out.println(l);
		
		//long 타입 리터럴은 접미사 L을 붙이면 되는데,
		//int 타입보다 크기 않은 정수도 접미사L을 붙이면 long타입으로 취급됨
//		i = 5L;
		//오류발생: Type mismatch: cannot convert from long to int
		//정수값 5는 int 범위에 포함되지만, 접미사 L이 붙어서 long 타입 리터럴이
		//되었으므로 저장 불가능!
		
		long l2 = 100;
		
		System.out.println("======================================");
		/*
		 * 실수형 데이터타입
		 * - 정수 데이터를 표현하는 방법 자체가 달라서 동일한 메모리 크기를
		 *   갖더라도 정수 범위보다 표현 가능한 숫자의 범위가 훨씬 크다.
		 *   => 부동 소수점 데이터 표현방식을 사용.
		 * - 실수 데이터타입
		 *   float(4Byte)
		 *   double(8Byte)
		 */
		
		double d = 3.14; //실수 기본 데이터타입 double
//		float f = 3.14; //오류 발생: Type mismatch: cannot convert from double to float
		// 접미사가 없으면 double 타입으로 인식되므로 float 타입의 변수에 저장 불가!
		
		float f = 3.14f;
		System.out.println(d);
		System.out.println(f);
		
		//boolean 데이터타입: 특수한 값인 true 또는 false 만 사용 가능
		
		boolean bool = true;
		System.out.println(bool);
		bool = false;
		System.out.println(bool);
//		bool = FALSE; //오류 발생!
//		bool = 0; //오류 발생!
		
	}

}
