import java.util.Scanner;

public class NullPointerException {
    static void getLength(String text){
        try{
        System.out.println("Length of the input string is  : "+text.length());
        }catch(Exception e){
            System.out.println("Exception while trying to find length of input : "+e.toString());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to find length : ");
        String text = scanner.nextLine();
        if(text.length()==0){
            //Pass null as input if input is empty
            text = null;
        }
        getLength(text);
    }
}