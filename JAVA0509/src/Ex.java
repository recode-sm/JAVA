
public class Ex {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(vehicle);
		driver.drive(bus); // Vehicle vehicle = bus; 자동타입변환이 일어남(업캐스팅)
		driver.drive(taxi); // Vehicle vehicle = taxi; 자동타입변환
		

	}

}

class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
	
}

class Vehicle {
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
}

class Taxi extends Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
}







