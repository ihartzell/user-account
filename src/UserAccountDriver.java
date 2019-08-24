
public class UserAccountDriver {

	public static void main(String[] args) 
	{
		// I'm creating two objects from the UserAccount class.
		// More specifically, these objects are created from the UserAccount constructor
		// which has a username and a password as the arguments.
		UserAccount account1 = new UserAccount("Isaac", "Epsilon Pi Alpha");
		UserAccount account2 = new UserAccount("Seth", "Java*477");
		
		System.out.println("account1: " + account1);
		System.out.println("account2: " + account2);
		System.out.println();
		
		System.out.println("Is account1's password (Epsilon Pi Alpha) ? = ");
		System.out.println(account1.checkPassword("Epsilon Pi Alpha"));
		System.out.println("Is account2's password (Epsilon Pi Alpha) ? = ");
		System.out.println(account2.checkPassword("Epsilon Pi Alpha"));
		System.out.println();
		
		System.out.println("Does account1 and account2 have identical names?");
		System.out.println(account1.equals(account2));
		System.out.println();
		
		System.out.println("Since account2's password is incorrect I'll deactivate it.");
		
		account2.deactivateAccount();
		System.out.println();

		System.out.println("account1: " + account1);
		System.out.println("account2: " + account2);
		System.out.println();
		
		
	}

}
