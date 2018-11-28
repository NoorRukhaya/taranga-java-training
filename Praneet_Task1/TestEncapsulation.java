public class TestEncapsulation
{   
    public static void main (String[] args)
     {
        Encapsulate obj = new Encapsulate();   
// setting values of the variables
        obj.setName("Nainish");
        obj.setAge(20);
        obj.setRoll(51);        
// Displaying values of the variables
        System.out.println(" name: " + obj.getName());
        System.out.println(" age: " + obj.getAge());
        System.out.println(" roll: " + obj.getRoll());
// System.out.println("Geek's roll: " + obj.geekName);       
    }
}
