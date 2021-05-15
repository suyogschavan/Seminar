package day_3;

public class If_else_Ladder {

	public static void main(String[] args) {
		int percentage = 95;
		
		if(percentage > 60 && percentage <= 70)
			System.out.println("I will go for Arts");
		else if(percentage > 70 && percentage <= 80)
			System.out.println("I will go for Commerce");
		else if(percentage > 80 )
			System.out.println("I will go for Science");
		else
			System.out.println("I dont know ");

	}

}
