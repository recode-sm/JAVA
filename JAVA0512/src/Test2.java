
public class Test2 {

	public static void main(String[] args) {
//		Vehicle v = new Vehicle(); // 인스턴스 생성불가!
		
		// 추상클래스 Vehicle 타입을 참조변수로 활용
		Vehicle v = new ElectricCar();
		v.reportPostion();
		v.addFuel();
		
		v = new DieselCar();
		v.reportPostion();
		v.addFuel();

	}

}

/*
 *  Vehicle 추상메서드 정의
 *  - 멤버변수 : 좌표를 저장하는 변수 curX, curY(정수형) 
 *  - reportPosition() 메서드 정의
 *    => ex) 현재 위치 : curX , curY 출력
 *  - addFuel() 메서드 정의
 *    => 차량마다 연료 공급 방법이 다르므로 오버라이딩 필요
 *    => 오버라이딩의 강제성을 부여하기 위해 추상메서드로 정의
 *  
 *  Vehicle 클래스를 상속받는 ElectricCar, DieselCar 클래스 정의
 *  각 클래스에서 addFeul() 호출 시
 *  ElectricCar : "전기차 충전소에서 배터리 충전!" 출력
 *  DieselCar : "주유소에서 디젤 연료 공급!" 출력
 */

abstract class Vehicle {
	int curX, curY; // 현재 위치 좌표를 저장하는 변수
	
	public void reportPostion() { // 서브클래에서 오버라이딩 옵션
		System.out.println("현재 위치 : " + curX + ", " + curY);		
	}
	
//	public void addFuel() {
//		System.out.println("자동차의 연료 공급");
//	}
	//=> 차량마다 연료 공급 방법이 다르므로 오버라이딩 필요
	//=> 오버라이딩의 강제성을 부여하기 위해 추상메서드로 정의 
	public abstract void addFuel(); // 서브클래스에서 구현 필수!
}

//  Vehicle 클래스를 상속받는 ElectricCar, DieselCar 클래스 정의
//  각 클래스에서 addFeul() 호출 시
//  ElectricCar : "전기차 충전소에서 배터리 충전!" 출력
//  DieselCar : "주유소에서 디젤 연료 공급!" 출력

class ElectricCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 배터리 충전!");
		
	}
	
}

class DieselCar extends Vehicle {

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
		
	}
	
}













