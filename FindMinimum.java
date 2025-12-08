import java.util.Random;

public class FindMinimum
{
   public static void main(String[] args)
   {
      System.out.print(findMin);
   }
   
   public static int findMin()
   {
      Random random = new Random();
      int min = 100;
      for (int i = 0; i < 10; i++)
      {
         int randomNumber = random.nextInt(100);
         if (randomNumber < min)
         {
            min = randomNumber;
         }
      }
      return min;
   }
}