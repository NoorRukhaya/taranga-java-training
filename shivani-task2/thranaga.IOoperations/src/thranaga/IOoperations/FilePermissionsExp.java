package thranaga.IOoperations;
import java.io.File;

public class FilePermissionsExp {
	  public static void main(String[] args) {
	        File file = new File("/Users/USER/run.sh");
	        
	        System.out.println("File is readable? "+file.canRead());
	        System.out.println("File is writable? "+file.canWrite());
	        System.out.println("File is executable? "+file.canExecute());
	       
	        file.setReadable(false);
	        file.setWritable(false);
	        file.setExecutable(false);
	       
	        file.setReadable(true, false);
	        file.setWritable(true, false);
	        file.setExecutable(true, true);
	    }

}
