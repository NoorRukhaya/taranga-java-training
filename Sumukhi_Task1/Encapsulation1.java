public class Encapsulation1
{   
    public static void main (String[] args)
     {
        Encapsulation obj = new Encapsulation();   
// setting values of the variables
        obj.setName("Sumukhi");
        obj.setAge(21);
        obj.setRoll(96);        
// Displaying values of the variables
        System.out.println(" name: " + obj.getName());
        System.out.println(" age: " + obj.getAge());
        System.out.println(" roll: " + obj.getRoll());
// System.out.println("Geek's roll: " + obj.geekName);       
    }
}