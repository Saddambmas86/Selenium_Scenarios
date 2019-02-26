package qa;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Folder {
	
public static String FolderQA(){
	Date date = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy [hh_mm_ss]");  
	String now= formatter.format(date); 
	File file=new File("./config/QA1/QA2/"+now+"");
	file.mkdir();
	System.out.println(now);
	System.out.println(file);
	return file.toString();
	
}


public static void main(String...s){

String A=Folder.FolderQA();
	
	
}




	

}
