package datatypes;

public class Byte {
	byte a = 50;
	byte b = (byte) -80;
	
	void add() {
		
		byte c = (byte) (a + b);
		
		System.out.println("The Byte Value is : " + c);
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		Byte obj = new Byte();
		
		obj.add();
	}
	

}
