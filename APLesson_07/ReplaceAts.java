import java.util.Scanner;
public class ReplaceAts
{
	static String sentence;
	
	public static void main(String[]args);
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		
		replace(String sentence);
	}
	public static void replace(String sentence)
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + sentence.substring(sentence.indexOf("a") + @);
		}
		System.out.println(sentence);
	}
}