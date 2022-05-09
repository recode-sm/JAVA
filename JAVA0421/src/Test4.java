
public class Test4 {

	public static void main(String[] args) {
		// 생성된 인스턴스를 리턴받기
		Account acc = Account.getInstance();
		
		// Setter 호출하여 계좌번호 저장, showAccountInfo() 메서드로 출력
		acc.setAccountNo("111-1111-111");
		acc.showAccountInfo();
		
	}

}

/*
 * ----------------------------------------------------------------------
 * Account 클래스에 대한 싱글톤 패턴 구현
 * 1. 자신의 인스턴스를 생성하여 자신의 클래스 타입 변수 instance에 저장
 * => private static 선언
 * 
 * 2. 기본 생성자 정의 => private 선언
 * 
 * 3. Getter 정의 => public static 선언
 * -----------------------------------------------------------------------
 * 멤버변수 : accountNo(String, private)
 * 메서드 정의 : showAccountInfo() - 계좌번호 출력
 * 				 Getter/Setter 메서드 설정 
 */

class Account {
	// ============= Account 클래스에 대한 싱글톤 패턴 구현 ===============
	private static Account instance = new Account();
	
	private Account() {}
	
	public static Account getInstance() {
		return instance;
	}
	// =====================================================================
	private String accountNo; // 계좌번호
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
	}
}







