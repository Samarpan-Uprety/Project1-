import java.util.Scanner;

public class joley {
    public static void main(String[] args) {
        int num;
        num = 17;
        if (num % 2 == 0) {
            System.out.println("the given number is even");
        } else {
            System.out.println("The given number is odd");
        }
        int Age = 18;
        if (Age >= 18) {
            System.out.println("The user is eligible to vote");
        } else {
            System.out.println("The user is not allowed to vote");
        }

        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        num2 = input.nextInt();
        if (num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (num2 % 5 == 0) {
            System.out.println("buzz");
        } else if (num2 % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(num2);
        }


        int rupees = 1500;
        if (rupees >= 1000) {
            int amount = rupees / 1000;
            System.out.println("1000 *" + amount);
            rupees = rupees - (1000 * amount);
        }


        if (rupees >= 500) {
            int amount = rupees / 500;
            System.out.println("500 *" + amount);
            rupees = rupees - (500 * amount);

        }
        if (rupees >= 100) {
            int amount = rupees / 100;
            System.out.println("100 *" + amount);
            rupees = rupees - (100 * amount);

        }
        if (rupees >= 50) {
            int amount = rupees / 50;
            System.out.println("50 *" + amount);
            rupees = rupees - (50 * amount);

        }
        if (rupees >= 20) {
            int amount = rupees / 20;
            System.out.println("20 *" + amount);
            rupees = rupees - (20 * amount);

        }
        if (rupees >= 10) {
            int amount = rupees / 10;
            System.out.println("10 *" + amount);
            rupees = rupees - (10 * amount);

        }
        if (rupees >= 5) {
            int amount = rupees / 5;
            System.out.println("5 *" + amount);
            rupees = rupees - (5 * amount);

        }
    }
}













