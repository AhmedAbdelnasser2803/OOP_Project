package courses;

import java.util.Scanner;

public class TestSwitchCase {
    public static void main (String [] args)
    {
        int choice =0;
        while(choice==0)
        {
            Scanner scann = new Scanner(System.in);
            System.out.println("enter the number of day");
            int day = scann.nextInt() ;
            switch (day)
            {
                case 1:
                    System.out.println("sunday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("wednesday");
                    break;
                case 5:
                    System.out.println("thursday");
                    break;
                case 6:
                    System.out.println("friday");
                    break;
                case 7:
                    System.out.println("saturday");
                    break;

                default:
                    System.out.println("invalid day");
                    break;
            }
            System.out.println("if you need any process enter 0 else enter 1 ");
            choice= scann.nextInt();

        }

    }
}
