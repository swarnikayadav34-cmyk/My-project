import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {

    public static void main(String[] args) {

        String[] quotes = {
                "The future depends on what you do today.",
                "Success is not final, failure is not fatal.",
                "Dream big and dare to fail.",
                "Believe you can and you're halfway there.",
                "Stay hungry, stay foolish."
        };

        String[] authors = {
                "Mahatma Gandhi",
                "Winston Churchill",
                "Norman Vaughan",
                "Theodore Roosevelt",
                "Steve Jobs"
        };

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {

            System.out.println("\n===== RANDOM QUOTE GENERATOR =====");
            System.out.println("1. New Quote");
            System.out.println("2. Exit");
            System.out.print("Choose Option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int index = random.nextInt(quotes.length);

                    System.out.println("\nQuote:");
                    System.out.println("\"" + quotes[index] + "\"");
                    System.out.println("- " + authors[index]);
                    break;

                case 2:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
