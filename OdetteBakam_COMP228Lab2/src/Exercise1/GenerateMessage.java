package Exercise1;

import java.util.Random;

public class GenerateMessage {
    private static final Random random = new Random();


    public String getMessage(boolean goodAnswer) {

        int randNum= random.nextInt(4);
    //int msgIndex = random.nextInt(4);
        if (goodAnswer) {
            return switch (randNum) {
                case 0 -> "Excellent!";
                case 1 -> "Good!";
                case 2 -> "Keep up the good work!";
                case 3 -> "Nice work!";
                default -> "";
            };
        }
        else{
            return switch (randNum) {
                case 0 -> "No. Please try again.";
                case 1 -> "Wrong. Try once more.";
                case 2 -> "Don't give up!";
                case 3 -> "No. Keep trying..";
                default -> "";
            };
        }
}
}