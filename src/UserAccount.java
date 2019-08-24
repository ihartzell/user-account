
public class UserAccount 
{
	// Field variables
	private String username;
	private String password;
	private boolean active;
	
	// This constructor basically assigns my field variables.
	UserAccount(String username, String password)
	{
		this.username = username;
		this.password = password;
		this.active = true;
	}
	// If the password equals my password check then it's
	// true, otherwise it's false.
	public boolean checkPassword(String passwordCheck)
	{
		if(this.password.equals(passwordCheck))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	// This method simply deactivates the account.
	public void deactivateAccount()
	{
		active = false;
	}
	
	// If I don't have this method essentially what will happen is
	// the program will spit out the memory addresses of the objects.
	public String toString()
	{
		return " The username is " + "("+ username +")" + " activity is " + "(" + active + ")";
	}
}
