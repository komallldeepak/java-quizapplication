import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;

        System.out.println("================================");
        System.out.println("        JAVA QUIZ APP           ");
        System.out.println("================================");

        // Question 1
        System.out.println("\n1. Who developed Java?");
        System.out.println("1) James Gosling");
        System.out.println("2) Dennis Ritchie");
        System.out.println("3) Bjarne Stroustrup");
        System.out.print("Enter your answer: ");

        answer = sc.nextInt();
        if(answer == 1) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Java is which type of language?");
        System.out.println("1) Object-Oriented");
        System.out.println("2) Assembly Language");
        System.out.println("3) Machine Language");
        System.out.print("Enter your answer: ");

        answer = sc.nextInt();
        if(answer == 1) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Which keyword is used to create an object?");
        System.out.println("1) make");
        System.out.println("2) new");
        System.out.println("3) object");
        System.out.print("Enter your answer: ");

        answer = sc.nextInt();
        if(answer == 2) {
            score++;
        }

        // Question 4
        System.out.println("\n4. Java programs are compiled into?");
        System.out.println("1) Bytecode");
        System.out.println("2) Binary code");
        System.out.println("3) Assembly code");
        System.out.print("Enter your answer: ");

        answer = sc.nextInt();
        if(answer == 1) {
            score++;
        }

        // Question 5
        System.out.println("\n5. Which package contains Scanner class?");
        System.out.println("1) java.lang");
        System.out.println("2) java.io");
        System.out.println("3) java.util");
        System.out.print("Enter your answer: ");

        answer = sc.nextInt();
        if(answer == 3) {
            score++;
        }

        // Final Score
        System.out.println("\n================================");
        System.out.println("Your Final Score: " + score + "/5");

        if(score == 5) {
            System.out.println("Excellent! Perfect score.");
        }
        else if(score >= 3) {
            System.out.println("Good job! Keep learning.");
        }
        else {
            System.out.println("Keep practicing Java.");
        }

        System.out.println("================================");

        sc.close();
    }
}