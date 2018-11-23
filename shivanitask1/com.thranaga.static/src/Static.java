
public class Static {
	 int rollno; 
	   String name;  
	   static String college ="ITS";  
	 
	   Static(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	     
	   void display (){System.out.println(rollno+" "+name+" "+college);}  

	  
	  
	 public static void main(String args[]){  
	 Static s1 = new Static(111,"Karan");  
	 Static s2 = new Static(222,"Aryan");  
	   
	 s1.display();  
	 s2.display();  
	 }  

}
