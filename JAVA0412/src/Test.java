
public class Test {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스의 인스턴스(acc) 생성
		Account acc = new Account();
		
		System.out.println("-------------------------------");
		
		// 계좌번호 : 222-2222-222
		// 예금주명 : 본인이름
		// 현재잔액 : 적당히!
		acc.accountNo = "222-2222-222";
		acc.ownerName = "강진석";
		acc.balance = 1000000;
		
		// 정보를 출력!
		acc.showAccountInfo();

	}

}

/*
 * Account 클래스 정의
 * 멤버변수
 * - accountNo, 문자열
 *   ownerName, 문자열
 *   balance, 정수
 * - 계좌 정보를 출력하는 showAccountInfo() 메서드 정의
 *   => 매개변수 없고, 리턴값도 없는 
 * - 기본생성자에 추가할 내용
 *   accountNO = "111-1111-111"
 *   ownerName = "홍길동"
 *   balance = 0
 *   showAccountInfo() 메서드 호출  
 */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account() {
		System.out.println("Account() 생성자 호출됨!");
		
		// 인스턴스 생성 시 기본값으로 가져야할 데이터를 멤버변수에 저장
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
		
		// 인스턴스 생성 시 초기화 후 계좌 정보를 출력하기 위해
		// showAccountInfo() 메서드 호출
		showAccountInfo();
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
}








