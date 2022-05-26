
public class Test3 {

	public static void main(String[] args) {
		
		Photoshop p = new Photoshop();
		
		p.draw(new Circle()); // Shape s = new Circle() 과 동일
		p.draw(new Rectangle(10.0, 20.0)); // Shape s = new Rectangle() 과 동일

		System.out.println("------------------------------------------");
		
		Car car = new Taxi();
		car.speedUp();
		car.speedDown();
//		car.lift(); // 참조 영역 축소로 호출 불가!
//		car.drop(); // 참조 영역 축소로 호출 불가!
		
		// 다운캐스팅을 통해 Taxi 타입으로 변환 후에는 lift(), drop() 호출 가능
		if(car instanceof Taxi) {
			Taxi taxi = (Taxi)car; // 다운캐스팅
			taxi.lift();
			taxi.drop();
		}
		
		System.out.println("--------------------------------------------");		
		
		car = new Truck();
		car.speedUp();
		car.speedDown();
//		car.dump; // 참조 영역 축소로 인해 호출 불가!
		
		if(car instanceof Truck) {
			Truck truck = (Truck)car;
			truck.dump();
		}
		
	}

}

// -------------------------------------------------
// 모든 도형의 그리기 기능을 제공하는 Shape 인터페이스 정의
// => draw() 추상메서드 정의(리턴값 없음, 파라미터값 없음)
interface Shape {
	public abstract void draw();
}

/* Shape 인터페이스를 구현하는 Circle, Rectangle 클래스 정의
 *  => 추상메서드 draw() 를 오버라이딩하여 각자 도형 그리기 기능을 구현
 *   ex) Circle 은 "원 그리기!", Rectangle 은 "사각형 그리기!" 출력
 *
 * Circle 클래스 멤버
 *  - 실수형 radius 멤버변수(접근제한자: private)
 *  - Setter() 메서드 정의
 *  - draw() 출력 : "원 그리기! - 반지름 : raidus값"
 *  
 * Rectangle 클래스 멤버
 * - 실수형 멤버변수 width(가로), height(세로) 두 멤버변수 모두 접근제한자: private
 * - Setter() 메서드 정의
 * - draw() 출력 : "가로 : width값 , 세로 : height값 의 사각형 그리기!"
 *  
 * Photoshop 클래스 정의
 * - draw() 메서드 정의
 *   => Circle, Rectangle 인스턴스를 전달받아 해당 인스턴스의 draw() 호출
 *      두 인스턴스의 공통 타입으로 Shape 인터페이스를 파라미터 타입으로 지정
 */
class Circle implements Shape {
	private double radius = 3.0;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원 그리기! - 반지름 : " + radius);
		
	}
}

class Rectangle implements Shape {
	private double width = 2.0;
	private double height = 2.0;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("가로 : " + width + ", 세로 : " + height + "의 사각형 그리기!");
		
	}
	
}

class Photoshop {
	public void draw(Shape s) {
		s.draw();
	}
}

// -----------------------------------------------------------

interface Car {
	public abstract void speedUp();
	public abstract void speedDown();
}

class Taxi implements Car {

	@Override
	public void speedUp() {
		System.out.println("Taxi 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("Taxi 속력 감소!");
	}
	
	public void lift() {
		System.out.println("Taxi 승객 탑승!");
	}
	
	public void drop() {
		System.out.println("Taxi 승객 하차!");
	}
	
}

class Truck implements Car {

	@Override
	public void speedUp() {
		System.out.println("Truck 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("Truck 속력 감소!");
	}
	
	public void dump() {
		System.out.println("덤프!");
		
	}
}


























