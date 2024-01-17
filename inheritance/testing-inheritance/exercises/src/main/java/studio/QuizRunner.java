package studio;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();


        quiz.addQuestions(new MultipleChoiceQuestion("Where is LC not located?",
                new String[]{"STL", "KC", "Chicago", "Philadelphia"}, 1));

        quiz.addQuestions(new CheckBoxQuetion("Select the programming languages:",
                new String[]{"Java", "JS", "C++", "HTML"},
                new boolean[]{true, true, true, false}));

        quiz.addQuestions(new TrueFalseQuestion("Java is a compiled language.", true));


        quiz.runQuiz();


        int correctCount = quiz.gradeQuiz();
        System.out.println("You got " + correctCount + " out of " + quiz.getQuestions().size() + " questions correct.");
    }
}
