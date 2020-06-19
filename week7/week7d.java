import java.util.Scanner;
public class week7d{
	public static void main(String args[]){
		String inputstr;
		Scanner scan = new Scanner(System.in);
		char charArray[];
		System.out.println("Enter string : ");
		inputstr = scan.nextLine();
		
		int length = inputstr.length();
		charArray = new char[length];
		for(int loop=0;loop<length ; loop++)
			charArray[loop] = inputstr.charAt(loop);
		
		System.out.println("*******************");
			
		for(int loop=0;loop<length ; loop++)
			System.out.println("char at "+loop+" index is: "+charArray[loop]);
	
	}
}
