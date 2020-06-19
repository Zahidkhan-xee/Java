
import java.util.Scanner;
import java.io.*;

public class week7c
{
	public static void main(String str[]){
	String inputString, inputCharacter;
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter a string : ");
	inputString = scan.nextLine();
	
	System.out.println("Enter the character : ");
	scan.useDelimiter(""); //scan.next() will now return a single-character 
	inputCharacter = scan.next();
	scan.reset();// can now scan strings
	
	int length = inputString.length();
	int count =0;
	for(int loop=0;loop<length;loop++){
		if(inputString.charAt(loop)== inputCharacter.charAt(0)){
			count++;
		}
	}
	System.out.println("The " 
	+ "\'" +inputCharacter + "\'"
	+ " has occurred : " + count + " times in "
	+ "\'" + inputString + "\'");
	}
	
}
