package datatypes;

public class Int {
	int a = 15000;
	int b = -20000;
	
	void add() {
		
		int c = a + b;
		
		System.out.println("The int Value is : " + c);
	}
}

class MainClass2 {
	
	public static void main(String args[]) {
		
		Int obj = new Int();
		
		obj.add();
	}
}
