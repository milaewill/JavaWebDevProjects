package studio;

public class MultipleChoiceQuestion extends Question{
    private String[] choices;
    private int correctIndex;

    public MultipleChoiceQuestion(String prompt, String[] choices, int correctIndex) {
        super(prompt);
        this.choices = choices;
        this.correctIndex = correctIndex;
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i + 1) + ". " + choices[i]);
        }
    }

    @Override
    public boolean checkAnswer(String userAnswer) {
        int userChoice = Integer.parseInt(userAnswer) - 1;
        return userChoice == correctIndex;
    }
}
