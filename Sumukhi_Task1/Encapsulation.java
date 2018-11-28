public class Encapsulation
{
    // private variables declared, these can only be accessed by public methods of class
    private String flairName;
    private int flairRoll;
    private int flairAge;
    // get method for age to access private variable flairAge
public int getAge()
    {
      return flairAge;
    }
    // get method for name to access private variable flairName
public String getName()
    {
      return flairName;
     }
    // get method for roll to access private variable flairRoll
public int getRoll()
    {
       return flairRoll;
    }
    // set method for age to access private variable flairage
public void setAge( int newAge)
    {
       flairAge = newAge;
    }
    // set method for name to access private variable flairName
public void setName(String newName)
    {
      flairName = newName;
    }
    // set method for roll to access private variable flairRoll
public void setRoll( int newRoll)
     {
       flairRoll = newRoll;
    }
}
