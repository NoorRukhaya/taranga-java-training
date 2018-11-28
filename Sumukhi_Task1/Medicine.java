class Medicine extends Shadow
{
   // the Medicine subclass adds one more field
         public int forFur;
   // the Medicine subclass has one constructor
         public Medicine(int breed,int age,
               int presentFur)
        {
   // invoking base-class(Shadow) constructor
            super(breed , age);
            forFur = presentFur;
            }       
   // the Medicine subclass adds one more method
       public void setMedicine(int newValue)
              {
                    forFur = newValue;
              }
   // overriding toString() method
    @Override
        public String toString()
                  {
                       return (super.toString()+
                              "\nseat Medicine is "+forFur);
                 }
}