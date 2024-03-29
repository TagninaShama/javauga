public class StarbucksAccount {
	//Do not modify the attributes or add new ones.
	private String firstName;
	private String lastName;
	private String membershipID;
	private double funds;
	private boolean hasReward; //true when account has reward available for use
	
	//Constructor to initialize variables
	public StarbucksAccount(String fn, String ln, String m, double funds)
	{
		firstName = fn;
		lastName = ln;
		membershipID = m;
		this.funds = funds;
		hasReward = false; //default
	}
	
	//Modifies the hasReward variable to indicate a reward is available
	public void earnedReward()
	{
		hasReward = true;
	}
	
	
	//----------Code below here--------------------

	
/*
 * 1. Write an accessor method for the funds attribute.
 * You must use proper naming convention for the method to receive credit
 */
	public double getFunds() {
		return funds;
	}
	
/*
 * 2. Write an accessor method for the hasReward attribute:
 * This method should be named hasReward()
 */
 public boolean hasReward() {
	 return hasReward;
 }
	
/*
 * 3. Write a method called printAccountInfo that prints out the information in the format below:
 * Pay close attention to the last line of output.
 * The example below is the output for the joesAccount object created for you in StarbucksAccountDemo.java

     Name: Joe King
     Membership ID: 98765432
     Available funds: $10.0
     Does not have a reward.

 * If joesAccount had a reward (hasReward evaluated to true), 
 * the following should be printed:

     Name: Joe King
     Membership ID: 98765432
     Available funds: $10.0
     Has a reward.
     
 * Hint: pay attention to how firstName and lastName print.
 */
public void printAccountInfo() {
	System.out.println("Name: " + firstName+ " " +lastName);
	System.out.println("Membership ID: " +membershipID);
	System.out.println("Available funds: " +funds);
	if(hasReward == true) {
		System.out.println("Has a reward.");
	}
	else {
		System.out.println("Does not have a reward.");
	}
}
	
/*
 * 4. Write a method called addFunds that accepts a double parameter to increase the funds by.
 * Note - this method stub is provided for you, complete the code so that it works as follows:
 * Increase the current funds by the requested amount only when that amount is positive
 * (you cannot deposit 0 or negative amounts). 
 * Otherwise, print the following error message:
     "Deposit amount must be greater than 0."
 */

	
 
/*
 * 5. Write a method called makePurchase that accepts a double purchaseAmount
 * Note - this method stub is provided for you, complete the code so that it works as follows:
 * Ensure that purchaseAmount is a positive number, otherwise print the error:
	 "Purchase amount must be greater than 0."
 * If purchase amount is valid, deduct that amount from your funds only when there are enough funds
 * to cover the purchaseAmount - funds should never be negative (but could be 0).
 * Otherwise - print the following error message:
	 "Purchase amount exceeds funds."
 */
	

/*
 * 6. Write a method called generateUsername that accepts 
      no parameters and returns a username in the following format:
 * first letter of the first name (lowercase)
 * first three letters of the last name (lowercase), 
 * and last three digits of the membershipID 
 * Example1: firstName is Joe, lastName is King, membershipID is 98765432.
		This method would return: jkin432
 * Example2: firstName is Bill, lastName is Bob, membershipID is 58991
		This method would return: bbob991
	  
 * You can assume firstName, lastName, and membershipID will have lengths of at least 3.
	 
 * (Hint: charAt returns a char - you can't store it directly in a String!)
 * (Hint2: The String class has a toLowerCase method!)
 */

	public String generateUsername() {
		String username;
		username = (firstName.substring(0,1).toLowerCase()+lastName.substring(0,3).toLowerCase()+ membershipID.substring(membershipID.length()-3));
		//System.out.println(username);
		return username;
	}
	
/*
 * 7. Starbucks only allows users to increase their funds by 
      10.00, 20.00, or 50.00. 
 * Modify your addFunds method code to enforce these conditions:
 * Only update the funds amount if the deposit amount is one of 
   the allowed values specified above.
 * Otherwise - print the following error:
		"Invalid deposit amount."

 * Ensure your method still works for the test cases in Step 4.
 */
	public void addFunds(double deposit)
	{
	   //Complete the code.
		if (deposit > 0)
		{
			if (deposit == 10.00 || deposit == 20.00 || deposit == 50.00) {
				funds = deposit + funds;
			}
			else {
				System.out.println("Invalid deposit amount.");
			}
		}
		else {
		  System.out.println("Deposit amount must be greater than 0.");
		}
	}
 
	
/*
 * 8. Modify the makePurchase method so that if the account has a reward available for use:
    * 1. funds are not deducted by the purchaseAmount
	 * 2. hasReward is updated to false (the reward is used)
	 * 3. The below message prints:
	   "You have redeemed your reward."
	 * (note - this is only possible if the purchase amount is valid (>0)

 * Ensure your method still works for the test cases in Step 5.
 */
	public void makePurchase(double purchaseAmount) {
		if (purchaseAmount > 0) {
			if (purchaseAmount <= funds) {
				if (hasReward == true) {
					System.out.println("You have redeemed your reward.");
					hasReward = false;
				} else {
					
					funds = funds - purchaseAmount;
					System.out.println(funds);
				}
			} else {
				System.out.println("Purchase amount exceeds funds.");
			}
		} else {
			System.out.println("Purchase amount must be greater than 0.");
		}
	}

}