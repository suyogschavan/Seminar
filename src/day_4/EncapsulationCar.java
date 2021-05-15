package day_4;

public class EncapsulationCar {
	
	int speed = 0;
	String color = "black";

	public static void main(String[] args) {
		EncapsulationCar car = new EncapsulationCar();
		
		car.color = "green";
		System.out.println("Car current speed: "+ car.speed);
		car.accelratespeed();
		car.accelratespeed();
		car.breakCar();
		car.stopCar();
	
	}

	void accelratespeed() {
		speed = speed + 1;
		System.out.println("Accelerated Speed: "+speed);
	}
	
	void breakCar() {
		speed--;
		System.out.println("Break speed: "+speed);
	}
	
	void stopCar() {
		speed = 0;
		System.out.println("Car stopped and speed : "+speed);
	}
}
