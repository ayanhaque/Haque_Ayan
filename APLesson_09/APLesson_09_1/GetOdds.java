package APLesson_09_1;
public class GetOdds
{
   static int [] numbers;
   public static void main(String[]args)
   {
       int [] numbers = new int[10];
       fillArray(numbers);
       
       System.out.println("For the following numbers..."); 
       printArray(numbers);
       System.out.println("\n There are " + getOdds(numbers) + " odd numbers");
   }
   public static void fillArray(int [] numbers)
   {
       for(int i = 0; i < numbers.length; i++)
       {
           numbers[i] = (int)(Math.random() * 100) + 1;
       }
   }
   public static void printArray(int [] numbers)
   {
       for(int num : numbers)
           System.out.print(num + " ");
   }
   public static int getOdds(int [] numbers)
   {
       int odds = 0;
       for(int num : numbers)
       {
           if(num % 2 == 1)
           {
               odds += num;
           }
       }
       return odds;
   }
}