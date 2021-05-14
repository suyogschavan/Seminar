package day_3;

import java.util.Scanner;
public class Calculator_by_Switch {

	public static void main(String[] args) {
		
		Scanner o = new Scanner(System.in);
		
	int fn, sn, result;
	char choise;
	
	System.out.println("Enter the First number : ");
	fn = o.nextInt();
	
	System.out.println("Enter the Second number : ");
	sn = o.nextInt();
	
	System.out.println("For Addition Enter : a \nFor Substraction Enter : b\nFor Multiplication Enter : c\nFor Division Enter : d");
	choise = o.next().charAt(0);
	
	switch(choise) 
	{
	
	case 'a':
		result = fn + sn;
		System.out.println("Addition of "+fn+" and "+sn+" is : "+result);
		
	case 'b':
		result = fn - sn;
		System.out.println("Substraction of "+fn+" and "+sn+" is : "+result);
		
	case 'c':
		result = fn * sn;
		System.out.println("Multiplication of "+fn+" and "+sn+" is : "+result);
		
	case 'd':
		result = fn / sn;
		System.out.println("Division of "+fn+" and "+sn+" is : "+result);
	}

	}

}
