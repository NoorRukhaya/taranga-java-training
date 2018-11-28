class A
     {
           int x = 10;
     }
class B extends A
      {
        int x = 20;
      }
// Driver class
public class Test1
       {
           public static void main(String args[])
              {
                    A a = new B(); // object of type B
                    System.out.println(a.x);
              }
      }