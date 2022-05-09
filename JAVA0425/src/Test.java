
public class Test {

	public static void main(String[] args) {
		// ItwillBank 인스턴스 생성
//		ItwillBank ib;
//		ib = new ItwillBank();
		
		ItwillBank ib = new ItwillBank();
		
		// Account로 부터 상속받은 기본 멤버 접근
		ib.accountNo = "111-1111-111";
		ib.onwerName = "홍길동";
		ib.balance = 10000;
		ib.showAccountInfo();
		
		System.out.println("------------------");
		
		// Account로 부터 상속받은 메서드 접근
		ib.deposit(50000);
		
		int money = ib.withdraw(40000);
		System.out.println("출금된 금액 : " + money + "원");
		
		System.out.println("------------------");

		// ItwillBank의 고유 기능(추가된 기능)
		ib.contract("자동차보험");
		
		
	}

}

/* Account 클래스 정의
 * - Account 멤버변수
 *   : accountNo(계좌번호, String), onwerName(예금주명, String)
 *     balance(현재잔고, int)
 * - Account 메서드
 *   : 입금기능(deposit) - 리턴타입 없고, 파라미터 있음(amount 매개변수, int)
 *     => 동작은 돈을 입금받아 현재잔고에 더해서 출력
 *     출금기능(withdraw) - 리턴타입 있고, 파라미터 있음(amount 매개변수, int)
 *     => 현재잔고가 출금금액보다 적은지 판별해서
 *        현재잔고가 출금금액보다 적다면 0원을 리턴
 *        현재잔고가 출금금액보다 많다면 현재잔고에서 amount를 빼고,
 *        출금금액을 리턴
 *     현재 계좌의 정보를 보는 기능(showAccountInfo) - 리턴타입없고, 파라미터값 없음  
 */
class Account {
	// 멤버변수(=필드)
	String accountNo;
	String onwerName;
	int balance;
	
	// 생성자
		
	// 메서드
	
	// 계좌정보확인
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + onwerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 입금기능
	public void deposit(int amount) {
		balance += amount; // balance = balance + amount
		System.out.println("입금하신 금액 : " + amount + "원");
		showAccountInfo();
	}
	
	// 출금기능
	public int withdraw(int amount) {
		if(balance < amount) { // 현재잔고가 출금금액보다 적은지 판별(출금불가)
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			System.out.println(
					"출금할 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
			amount = 0;
		} else { // 출금이 가능할 경우(현재잔고 >= 출금금액)
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
		}
	
		return amount;
		
	}
}

 
/*
 * Account 클래스를 상속받는 ItwillBank 클래스 정의
 * - Account의 기본 기능(계좌의 기본 기능)은 그대로 유지
 * - 멤버변수 추가 : 보험명(insureName, 문자열)
 * - 메서드 추가 : 보험계약(contract())
 *   => 파라미터 : 보험명
 *      리턴값 : 없음
 *   => 전달받은 보험명을 멤버변수에 저장 후 "XXX 보험 계약 완료!" 출력
 */

class ItwillBank extends Account {
	String insureName; // 보험명
	
	// 보험 계약 기능
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println(insureName + " 보험 계약 완료!");
	}
}

