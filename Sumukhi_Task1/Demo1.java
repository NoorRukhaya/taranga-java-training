class Demo{  

   final int MAX_VALUE=99;
   void myMethod(){  
      MAX_VALUE=101;
   }  
   public static void main(String args[]){  
      Demo obj=new  Demo();  
      obj.myMethod();  
   }  
}