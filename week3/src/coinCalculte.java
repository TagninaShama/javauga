import java.util.Scanner;
import java.lang. * ;
public class coinCalculte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int quarter = 0;
		int dime= 0;
		int nickel = 0;
		int penny = 0;
		int numOfQuarters = 0;
		int remainderOfQuarters = 0;
		int numOfDime = 0;
		int remainderOfDimes = 0;
		int numOfNickels = 0;
		int remainderOfNickels = 0;
		int numOfPennies = 0;
		
		System.out.println("Enter a whole number from 1 to 99: ");
		System.out.println("The machine wil determine a combination of coins.");
		Scanner keyboard = new Scanner(System.in);
		int userNum = keyboard.nextInt();
		
		System.out.println(userNum + " cents in coins:");
		
		numOfQuarters = userNum / 25;
		System.out.println(numOfQuarters + " quarters");
		
		remainderOfQuarters = userNum % 25;
		numOfDime = remainderOfQuarters/10;
		System.out.println(numOfDime+ " dime");
		
		remainderOfDimes = remainderOfQuarters % 10; 
		numOfNickels = remainderOfDimes / 5;
		System.out.println(numOfNickels + " nickels");
		
		remainderOfNickels = remainderOfDimes % 5; 
		numOfPennies = remainderOfNickels / 1;
		System.out.println(numOfPennies + " pennies");
		*/
		/* int x = 4/3;
		System.out.println(x); //1.____________
		System.out.println(5/3);//2.____________
		char c = 65 + 10;
		System.out.println(c); //3.____________
		System.out.println(8%5);//4.____________
		int a = 4;
		int b = 6;
		System.out.println(3.4*(4.5*(a/b)));//5.____________
		System.out.println(3.75*2);//6._________
		System.out.println(Math.pow(3,2));//7.________
		System.out.println("\\\"");
	    */

	    /* System.out.println("enter a tweet:");
	    String userInput = keyboard.next();
	  
	   if (userInput.charAt(0) == '#') 
	   {
		   userInput = userInput.substring(1);
		   System.out.println(userInput.toLowerCase());
	   }
	   else 
	   {
		   System.out.println(userInput );
	   }
	   */
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter a password:");
		String userInput = keyboard.next();
		int length = userInput.length()-1;
		if (Character.isDigit(userInput.charAt(length)))
		{
			System.out.println("Ends with a number");
		}
		else 
		{
			System.out.println("Does not ends with a number");
		}
		
	}

}
