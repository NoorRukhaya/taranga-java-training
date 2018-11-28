package com.tharanga.iooperation;

import java.io.File;

public class GetFileExtension {
	public static void main(String[] args) 
	{
        File file = new File("C:\\Users\\prema\\Desktop\\Banking\\banking.docx");
        System.out.println("File extension is: "+getFileExtension(file));
        //file name without extension
        file = new File("C:\\Users\\prema\\Desktop\\RDBMS.pdf");
        System.out.println("File extension is: "+getFileExtension(file));
        //file name with dot
        file = new File("C:\\Users\\prema\\Desktop\\Banking.docx");
        System.out.println("File extension is: "+getFileExtension(file));
        //hidden files without extension
        file = new File("C:\\Users\\prema\\Desktop\\Banking");
        System.out.println("File extension is: "+getFileExtension(file));
    }

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

}
