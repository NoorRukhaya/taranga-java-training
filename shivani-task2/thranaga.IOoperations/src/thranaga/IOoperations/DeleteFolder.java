package thranaga.IOoperations;
import java.io.File;

public class DeleteFolder {
	 public static void main(String[] args) {
	        String folder = "C:\\Users\\USER\\newFolder";
	        //delete folder recursively
	        recursiveDelete(new File(folder));
	    }
	    
	    public static void recursiveDelete(File file) {
	        //to end the recursive loop
	        if (!file.exists())
	            return;
	        
	        //if directory, go inside and call recursively
	        if (file.isDirectory()) {
	            for (File f : file.listFiles()) {
	                //call recursively
	                recursiveDelete(f);
	            }
	        }
	        //call delete to delete files and empty directory
	        file.delete();
	        System.out.println("Deleted file/folder: "+file.getAbsolutePath());
	    }

	}
	


