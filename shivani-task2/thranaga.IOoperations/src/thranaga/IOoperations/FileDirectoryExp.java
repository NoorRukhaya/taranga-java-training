package thranaga.IOoperations;
import java.io.File;


public class FileDirectoryExp {
	 public static void main(String[] args) {
	        File file = new File("/Users/USER/source.txt");
	        File dir = new File("/Users/USER");
	        File notExists = new File("/Users/USER/notafile");
	        
	        System.out.println("/Users/USER/source.txt is file?"+file.isFile());
	        System.out.println("/Users/USER/source.txt is directory?"+file.isDirectory());
	        
	        System.out.println("/Users/USER is file?"+dir.isFile());
	        System.out.println("/Users/USER is directory?"+dir.isDirectory());
	        
	        System.out.println("/Users/USER/notafile is file?"+notExists.isFile());
	        System.out.println("/Users/USER/notafile is directory?"+notExists.isDirectory());
	    }

}
