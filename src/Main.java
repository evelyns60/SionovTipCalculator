import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{ public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Hello user. Welcome to the tip calculator. We hope you enjoy your stay.");

        //initializes # of people
        System.out.println("How many people are in your group?: ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        //initializes tip percentage
        System.out.println("What is the tip percentage? Please type in a whole number without the percent symbol: ");
        int percentage = scan.nextInt();
        scan.nextLine();

        //initializes all costs for every item ordered
        System.out.print("Enter a cost in dollars and cent format, or click -1 when you've finished entering them all in:  ");
        double onePrice = scan.nextDouble();
        scan.nextLine();

        //adds up costs of every food purchased
        double costNoTip = 0;
        while (onePrice != -1) {
            costNoTip += onePrice;
            System.out.print("Enter a cost in dollars and cent format, or click -1 when you typed them all in: ");
            onePrice = scan.nextDouble();
            scan.nextLine();
        }

        double totalTip = costNoTip * percentage / 100;
        String formattedTotalTip = formatter.format(totalTip);

        double costWithTip = totalTip + costNoTip;
        String formattedCostWithTip = formatter.format(costWithTip);

        double costPerPersonNoTip = costNoTip / numPeople;
        String formattedCostPerPersonNoTip = formatter.format(costPerPersonNoTip);

        double tipPerPerson = totalTip / numPeople;
        String formattedTipPerPerson = formatter.format(tipPerPerson);

        double totalCostPerPerson = costWithTip / numPeople;
        String formattedTotalCostPerPerson = formatter.format(totalCostPerPerson);

        System.out.println("---------------------");
        System.out.println("Total Cost Before Tip: $" + costNoTip);
        System.out.println("Tip Percentage: " + percentage + "%");
        System.out.println("Total Tip: $" + formattedTotalTip);
        System.out.println("Total Bill With Tip: $" + formattedCostWithTip);
        System.out.println("Total Cost Per Person Before Tip: $" + formattedCostPerPersonNoTip);
        System.out.println("Tip Per Person: $" + formattedTipPerPerson);
        System.out.println("Total Cost Per Person: $" + formattedTotalCostPerPerson);

    }
}