import java.util.Scanner;
public class User_Pass
{
    static Scanner kb;
    static String username;
    static String password;
    public static void main(String[]args)
    {
        kb = new Scanner (System.in);
        passCheck();
    }
    public static void passCheck()
    {
        System.out.println("Enter the username");
        username = kb.next();
        System.out.println("Enter the password");
        password = kb.next();
        if(username.equals("smithj1234") || password.equals("johnsmith"))
        {
			if(username.equals("smithj1234") && password.equals("johnsmith"))
				System.out.println("You are granted access!");
			else if(username.equals("smithj1234"))
				System.out.println("Password is incorrect!");
			else
				System.out.println("Username is incorrect!");
		}    
   		else 
		{
			System.out.println("Username and Password are incorrect!");
			passCheck();
		}
    }
}
