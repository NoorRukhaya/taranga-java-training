package com.tharanga.iooperation;

import java.io.File;
import java.util.Date;

public class FileDateDemo {
	
	public static void main(String[] args) {
        File file = new File("C:\\Users\\prema\\Desktop\\Tharanga tech\\Tharanga Accounts.xlsx");
        
        long timestamp = file.lastModified();
        System.out.println("Tharanga Accounts modified date = "+new Date(timestamp));
    }
}
