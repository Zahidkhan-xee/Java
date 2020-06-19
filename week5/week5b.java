import java.util.Scanner; 
import java.lang.Exception;
class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}
class Week5b
{
	int num1,num2;
	public static void main(String args[])
	{
		Week5b obj=new Week5b();
		obj.readInput();
		try{
			obj.div();
		}
		catch(ArithmeticException e){
			System.out.println("Sorry, Arithemtic Exception. \n" + e);
		}
		catch(MyException object){
			System.out.println("Sorry,division can't be 1");
		}

	}//main
	/**************************************************************************/
	void readInput()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first number : ");
		num1=input.nextInt();
		System.out.print("Enter second number : ");
		num2=input.nextInt(); 
		System.out.println("Number 1 = "+num1+"\nNumber 2 = "+num2); 
	}
	/***************************************************************************/
	void div() throws ArithmeticException, MyException{
		int result;
		if(num2==1){
			throw new MyException("Sorry,division can't be 1");
		}
		result=num1/num2;
		System.out.println("Result="+result); 
	}
	/**************************************************************************/
}//class definition ends
