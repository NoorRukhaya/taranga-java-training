package com.tharanga.iooperation;

import java.io.File;
import java.io.IOException;

public class CreateNewFileDemo {

	public static void main(String[] args) {  
		  
        try {  
            File file = new File("D://newfile.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}
