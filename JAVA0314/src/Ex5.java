
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 증감연산자(++,--)
		 * - 단항연산자
		 * - 수치데이터타입의 피연산자 앞(좌측) 또는 뒤(우측)에 붙어서
		 *   해당 피연산자의 값을 1만큼 증가 또는 감소시키는 연산자
		 * - 다른 연산과 결합하여 사용될 때 위치에 따라 결과가 다름.
		 * 
		 * 1. 선행연산자(전위연산자)
		 * - 피연산자 앞(좌측)에 위치하여 값을 1만큼 증가 또는 감소시킴
		 *   이 때, 다른 연산과 결합하여 사용하는 경우
		 *   먼저 피연산자의 값을 1 증가 또는 감소 시킨 후 다른 연산에 참여함
		 *   ex) ++a, --a
		 *   
		 * 2. 후행연산자(후위연산자)
		 * - 피연산자 뒤(우측)에 위치하여 값을 1만큼 증가 또는 감소시킴
		 *   이 때, 다른 연산과 결합하여 사용하는 경우
		 *   먼저 다른 연산에 참여한 후 피연자의 값을 1 증가 또는 감소시킴
		 *   ex) a++, a--
		 */

		// 정수 a의 값을 1만큼 증가시키는 방법
		byte a = 10;
		
		//1. 일반적인 산술연산자와 대입연산자를 사용하는 방법
//		a = a + 1; //컴파일 에러 발생! (byte + int = int이므로 저장 불가)
		a = (byte)(a + 1);
		
		//2. 확장 대입연산자를 사용하는 방법
		a += 1; //형변환 불필요(연산 과정에서 자동 형변환이 일어나지 않음)
		
		//3. 증감연산자를 사용하는 방법
		a++; //형변환 불필요(연산 과정에서 자동 형변환이 일어나지 않음)
		
		System.out.println(a);
		
		System.out.println("=======================");
		
		int b = 5;
		
		b++; // 변수 b의 값을 1만큼 증가, 5 -> 6으로 증가
		System.out.println(b);
		
		++b; // 변수 b의 값을 1만큼 증가, 6 -> 7로 증가
		System.out.println(b);
		
		b--; // 변수 b의 값을 1만큼 감소, 7 -> 6으로 감소
		System.out.println(b);
		
		--b; // 변수 b의 값을 1만큼 감소, 6 -> 5로 감소
		System.out.println(b);
		
		System.out.println("=======================");
		
		//증감연산자 위치에 따른 연산 과정의 차이
		//=> 다른 연산자와 결합하여 사용될 경우 주의할 점
		
		int x1 = 5;
		int y1 = ++x1; // 전위연산자(선행연산자)
		//=> 변수 x1의 값을 먼저 1만큼 증가시킨 후
		//   대입연산자를 통해 x1의 값을 y1에 대입(저장)
		//=> 따라서, x1 값이 5 -> 6으로 증가한 후 y1에 증가된 값 6이 저장
		System.out.println(x1 + " , " + y1); // 6,6
		
	    int x2 = 5;
	    int y2 = x2++; // 후위연산자(후행연산자)
	    //=> 변수 x2의 값을 먼저 y2에 대입한 후
	    //   증감연산자를 통해 x2의 값을 1만큼 증가시킴
	    //   따라서, x2 값 5가 먼저 y2에 저장된 후, x2 값이 5 -> 6으로 증가
	    System.out.println(x2 + " , " + y2); // 6,5
		
		System.out.println("-------------------------");
		
		// 대입연산자와 결합 대신 출력문에도 사용 가능
		x2 = 5;
		System.out.println(++x2); //x2 값을 먼저 1증가시킨 후 출력(6출력)
		// => 출력문에 x2 값을 전달하기 전에 증감연산자가 먼저 사용됨.
		
		System.out.println(x2++); //x2 값을 먼저 출력한 후 1증가 시킴(6출력)
		// => 출력문에 x2값을 먼저 전달한 후 증감연산자가 사용됨.
		// 위의 과정으로 6이 출력된 후 6 -> 7로 증가되었으므로 x2를 출력하면 7이 출력
		System.out.println(x2);
		
		System.out.println("-------------------------");
		
		char ch = 'A';
		System.out.println(ch + 1);
		// ch + 1 결과값을 출력(char -> int로 변환되어 정수 출력)하지만,
		// ch 값을 직접 변경하지는 않았으므로
		System.out.println(ch); //변경 전 값인 'A'가 출력됨.
		
		System.out.println(++ch);
		//ch + 1 결과값을 출력(문자 그대로 출력)하면서,
		//ch 값을 직접 변경하였으므로
		System.out.println(ch); // 변경 후 값인 'B'가 출력됨.
		
		int x3 = 10;
		int y3 = 20;
		int z3 = ++x3 + y3--;
		System.out.println(z3);
		System.out.println(x3);
		System.out.println(y3);
		
	}

}
