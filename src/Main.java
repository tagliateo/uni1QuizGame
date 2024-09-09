import textio.TextIO;

/*
You are tasked with creating a Java program that simulates a simple quiz game. The program should prompt the user with a series of questions and allow them to enter their answers. After the user has answered all the questions, the program should compute and display the final score based on the number of correct answers.

For this assignment, write a Java program that implements the functionality described in the scenario. Ensure that your program is error-free, compiles successfully, and produces the expected output. Test your program with different inputs to verify its correctness.

Make sure the following requirements are met:

The program should include five multiple-choice questions with four options.
The four options should be labeled A, B, C, and D.
The program should prompt the user to enter their answer by typing the corresponding letter (A, B, C, or D).
After the user has entered their answer for each question, the program should compare it to the correct answer and keep track of the number of correct responses.
The program should compute and display the final score as a percentage of the total number of questions.
Use if and switch case statements to handle user input and compare it to the correct answers.
Include comments to explain the purpose of each section of code and enhance code readability.
 */
public class Main {
    public static void main(String[] args) {
        String userInput; // grab and store User Input
        int score = 0; // variable for keeping track of score
        String[] correctAnswers; // storing correct answers
        String[] questions; // storing the questions
        double percentageScore; // storing final score conversion

         // Create an array object to contain all the questions
       questions = new String[] {
                "1. What is the capital of France?\n A. Berlin\n B. Paris\n C. Madrid\n D. Rome",
                "\n2. What is 2 + 2?\n A. 3\n B. 4\n C. 5\n D. 6",
                "\n3. Who wrote 'Romeo and Juliet'?\n A. Mark Twain\n B. William Shakespeare\n C. Charles Dickens\n D. Jane Austen",
                "\n4. What is the largest planet in our solar system?\n A. Earth\n B. Mars\n C. Jupiter\n D. Saturn",
                "\n5. What is the boiling point of water?\n A. 100 degrees Celsius\n B. 90 degrees Celsius\n C. 80 degrees Celsius\n D. 70 degrees Celsius"
        };

         // array of correct answers
        correctAnswers = new String[]{"b", "b", "b", "c", "a"};

        // iterate through array of questions and show the user the questions
        for (int i=0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("\nEnter your answer (A, B, C, or D): \n");
            userInput = TextIO.getlnWord().toLowerCase(); // grabbing user userInput and storing it, i did not know this would pause the program after every loop through a questions
            userInput.charAt(0);
            System.out.print("you entered: " + userInput); // show the user what they inputted

            if (userInput.equals(correctAnswers[i])){
                score++; // update score if correct
            }
        }

        percentageScore = (score / (double) questions.length * 100);

        System.out.println("\n Total Score is: " + percentageScore); // display score

    }
}