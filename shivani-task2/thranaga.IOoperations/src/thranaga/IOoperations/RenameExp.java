package thranaga.IOoperations;
import java.io.File;

public class RenameExp {
    
   public static void main(String[] args) {
   
       File file = new File("C:\\Users\\USER\\newFolder");
       File newFile = new File("C:\\Users\\USER\\newFolder1");
       if(file.renameTo(newFile)){
           System.out.println("File rename success");;
       }else{
           System.out.println("File rename failed");
       }
       
       
       file = new File("xyz.properties");
       newFile = new File("xyz_New.properties");
       if(file.renameTo(newFile)){
           System.out.println("File rename success");;
       }else{
           System.out.println("File rename failed");
       }
       
       
       file = new File("C:\\Users\\USER\\xyz.properties");
       newFile = new File("xyz_Move.properties");
       if(file.renameTo(newFile)){
           System.out.println("File move success");;
       }else{
           System.out.println("File move failed");
       }
       
       
       file = new File("C:\\Users\\USER\\abc.txt");
       newFile = new File("abc.properties");
       if(file.renameTo(newFile)){
           System.out.println("File move success");;
       }else{
           System.out.println("File move failed");
       }
       
       
       file = new File("C:\\Users\\USER\\export.sql");
       newFile = new File("C:\\Users\\USER\\newFolder1 ");
       if(file.renameTo(newFile)){
           System.out.println("File move success");
       }else{
           System.out.println("File move failed");
       }
   }



}
