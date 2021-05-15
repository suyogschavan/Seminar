package day_4;

public class Car {
	
	String carColor = "gray";
	
	static String engine = "V1";
	
	Car() {}
	
	Car(String tempEngine){
		engine = tempEngine;
	}
	
	
	
	public static void main(String[] args) {
		
		Car newcar = new Car();
		newcar.printCarColor();
		Car.printCarEngine();
		
		
		Car newcar2 = new Car("V2");
		newcar2.printCarColor();
		Car.printCarEngine();
		
		Car newcar3 = new Car();
		newcar3.printCarColor();
		Car.printCarEngine();
		
		Modifier newModifier = new Modifier();
		
		System.out.println(newModifier.defaultVariable);
		System.out.println(newModifier.publicVariable);

		System.out.println(newModifier.protectedVariable);
		
	}
	
	void printCarColor() {
		System.out.println("Car color: "+ carColor);
	}
	
	//you cant use static variable inside non static function
	static void printCarEngine() {
		System.out.println("Engine: "+engine);
	}
	
	
}
