class Animal {
    public void eat(String str) {
        System.out.println("Eating for grass");
    }
}

class Goat extends Animal {
    public void eat(String str) {
        System.out.println("blank");
    }
}

class Another extends Goat{
  public void eat(String str) {
        System.out.println("another");
  }
}

public class ClassCastException {
    public static void main(String[] args) {
        Animal a = new Goat(); // no problem because upcast of same type.
      //  Another b = new Goat(); Problem come here because of downcasting
      // Another c = (Another) new Goat();
    
    }
}