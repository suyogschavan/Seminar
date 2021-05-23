package day_4;

public class BMWcar extends ParentCar {
	
	boolean autogearbox = true;

	public static void main(String[] args) {
		BMWcar bmwcar = new BMWcar();
		bmwcar.color = "red";
		bmwcar.accelratespeed();
		bmwcar.setEngine();
		System.out.println("Car ENgine: "+bmwcar.engine);
		System.out.println("Is Auto Car: "+bmwcar.autogearbox);
		

	}
	
	void accelratespeed() {
		speed = speed + 2;
		System.out.println("Accelerated Speed: "+speed);
	}

	void setEngine() {
		engine = "Version_";
		System.out.println("Engine: "+engine);
	}
}
