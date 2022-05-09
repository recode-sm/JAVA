
public class Test2 {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		// Account2 클래스 인스턴스의 모든 멤버변수는 pivate 이므로
		// 외부에서 접근이 불가능하다!!
//		acc.accountNo = "111-1111-111"; // 오류발생!
//		acc.ownerName = "홍길동"; // 오류발생!
//		acc.balance = 10000; // 오류발생!
		

	}

}

// Account2 클래스 정의
// 멤버변수 accountNo, ownerName, balance에 대해 외부에서 접근할 수 없도록 설정
// 실제로 접근이 되지 않는지 main()메서드 확인!

class Account2 {
	private String accountNo;
	private String ownerName;
	private int balance;
}
