class ArrayIndexOutOfBound {

     public static void main(String[] args) {

          char[] matrix = new char[] {'H', 'e', 'l', 'l', 'o'};

          System.out.println(matrix);

 
          for(int i = 0; i <= matrix.length; i++) {

               System.out.println(matrix[i]);

          }

     }

}