import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{ public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello user. Welcome to the tip calculator. We hope you enjoy your stay.");

        System.out.println("How many people are in your group?: ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the tip percentage? Please type in a whole number without the percent symbol: ");
        int percentage = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter a cost in dollars and cent format, or click -1 when you typed them all in:  ");
        double onePrice = scan.nextDouble();
        scan.nextLine();

        double costBeforeTip = 0;
        while (onePrice != -1) {
            costBeforeTip += onePrice;
            System.out.print("Enter a cost in dollars and cent format, or click -1 when you typed them all in: ");
            onePrice = scan.nextDouble();
            scan.nextLine();
        }


    }
}