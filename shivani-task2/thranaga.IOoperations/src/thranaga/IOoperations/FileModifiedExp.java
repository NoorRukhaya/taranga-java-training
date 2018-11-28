package thranaga.IOoperations;
import java.io.File;
import java.util.Date;

public class FileModifiedExp {
	 public static void main(String[] args) {
	        File file = new File("emp.txt");
	        
	        long timestamp = file.lastModified();
	        System.out.println("emp.txt last modified date = "+new Date(timestamp));
	    }

}
