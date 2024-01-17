package studio;

public class Question {
    public String prompt;

    public Question(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public void displayQuestion() {
        System.out.println(prompt);
    }

    public boolean checkAnswer(String userAnswer) {
        return false;
    }
}
