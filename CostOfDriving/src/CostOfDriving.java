/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 2 Chapter 2
* Computer Configuration
* Due Date: 09/03/17*/
import java.util.Scanner;
public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance (in miles): ");
        double Distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double MPG = input.nextDouble();
        System.out.print("Enter price per gallon: $");
        double Price = input.nextDouble();
        double Total = (Distance / MPG) * Price;
        System.out.printf("The cost of driving is: $%.2f", Total);
    }
}