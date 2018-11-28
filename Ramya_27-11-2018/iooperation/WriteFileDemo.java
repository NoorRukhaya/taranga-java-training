package com.tharanga.iooperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileDemo {
	
	public static void main(String[] args) {
        String data = "I will write this String to File in Java";
        int noOfLines = 10000;
        writeUsingFileWriter(data);
        
        writeUsingBufferedWriter(data, noOfLines);
        
        writeUsingFiles(data);
        
        writeUsingOutputStream(data);
        System.out.println("DONE");
    }

    private static void writeUsingOutputStream(String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("D:\\os.txt"));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
   
    private static void writeUsingFiles(String data) {
        try {
            Files.write(Paths.get("D:\\files.txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("D:\\BufferedWriter.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine=data+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeUsingFileWriter(String data) {
        File file = new File("D:\\writting.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
