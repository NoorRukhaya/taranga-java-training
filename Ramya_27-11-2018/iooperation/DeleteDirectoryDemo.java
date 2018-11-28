package com.tharanga.iooperation;

import java.io.File;

public class DeleteDirectoryDemo 
{
	private static final String FOLDER ="C:\\Users\\prema\\Desktop\\Temp";
	    public static void main(String[] args) {
	
	        File newFolder = new File(FOLDER);
	
	        boolean created =  newFolder.mkdir();

	        if(created)

	            System.out.println("Folder was created !");

	        else
	
	            System.out.println("Already created");
	        
	        //delete folder recursively
	        recursiveDelete(new File(FOLDER));
	
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

