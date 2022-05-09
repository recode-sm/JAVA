
public class Test {

	public static void main(String[] args) {
		
		// 은행계좌 Account() 인스턴스 생성
		Account acc = new Account("111-1111-111", "홍길동", 10000);
		acc.showAccountInfo();
		
		Account acc2 = new Account("222-2222-222", "이순신", 90000);
		acc2.showAccountInfo();

	}

}

// 계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 생성자 Account() 정의
// showAccountInfo() 메서드 정의

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String newAccountNo, String newOwnerName, int newBalance) {
		System.out.println("Account(String, String, int) 생성자 호출됨!");
		
		accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
}








