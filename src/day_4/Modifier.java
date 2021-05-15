package day_4;

public class Modifier {
	
	int defaultVariable = 12;
	
	public int publicVariable = 11;
	
	private int privateVariable = 13;
	
	protected int protectedVariable = 14;

	public static void main(String[] args) {
		
		Modifier obj = new Modifier();
		System.out.println(obj.defaultVariable);
		System.out.println(obj.publicVariable);
		System.out.println(obj.privateVariable);
		System.out.println(obj.protectedVariable);
	}

}
