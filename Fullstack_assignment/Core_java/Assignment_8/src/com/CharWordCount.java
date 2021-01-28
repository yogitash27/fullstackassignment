package com;
import java.io.*;
import java.util.Scanner;
public class CharWordCount{

	public static void main(String[] args) throws Exception{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the filename: Type \" info.txt :");
		 String filename = scan.nextLine();
		 FileReader file = new FileReader(filename);  
	     BufferedReader br = new BufferedReader(file);          
	          
	        String line; 
	        int word_count = 0; 
	        int char_count = 0;
	        while((line = br.readLine()) != null) 
	        {
	                char_count += line.length(); 
	                String[] wordList = line.split("\\s+"); 
	                word_count += wordList.length;
	        } 
	          
	        System.out.println("Total word count = " + word_count); 
	        System.out.println("Total number of characters = " + char_count); 
	
	}

}



