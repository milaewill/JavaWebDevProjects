package studio;

public class CheckBoxQuetion extends Question{
    private String[] choices;
    private boolean[] correctAnswers;

    public CheckBoxQuetion(String prompt, String[] choices, boolean[] correctAnswers) {
        super(prompt);
        this.choices = choices;
        this.correctAnswers = correctAnswers;
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
        String[] userChoices = userAnswer.split(",");
        if (userChoices.length != correctAnswers.length) {
            return false;
        }
        for (String choice : userChoices) {
            int userChoice = Integer.parseInt(choice) -1;
            if(!correctAnswers[userChoice]) {
                return false;
            }
        }
        return true;
    }
}
