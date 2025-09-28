package Exercise1;

import javax.swing.JOptionPane;


public class Test {
    private final Question[] questions;
    private int correctAnswer;
    private int incorrectAnswer;
    private final GenerateMessage messageGenerator;

    public Test() {
        messageGenerator=new GenerateMessage();

        questions = new Question[]{

                  new Question("1. In which year did Sun Microsystems fund an internal corporate research project " +
                        "led by James Gosling, which resulted in a C++ -based object-oriented programming language that Sun called Java?",
                       new String[]{"A) 1999", "B) 1998", "C) 1990", "D) 1991"},
                        'D'),

                  new Question("2. Which of the following editions of Java  contains the capabilities " +
                        "needed to develop desktop and server applications?",
                        new String[]{"A) Java Enterprise Edition 2 (Java 2 EE)", "B) Java Standard Edition 8 (Java SE 8)", "C) Java Micro Edition (Java ME)", "D) Java Enterprise Edition (Java EE)"},
                        'B'),

                  new Question("3. Which of the following components does a Java application need to have at least one of?",
                        new String[]{"A) Class ", "B) Instance Variable", "C) Local Variable", "D) Non-Static Method()"},
                        'A'),

                  new Question("4. Which symbol is used to end a Java statement?",
                        new String[]{"A) , (comma)", "B) ; (semicolon)", "C) : (colon)", "D) . (dot)"},
                        'B'),

                  new Question("5. What does an instance variable describe?",
                        new String[]{"A) Properties of an object", "B) Measurement of an object", "C) Height of an object.", "D) Behaviour of an object"},
                       'A')
        };
    }

    public void inputAnswer(){
        for (Question q : questions) {
            askQuestion(q);
        }

        double percentage = ((double) correctAnswer / questions.length) * 100;
        JOptionPane.showMessageDialog(null,
                "Test Quiz Done!\nGood Answers: " + correctAnswer +
                        "\nWrong Answers: " + incorrectAnswer +
                        "\nTestScore: " + String.format("%.2f", percentage) + "%");
    }


    private void askQuestion(Question q) {
        StringBuilder questionText = new StringBuilder(q.getQuestion() + "\n");
        for (String option : q.getAnswers()) {
            questionText.append(option).append("\n");
        }

        String answer = JOptionPane.showInputDialog(null, questionText.toString(),
                "Question ", JOptionPane.QUESTION_MESSAGE);

        if (answer != null && !answer.isEmpty()) {
            checkAnswer(q, Character.toUpperCase(answer.charAt(0)));
        } else {
            JOptionPane.showMessageDialog(null, "No answer entered. Moving on...");
        }
    }

    // Check if the answer is correct
    private void checkAnswer(Question q, char answer) {
        if (answer == q.getAlphaLetter()) {
            correctAnswer++;
            JOptionPane.showMessageDialog(null, messageGenerator.getMessage(true));
        } else {
            incorrectAnswer++;
            JOptionPane.showMessageDialog(null, messageGenerator.getMessage(false) +
                            "\nCorrect answer: " + q.getAlphaLetter());
        }
    }
}
