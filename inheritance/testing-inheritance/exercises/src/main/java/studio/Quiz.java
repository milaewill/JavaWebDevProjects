package studio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    public Quiz() {
        this.questions = new ArrayList<>();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestions(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            question.displayQuestion();
            System.out.println("Your answer:  ");
            String userAnswer = scanner.nextLine();
            boolean isCorrect = question.checkAnswer(userAnswer);
            System.out.println(isCorrect ? "Correct! \n " : "Incorrect \n" );
        }
        scanner.close();
    }

    public int gradeQuiz() {
        int correctCount = 0;
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions ) {
            System.out.println(question.getPrompt());
            System.out.println("Correct Answer: ");
            question.displayQuestion();
            String userAnswer = scanner.nextLine();
            boolean isCorrect = question.checkAnswer(userAnswer);
            if (isCorrect) {
                correctCount++;
            }
        }
        return correctCount;
    }

}
