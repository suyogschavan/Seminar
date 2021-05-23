package day_4;

public class ParentCar {

	int speed = 0;
	int maxSpeed = 100;
	int minSpeed = 0;
	String engine = "V1";
	String color = "Red";
	
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
