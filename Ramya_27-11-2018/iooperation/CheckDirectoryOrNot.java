package com.tharanga.iooperation;

import java.io.File;

public class CheckDirectoryOrNot {
	
	public static void main(String[] args) {
        File file = new File("C:\\Users\\prema\\Desktop\\New folder\\RDBMS.pdf");
        File dir = new File("C:\\Users\\prema\\Desktop\\New folder");
        File notExists = new File("C:\\Users\\prema");
        
        System.out.println(" file is "+file.isFile());
        System.out.println(" directory is "+file.isDirectory());
        
        System.out.println(" is file?"+dir.isFile());
        System.out.println(" is directory?"+dir.isDirectory());
        
        System.out.println(" is file?"+notExists.isFile());
        System.out.println(" is directory?"+notExists.isDirectory());
    }

}
