package qa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Child {
	
public void show(){
	System.out.println("Parent Method");
}

public static void main(String...s) throws Exception{
	
	File file = 
		      new File("./testdata/ReadFile.txt"); 
		    Scanner sc = new Scanner(file); 
		  
		    while (sc.hasNextLine()) 
		      System.out.println(sc.nextLine()); 
		  } 
	
}

