package day_4;

public class BasicOOP {
	
	BasicOOP(){
		System.out.println("Inishilizing Object");
	}
	
	BasicOOP(int i){
		System.out.println("i = "+i);
	}

	public static void main(String[] args) {
		
		BasicOOP object = new BasicOOP();
		object.printSomething();
		object.printsomething2();
		
		BasicOOP object2 = new BasicOOP();
		
		
	}
	
	

	public void printSomething() {
		System.out.println("This method is from Basic OOP");
		
				
	}

	public void printsomething2() {
		System.out.println("This method is from Basic OOP 2 ");	
		}
}
