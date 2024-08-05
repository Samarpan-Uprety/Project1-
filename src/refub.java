import java.util.Scanner;
public class refub {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = takeInput.nextInt();

        for (int i = 0; i <= 100; i++) {
            System.out.println("Guess the number : ");
            int guess = takeInput.nextInt();
            if (guess < number) {
                System.out.println("Cold");
            } else if (guess > number) {
                System.out.println("Hot");
            } else {
                System.out.println("The guess is correct.");
                break;
            }
        }
    }
}