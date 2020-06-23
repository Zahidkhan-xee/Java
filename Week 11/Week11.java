import java.io.File;
import java.lang.System.*;
import java.io.*;
import java.io.FileNotFoundException; // Import this class to handle errors 
import java.util.Scanner; // Import the Scanner class to read text files
public class Week11{
	public static void main(String str[]){
	 try{
		 File file1= new File("/sdcard/AppProjects/ShifaMaAm/src/Week 11/File1.txt");
		 File file2= new File("/sdcard/AppProjects/ShifaMaAm/src/Week 11/File2.txt");
		 File file3 = new File("/sdcard/AppProjects/ShifaMaAm/src/Week 11/File3.txt");
		 File file4 = new File("/sdcard/AppProjects/ShifaMaAm/src/Week 11/File4.txt");
		 //<<<<<CREATES FILE 3>>>>
		 try {  
			 if (!file3.createNewFile()) 
				 System.out.println("File3 already exists."); ; 
		 } //try
		 catch (IOException e) { 
			 System.out.println("An error occurred."); 
			 e.printStackTrace();
		 }//catch

		 //<<<<<CREATES FILE 4>>>>
		 try {  
			 if (!file4.createNewFile()) 
				 System.out.println("File4 already exists."); ; 
		 } //try
		 catch (IOException e) { 
			 System.out.println("An error occurred."); 
			 e.printStackTrace();
		 }//catch
		 
		 
		 Scanner readF1 = new Scanner(file1);
		 Scanner readF2 = new Scanner(file2);
		//W(3) <= R(2);
		 try{ 				
		 FileWriter writeF3 = new FileWriter("/sdcard/AppProjects/ShifaMaAm/src/Week 11/File3.txt");
		 while(readF2.hasNextLine()){
			String data = readF2.nextLine();
			data = data.concat("\n");
			System.out.println(data);
			writeF3.write(data);
		 }
		 writeF3.close();
		}catch(IOException e){
			System.out.println("Error");
		} //catch
		

		
		//W(4)<== R(1)
		 try{				//writes file4.
			 FileWriter writeF4 = new FileWriter("/sdcard/AppProjects/ShifaMaAm/src/Week 11/File4.txt");
			 while(readF1.hasNextLine()){
				 String data = readF1.nextLine();
				 data = data.concat("\n");
				 System.out.println(data);
				 writeF4.write(data);
			 }
			 writeF4.close();
		 }catch(IOException e){
			 System.out.println("Error");
		 } //catch
		 
		
		 
		 readF1.close();
		 readF2.close();
		 
		 if (file1.delete()) { 
			 System.out.println("Replaced content of : " + file1.getName());
		 } else { 
		 	System.out.println("Failed to delete the file."); 
		 } 
		
		 
		 if (file2.delete()) { 
			 System.out.println("Replaced content of: " + file2.getName());
		 } else { 
			 System.out.println("Failed to delete the file."); 
		 }
		 
		 file3.renameTo(file1);
		 file4.renameTo(file2);
	}//Try.
		catch(FileNotFoundException e){
		System.out.println("An error occurred.");
		e.printStackTrace();
	   }
	  
	}//Void main
}//class.

