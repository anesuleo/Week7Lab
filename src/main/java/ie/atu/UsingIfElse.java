package ie.atu;
import java.util.Scanner;
public class UsingIfElse
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a number between 0 - 9: ");
        Scanner myScan = new Scanner(System.in);

        String input = myScan.nextLine();

        int myNum = Integer.parseInt(input);

        if(myNum >= 0 && myNum <= 9)
        {
            System.out.println("You entered " + myNum);
        }

        else
        {
            System.out.println("Not a valid number\n");
        }
    }
}