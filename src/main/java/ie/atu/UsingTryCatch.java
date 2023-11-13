package ie.atu;

import java.util.Scanner;

public class UsingTryCatch
{
    public static void main(String[] args)
    {
        int x = 0;
        while(x == 0)
        {
            try {
                System.out.println("Please enter a number between 0 - 9: ");
                Scanner myScan = new Scanner(System.in);

                String input = myScan.nextLine();

                int myNum = Integer.parseInt(input);

                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    x = 1;
                }
                else
                {
                    System.out.println("Not a valid number\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter numbers only");
            }
        }
    }
}
