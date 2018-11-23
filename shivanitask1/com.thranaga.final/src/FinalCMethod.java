
public class FinalCMethod {
	final void run(){System.out.println("running");}  
	}  
	     
	class abc extends FinalCMethod{  
	   void display(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   abc obj= new abc();  
	   obj.display();  
	   }  

}
