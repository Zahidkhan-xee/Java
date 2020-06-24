import java.io.File;
import java.lang.System.*;
import java.io.*;
import java.io.FileNotFoundException; // Import this class to handle errors 
import java.util.Scanner;
import javax.xml.transform.*; // Import the Scanner class to read text files
public class Week11{
	public static void main(String str[]){
	 try{
		String source ="/sdcard/AppProjects/ShifaMaAm/src/Week 11/";
		 source = source + str[1];
		 File Filesource = new File(source);
		 
		 String destination = "/sdcard/AppProjects/ShifaMaAm/src/Week 11/";
		 destination = destination + str[2];
		 File Filedestination = new File(destination);
		 
		 
		 
		 try {  
			 if (!Filedestination.createNewFile()) 
				 System.out.println("Destination already exists."); 
		 } //try
		 catch (IOException e) { 
			 System.out.println("An error occurred on destination file."); 
			 e.printStackTrace();
		 }//catch

		 //<<<<<CREATES FILE 4>>>>
		 try {  
			 if (!Filesource.createNewFile()) 
				 System.out.println("Source already exists.");
		 } //try
		 catch (IOException e) { 
			 System.out.println("An error occurred."); 
			 e.printStackTrace();
		 }//catch
		 
		 
		 Scanner readSource = new Scanner(Filesource);
		// Scanner readDestination = new Scanner(destination);
		//W(3) <= R(2);
		 try{ 				
		 FileWriter writeDestination = new FileWriter(destination);
		 while(readSource.hasNextLine()){
			String data = readSource.nextLine();
			data = data.concat("\n");
			System.out.println(data);
			writeDestination.write(data);
		 }
		 writeDestination.close();
		}catch(IOException e){
			System.out.println("Error");
		} //catch
		
		 
		 readSource.close();

	}
	catch(FileNotFoundException e){
		System.out.println(e);
	}  
	}//Void main
}//class.

