import java.io.*;
class Flair{
   public static String FlairName = "";
   public static void geek(String name)
{
       FlairName = name;
   }
}
class GFGStatic {
   public static void main (String[] args) {
       Flair.flair("Praneet
       System.out.println(Flair.flairName);
       Flair obj = new Flair ();
       obj.flair("shadow");
       System.out.println(obj.flairName);
   }
}
