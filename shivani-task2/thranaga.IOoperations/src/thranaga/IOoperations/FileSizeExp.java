package thranaga.IOoperations;
import java.io.File;

public class FileSizeExp {

	  public static void main(String[] args) {
	   
	    //create file object
	    File file = new File("C://Users//demo.txt");
	   
	    /*
	     * To get the size of a file, use
	     * long length() method of Java File class.
	     *
	     * This method returns size of a particular file in bytes. It returns 0L
	     * if file does not exists, and unspecified if file is a directory.
	     *
	     */
	    
	     long fileSize = file.length();
	    
	     System.out.println("File size in bytes is: " + fileSize);
	     System.out.println("File size in KB is : " + (double)fileSize/1024);
	     System.out.println("File size in MB is :" + (double)fileSize/(1024*1024));
	  }

}
