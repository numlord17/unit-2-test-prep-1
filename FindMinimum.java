import java.util.Random;

public class FindMinimum
{
   public static void main(String[] args)
   {
      System.out.print(findMin());
   }
   
   public static int findMin()
   {
      int min = 100;
      for (int i = 0; i < 10; i++)
      {
         int randomNumber = (int)(Math.random() * 100);
         if (randomNumber < min)
         {
            min = randomNumber;
         }
      }
      return min;
   }
}