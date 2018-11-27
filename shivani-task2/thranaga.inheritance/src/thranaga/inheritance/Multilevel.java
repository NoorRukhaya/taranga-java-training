package thranaga.inheritance;

public class Multilevel {
	public void display() {
	      System.out.println("Inside display");
	   }
	}
	class Rectangle extends Multilevel {
	   public void area() {
	      System.out.println("Inside area");
	   }
	}
	class Cube extends Rectangle {
	   public void volume() {
	      System.out.println("Inside volume");
	   }
	
	
	   public static void main(String[] args) {
	      Cube cube = new Cube();
	      cube.display();
	      cube.area();
	      cube.volume();
	   }

}
