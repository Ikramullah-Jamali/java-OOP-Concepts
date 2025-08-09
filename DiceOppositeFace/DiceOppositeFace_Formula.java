import java.util.Scanner;

// Topic: Arithmetic Operators
public class DiceOppositeFace_Formula 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number (1 to 6): ");
        int n = s.nextInt();

        if (n >= 1 && n <= 6) 
        {
            int oppositeFace = 7 - n;
            System.out.println("n = " + n + " , Opposite face = " + oppositeFace);
        } 
        else 
        {
            System.out.println("Given number is not on a cubic dice.");
        }
    }
}
