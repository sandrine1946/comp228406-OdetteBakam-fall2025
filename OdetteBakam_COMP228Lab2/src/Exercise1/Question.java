package Exercise1;

public class Question {
    private String question;
    private String[] answers;
    private char alphaLetter;

    public Question(String question, String[] answers, char alphaLetter) {
        this.question = question;
        this.answers = answers;
        this.alphaLetter = alphaLetter;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public char getAlphaLetter() {
        return alphaLetter;
    }
    public int getCorrectIndex() {
        return alphaLetter - 'A';
    }
}