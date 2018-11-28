package com.tharanga.iooperation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RenameAndMoveDemo {
	
/*	public static void main(String[] args) 
	File file = new File("D://newfile.txt");
    File newFile = new File("D://input.txt");
    
    if(file.renameTo(newFile)){
        System.out.println("File rename success");;
    }else{
        System.out.println("File rename failed");
    }  */
	
    
    //java move file from one directory to another
    
	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:\\Users\\prema\\Desktop\\Web1"); 
        
        // renaming the file and moving it to a new location 
        if(file.renameTo 
           (new File("C:\\Users\\prema\\Desktop\\Webdesigning"))) 
        { 
            // if file copied successfully then delete the original file 
            file.delete(); 
            
            System.out.println("File moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
  
          
    } 
	}

         
    
    

