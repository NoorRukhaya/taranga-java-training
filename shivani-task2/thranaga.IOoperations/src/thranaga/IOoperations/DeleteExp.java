package thranaga.IOoperations;
import java.io.*;

public class DeleteExp {
	 public static void main(String[] args) 
	    { 
	        File file = new File("C:\\newfile.txt"); 
	          
	        if(file.delete()) 
	        { 
	            System.out.println("File deleted successfully"); 
	        } 
	        else
	        { 
	            System.out.println("Failed to delete the file"); 
	        } 
	    } 

}
