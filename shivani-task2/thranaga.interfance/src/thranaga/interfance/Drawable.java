package thranaga.interfance;

 interface Drawable {
	 void draw();  
 }  
   
 class Rectangle implements Drawable{  
 public void draw(){System.out.println("drawing rectangle");}  
 }  
 class Circle implements Drawable{  
 public void draw(){System.out.println("drawing circle");}  
 }  
  
 class TestInterface1{  
 public static void main(String args[]){  
 Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
 d.draw();  
 }

}
