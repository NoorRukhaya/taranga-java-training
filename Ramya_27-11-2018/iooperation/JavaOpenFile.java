package com.tharanga.iooperation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class JavaOpenFile {
	
	public static void main(String[] args) throws IOException {
        //text file, should be opening in default text editor
        File file = new File("D:\\abc.txt");
        
        
        //first check if Desktop is supported by Platform or not
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file); 
        
        //Opening pdf file
        try {

			File pdfFile = new File("C:\\Users\\prema\\Desktop\\New folder\\RDBMS.pdf");
			if (pdfFile.exists()) {

				if (Desktop.isDesktopSupported()) {
					Desktop.getDesktop().open(pdfFile);
				} else {
					System.out.println("Awt Desktop is not supported!");
				}

			} else {
				System.out.println("File is not exists!");
			}

			System.out.println("Done");

		  } catch (Exception ex) {
			ex.printStackTrace();
		  }
	}
        
    }

