import java.util.Scanner;

public class LanguageLearningApp {

    static String[] words = {
            "Hello", "Thank You", "Good Morning",
            "Water", "Friend"
    };

    static String[] meanings = {
            "Namaste",
            "Dhanyavaad",
            "Suprabhat",
            "Paani",
            "Dost"
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        while (true) {
            System.out.println("\n===== LANGUAGE LEARNING APP =====");
            System.out.println("1. Learn Words");
            System.out.println("2. Flashcards");
            System.out.println("3. Quiz");
            System.out.println("4. Progress");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Vocabulary Lessons ---");
                    for (int i = 0; i < words.length; i++) {
                        System.out.println(words[i] + " = " + meanings[i]);
                    }
                    break;

                case 2:
                    System.out.println("\n--- Flashcards ---");
                    for (int i = 0; i < words.length; i++) {
                        System.out.println("Word: " + words[i]);
                        System.out.println("Press Enter to see meaning...");
                        sc.nextLine();
                        System.out.println("Meaning: " + meanings[i]);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\n--- Quiz ---");

                    for (int i = 0; i < words.length; i++) {
                        System.out.print("Meaning of \"" + words[i] + "\": ");
                        String answer = sc.nextLine();

                        if (answer.equalsIgnoreCase(meanings[i])) {
                            System.out.println("Correct!");
                            score++;
                        } else {
                            System.out.println("Wrong! Correct Answer: " + meanings[i]);
                        }
                    }

                    System.out.println("Quiz Completed!");
                    break;

                case 4:
                    System.out.println("\n--- Progress Report ---");
                    System.out.println("Total Score: " + score + "/" + words.length);
                    double percent = ((double) score / words.length) * 100;
                    System.out.println("Progress: " + percent + "%");
                    break;

                case 5:
                    System.out.println("Thank you for using Language Learning App!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
