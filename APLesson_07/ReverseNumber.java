import java.util.Scanner;
public class ReverseNumber
{
	static int number;
	static int num = number;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		
		getReverse();
	}
	public static void getReverse()
	{
		while(num > 0)
		{
			rev *= 10;
			rev += num % 10;
			num /= 10;
		}
		System.out.println(number + " reversed is " + rev);
	}
}