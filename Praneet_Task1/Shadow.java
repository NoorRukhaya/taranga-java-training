class Shadow
{
    // the Shadow class has two fields
             public int breed;
             public int age;      
    // the Shadow class has one constructor
             public Shadow(int breed, int age)
               {
                   this.breed = breed;
                    this.age = age;
               }    
    // the Shadow class has three methods
              public void trainHello(int decrement)
                   {
                        age -= decrement;
                   }      
              public void trainSit(int increment)
                        {
                            age+= increment;
                        }
    // toString() method to print info of Shadow
              public String toString()
                            {
                                 return("Breed of shadow "+breed
                                  +"\n"
                                  + "age of shadow is "+age);
                           }
}
