
public class Ex4 {

	public static void main(String[] args) {
		
		int startNum = 1;
		int endNum = 10;
		
		for(int i = startNum; i <= endNum; i++) {
			System.out.println(i);
		}
		
		// '*' 기호 표기
		System.out.println("===================");
		
		for(int i = 1; i <= 5; i++) { // 출력할 라인 수 : 5줄
			
			for(int j = 1; j <= 5; j++) { // * 기호의 갯수 : 5개씩
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		
		*			1번 라인(i = 1), 별 1개(j = 1 ~ 1)
		**			2번 라인(i = 2), 별 2개(j = 1 ~ 2)
		***			3번 라인(i = 3), 별 3개(j = 1 ~ 3)
		****		4번 라인(i = 4), 별 4개(j = 1 ~ 4)
		*****		5번 라인(i = 5), 별 5개(j = 1 ~ 5)
		
		*/
		System.out.println("============================");
		
		
		for(int i = 1; i <= 5; i++) { // 출력할 라인 수 : 5줄
			
			for(int j = 1; j <= i; j++) { // * 기호의 갯수 
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		/*
		
		*****		1번 라인(i = 5), 별 5개(j = 1 ~ 5)
		****		2번 라인(i = 4), 별 4개(j = 1 ~ 4)
		***			3번 라인(i = 3), 별 3개(j = 1 ~ 3)
		**			4번 라인(i = 2), 별 2개(j = 1 ~ 2)
		*			5번 라인(i = 1), 별 1개(j = 1 ~ 1)
		
		*/
		
		System.out.println("============================");
		
		
		for(int i = 5; i >= 1; i--) { // 출력할 라인 수 : 5줄
			
			for(int j = 1; j <= i; j++) { // * 기호의 갯수 
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("============================");
		
		/*
												A			B
		*****		1번 라인(i = 1), 별 5개(j = 1 ~ 5)(j = 5 ~ 1)
		****		2번 라인(i = 2), 별 4개(j = 1 ~ 4)(j = 5 ~ 2)
		***			3번 라인(i = 3), 별 3개(j = 1 ~ 3)(j = 5 ~ 3)
		**			4번 라인(i = 4), 별 2개(j = 1 ~ 2)(j = 5 ~ 4)
		*			5번 라인(i = 5), 별 1개(j = 1 ~ 1)(j = 5 ~ 5)
		
		*/
		//A 힌트: 1(i) + 5 = 6 <-> 6 - 1(i) = 5
		//      , 2(i) + 4 = 6 <-> 6 - 2(i) = 4 
		//    ... 5(i) + 1 = 6 <-> 6 - 5(i) = 1
		//B 힌트: j가 5부터이니 안쪽 for문 증감식은 j--
		for (int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= (6 - i); j++){
			for(int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
