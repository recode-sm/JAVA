
public class Test {

	public static void main(String[] args) {
		// 러퍼런스 this, 생성자 this() 복습
		Account acc = new Account();
		acc.showAccountInfo();
		System.out.println("--------------------------");
		
		Account acc2 = new Account("999-9999-999");
		acc2.showAccountInfo();
		System.out.println("--------------------------");
		
		Account acc3 = new Account("999-9999-999","이순신");
		acc3.showAccountInfo();
		System.out.println("--------------------------");
		
		Account acc4 = new Account("999-9999-999", "이순신", 1000);
		acc4.showAccountInfo();
		System.out.println("--------------------------");

	}

}

/*
 * Account 클래스(계좌번호, 예금주명, 현재잔고) 정의
 * => 기본 생성자
 *    계좌번호 전달받아 초기화는 생성자
 *    계좌번호, 예금주명 전달받아 초기화하는 생성자
 *    모든 멤버변수의 파라미터값을 전달받아 초기화하는 생성자
 *    (= 초기화작업을 수행하는 생성자)
 */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	public Account() {
		this("111-1111-111", "홍길동", 0);
		System.out.println("Account() 생성자 호출됨!");
	}
	
	public Account(String accountNo) {
		this(accountNo, "홍길동", 0);
		System.out.println("Account(String) 생성자 호출됨!");
//		this.accountNo = accountNo;
		
	}
	
	public Account(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
		System.out.println("Account(String, String) 생성자 호출됨!");
		
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
	}
	
	public Account(String accountNo, String ownerName, int balance) {
		System.out.println("Account(String, String, String) 생성자 호출됨!");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + this.accountNo);
		System.out.println("예금주명 : " + this.ownerName);
		System.out.println("현재잔액 : " + this.balance);
	}
	
	
}






