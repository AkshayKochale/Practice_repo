package com.practice.test.Java8Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	File file=new File("C:\\Users\\techn\\OneDrive\\Desktop\\Demo.txt");
    	
    	if(!file.exists())file.createNewFile();
    	
    	
    	
//    	FileOutputStream fos=new FileOutputStream(file);
//    	fos.write("hey how are you".getBytes());
    	
    	
//    	FileInputStream fis=new FileInputStream(file);
//    	int b=0;
//    	
//    	while((b=fis.read())!=-1) 
//    	{
//    			System.out.print((char)b);
//    		
//    	}
    	
//    	FileReader fr= new FileReader(file);
//    	int i;
//    	while((i=fr.read())!=-1) 
//    	{
//    		System.out.print((char)i);
//    	}
    
    	
//    	Scanner sc= new Scanner(file);
//    	 while(sc.hasNext()) 
//    	 {
//    		 System.out.println(sc.nextLine());
//    	 }
//    	
    	
    	
    	
    	System.out.println("Done");
    	
    }
}
