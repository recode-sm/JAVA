
public class Test {

	public static void main(String[] args) {
		
		// 은행계좌(Account2) 클래스의 인스턴스(acc) 생성
		Account2 acc = new Account2();
		 
//		acc.accountNO = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 10000;
		// => Setter 메서드로 대체
		acc.setAccountNo("111-1111-111");
		acc.setOnwerName("홍길동");
		acc.setBalance(10000);
		
//		System.out.println("계좌번호 : " + acc.accountNo);
//		System.out.println("예금주명 : " + acc.ownerName);
//		System.out.println("현재잔고 : " + acc.balance + "원");
		// => Getter 메서드로 대체
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOnwerName());
		System.out.println("현재잔고 : " + acc.getBalance() + "원");

	}

}

/*
 *  Account2 클래스
 *  멤버변수를 private 접근제한자로 선언
 *  계좌번호(accountNo, 문자열), 예금주명(ownerName, 문자열), 현재잔액(balance, 정수)
 *  Getter/Setter 메서드를 정의하여 멤버변수에 간접적으로 접근하도록 수행
 *   
 */

class Account2 {
	private String accountNo;
	private String onwerName;
	private int balance;

	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOnwerName() {
		return onwerName;
	}
	public void setOnwerName(String onwerName) {
		this.onwerName = onwerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}




