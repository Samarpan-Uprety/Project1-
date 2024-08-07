import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        double itemPrice = 0, sum = 0, totalVat = 0, totalDiscount = 0;
        int id, Password, itemNum;

        System.out.println("Enter your user ID: ");
        id = money.nextInt();
        System.out.println("Enter your password: ");
        Password = money.nextInt();
        System.out.println("How many items did you purchase?");
        itemNum = money.nextInt();

        ArrayList<Double> priceList = new ArrayList<>();
        System.out.println("Enter the prices of the items you purchased.");
        System.out.println("Type a (quit/Quit) number if you want to exit early!");
        String wassup = money.nextLine();
        for (int i = 0; i < itemNum; i++) {
            System.out.println("Enter price for item " + (i + 1) + ":");
            itemPrice = money.nextDouble();

            if (wassup == "quit"){
                break;
            }
            if (wassup == "Quit"){
                break;
            }

            priceList.add(itemPrice);
        }

        for (double price : priceList) {
            sum += price;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Do you want to add VAT? (yes/no)");
        String Vat = money.next();
        Vat = Vat.toLowerCase();

        if (Vat.equals("yes")) {
            totalVat = sum + (0.13 * sum);
        } else {
            totalVat = sum;
        }

        System.out.println("Your new price with VAT is: Rs " + totalVat);

        System.out.println("Do you want a discount? (yes/no)");
        String Dis = money.next();
        Dis = Dis.toLowerCase();

        if (Dis.equals("yes")) {
            System.out.println("What is the discount percentage? ----Note: It should be less than 50%----");
            double dis = money.nextDouble();
            if (dis < 50) {
                totalDiscount = totalVat - ((dis / 100) * totalVat);
            } else {
                totalDiscount = totalVat;
            }
        } else {
            totalDiscount = totalVat;
        }

        System.out.println("Your total amount is Rs " + totalDiscount);
        int rupees = (int) totalDiscount;
        System.out.println("How much will you pay?");
        double cash = money.nextDouble();
        if (rupees >= 1000) {
            int amount = rupees / 1000;
            System.out.println("1000 * " + amount);
            rupees = rupees - (1000 * amount);
        }

        if (rupees >= 500) {
            int amount = rupees / 500;
            System.out.println("500 * " + amount);
            rupees = rupees - (500 * amount);
        }
        if (rupees >= 100) {
            int amount = rupees / 100;
            System.out.println("100 * " + amount);
            rupees = rupees - (100 * amount);
        }
        if (rupees >= 50) {
            int amount = rupees / 50;
            System.out.println("50 * " + amount);
            rupees = rupees - (50 * amount);
        }
        if (rupees >= 20) {
            int amount = rupees / 20;
            System.out.println("20 * " + amount);
            rupees = rupees - (20 * amount);
        }
        if (rupees >= 10) {
            int amount = rupees / 10;
            System.out.println("10 * " + amount);
            rupees = rupees - (10 * amount);
        }
        if (rupees >= 5) {
            int amount = rupees / 5;
            System.out.println("5 * " + amount);
            rupees = rupees - (5 * amount);
        }

        if (cash < totalDiscount) {
            System.out.println("Your total amount is Rs " + totalDiscount + ". Insufficient amount.");
        } else {
            System.out.println("Thank you, visit again!!");

            System.out.println("Have a great day ahead!");
        }

        money.close();
    }
}
