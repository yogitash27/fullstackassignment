package com;
import java.io.*;
import java.util.Scanner;
public class Lowerfile {

	public static void main(String[] args) throws Exception{
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the filename: Type \" info.txt :");
		 String filename = scan.nextLine();
		 FileReader fr = new FileReader(filename);
	      BufferedReader in = new BufferedReader(fr);
	      System.out.println("Enter Your filename: ");
	      String filename2 = scan.nextLine();
	      FileWriter fw = new FileWriter(filename2);
	      BufferedWriter out = new BufferedWriter(fw);

	      boolean eof = false;
	      int inChar;
	      do {
	        inChar = in.read();
	        if (inChar != -1) {
	          char outChar = Character.toLowerCase((char) inChar);
	          out.write(outChar);
	        } else
	          eof = true;
	      } while (!eof);
	      out.flush();
	      in.close();
	      out.close();
		fr.close();
		fw.close();
		System.out.println(" Check Your file");
	}

}



