
public class Ex {

	public static void main(String[] args) {
		/*
		 * 생성자 this()
		 * - 자신의 생성자 내에서 자신의 또 다른 생성자를 호출
		 * - 레퍼런스 this 사용과 동일하게 자신의 인스턴스에 접근하여
		 *   다른 오버로딩 생성자를 호출하는 용도로 사용
		 * - 생성자 오버로딩 시 인스턴스 변수에 대한 초기화 코드가 중복되는데
		 *   초기화 코드 중복을 제거하는 용도로 사용
		 *   => 여러 생성자에서 각각 인스턴스 변수를 중복으로 초기화하지 않고
		 *      하나의 생성자에서만 초기화 코드를 작성한 뒤
		 *      나머지 생성자에서는 해당 초기화 코드를 갖는 생성자를 호출하여
		 *      초기화 할 값만 전달 후 대신 인스턴스 변수 초기화를 수행함
		 *   => 메서드 오버로딩 시 코드 중복을 제거하기 위해서
		 *      하나의 메서드에서만 작업을 수행하고 나머지 메서드는
		 *      해당 메서드를 호출하여 데이터를 전달하는 것과 동일함
		 *      (단, 메서드는 이름()으로 호출, 생성자는 this() 로 호출하는 차이)
		 *      
		 * < 생성자 this() 호출 기본 문법 >
		 * 생성자 내의 첫번째 라인에서 
		 * this([데이터...])     
		 *      
		 */ 
		
		// MyDate() 생성자 호출 => 1900년 1월 1일로 초기화
		MyDate d1 = new MyDate();
		System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
		System.out.println("----------------------------------------");
//		d1.showDateInfo();
		
		// MyDate(int) 생성자 호출 => XXXX년 1월 1일로 초기화
		MyDate d2 = new MyDate(2022);
		d2.showDateInfo();
		System.out.println("----------------------------------------");
		
		// MyDate(int,int) 생성자 호출 => XXXX년 X월 1일로 초기화
		MyDate d3 = new MyDate(2022,4);
		d3.showDateInfo();
		System.out.println("----------------------------------------");
		
		// MyDate(int,int,int) 생성자 호출 => XXXX년 X월 X일로 초기화
		MyDate d4 = new MyDate(2022,4,20);
		d4.showDateInfo();
		System.out.println("----------------------------------------");

	}

}

class MyDate {
	int year;
	int month;
	int day;
	
	// 기본 생성자 정의
	public MyDate() {
		// 연도 : 1900, 월 : 1, 일 : 1 로 초기화
		// 자신의 생성자 내에서 다른 오버로딩 생성자 호출
		this(1900,1,1); // 다른 실행 코드보다 무조건 먼저 실행되어야 함
		// => public MyDate(int year, int month, int day) {} 생성자가 호출됨
		
		System.out.println("MyDate() 생성자 호출됨!");
		
//		year = 1900;
//		month = 1;
//		day = 1;
		// => 인스턴스 변수 초기화 코드가 다른 생성자와 중복됨
		//    중복 제거를 위해 3개의 값을 전달받는 파라미터 생성자를 호출하여
		//    초기화에 사용될 데이터를 전달하여 대신 초기화를 수행
		//    => 코드 중복 제거 가능
		
		// 자신의 생성자 내에서 다른 오버로딩 된 생성자를 호출 방법
		// this(전달할 데이터...);
//		this(1900,1,1); // 컴파일 에러 발생!
		// => 생성자 내의 다른 실행코드보다 아래쪽에 생성자 this()가 올 수 없다!
		// Constructor call must be the first statement in a constructor
	}
	
	// 연도(year)만 전달받고, 나머지는 1월 1일로 초기화하는 생성자 정의
	public MyDate(int year) {
		// MyDate(int, int, int) 생성자를 호출하여
		// 연도 2: 전달받은 연도, 월 : 1, 일 : 1 로 초기화
		this(year,1,1);
		System.out.println("MyDate(int) 생성자 호출됨!");
//		this.year = year;
//		month = 1;
//		day = 1;
	}
	
	// 연도(year), 월(month)을 전달받고, 나머지는 1일로 초기화는 생성자 정의
	public MyDate(int year, int month) {
		// MyDate(int, int, int) 생성자를 호출하여
		// 연도 : 전달받은 연도, 월 : 전달받은 월, 일 : 1 로 초기화
		this(year,month,1);
		System.out.println("MyDate(int,int) 생성자 호출됨!");
		
//		this.year = year;
//		this.month = month;
//		day = 1;
	}
	
	// 모든 인스턴스 변수 데이터를 전달받아 초기화하는 생성자 정의
	public MyDate(int year, int month, int day) {
		System.out.println("MyDate(int,int,int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void showDateInfo() {
		System.out.printf("%d/%d/%d\n", year, month, day);
	}
	
}











