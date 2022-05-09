
public class Test {

	public static void main(String[] args) {
		// while 문을 사용하여 구구단 2단 출력
		// < 2 단 >
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		int dan = 2;
		System.out.println(" < " + dan + "단 >");
		
		int i = 1; // 초기식
		while(i <= 9){ // 조건식
			System.out.println(dan + " * " + i + " = " + (dan * i)); //2 * 1 = 2
			i++; // 증감식
		}
		
		System.out.println("===========================");
		
		// while문을 사용하여 정수 1 ~ 10까지의 합(total)을 계산 후 출력
		int total = 0;
		
		int num = 1; // 초기식
		while(num <= 10) { // 조건식
			total += num;
			num++; //증감식
		}
		
		System.out.println("1 ~ 10까지 정수의 합 = " + total);
	}

}
