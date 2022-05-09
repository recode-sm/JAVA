
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 다중 if ~ else if문 (if ~ else if ~ else문)
		 * - 두 가지 이상의 조건식을 사용하여 세 가지 이상의 경우의 수 판별
		 * - 기본 if문으로 첫번째 조건을 설정하고, else if문으로
		 *   두번째 이후의 조건을 설정한다.
		 * - 모든 조건이 만족하지 않을 때 실행할 문장이 있을 경우
		 *   문장의 마지막에 else 문 사용
		 * - if문 비교는 위에서 아래로 차례대로 비교를 수행한다.
		 *   => 비교 범위가 좁은 조건식부터 비교를 수행해야한다!
		 *   
		 * <기본 문법>
		 * if(조건식1) {
		 * 		//조건식1의 결과가 true일 때
		 * }else if(조건식2) {
		 * 		//조건식1의 결과가 false이고, 조건식2의 결과가 true일 때
		 * }else if(조건식n) {
		 *		//조건식1~n-1의 결과가 false이고, 조건식n의 결과가 true일 때 		
		 * } else {
		 * 		//위의 모든 조건식(n까지) 결과가 false일 때
		 *		//마지막 else 문은 생략 가능
		 * }	
		 *  
		 */

		int num = 0;
		if(num > 0) { //양수일 때
			System.out.println(num + " : 양수!");
		} else if(num < 0) { //음수일 때
			System.out.println(num + " : 음수!");
		} else { //양수도 아니고 음수도 아닐 때(즉, 0일 때)
			System.out.println(num + " : 0!");
		}
		
	}

}
