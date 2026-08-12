import java.util.ArrayList;
import java.util.Scanner;

class Flashcard {
    String question;
    String answer;

    Flashcard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
}

public class FlashcardQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Flashcard> cards = new ArrayList<>();

        cards.add(new Flashcard("What is Java?", "A Programming Language"));
        cards.add(new Flashcard("What is OOP?", "Object Oriented Programming"));
        cards.add(new Flashcard("What is JVM?", "Java Virtual Machine"));

        int current = 0;

        while (true) {
            System.out.println("\n===== FLASHCARD QUIZ APP =====");
            System.out.println("Current Question: " + cards.get(current).question);

            System.out.println("\n1. Show Answer");
            System.out.println("2. Next Card");
            System.out.println("3. Previous Card");
            System.out.println("4. Add Flashcard");
            System.out.println("5. Edit Flashcard");
            System.out.println("6. Delete Flashcard");
            System.out.println("7. Exit");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Answer: " + cards.get(current).answer);
                    break;

                case 2:
                    current = (current + 1) % cards.size();
                    break;

                case 3:
                    current = (current - 1 + cards.size()) % cards.size();
                    break;

                case 4:
                    System.out.print("Enter Question: ");
                    String q = sc.nextLine();

                    System.out.print("Enter Answer: ");
                    String a = sc.nextLine();

                    cards.add(new Flashcard(q, a));
                    System.out.println("Flashcard Added!");
                    break;

                case 5:
                    System.out.print("New Question: ");
                    cards.get(current).question = sc.nextLine();

                    System.out.print("New Answer: ");
                    cards.get(current).answer = sc.nextLine();

                    System.out.println("Flashcard Updated!");
                    break;

                case 6:
                    if (cards.size() > 1) {
                        cards.remove(current);
                        current = 0;
                        System.out.println("Flashcard Deleted!");
                    } else {
                        System.out.println("At least one flashcard required.");
                    }
                    break;

                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}