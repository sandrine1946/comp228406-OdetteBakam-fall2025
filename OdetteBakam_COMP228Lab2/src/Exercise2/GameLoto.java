package Exercise2;

import javax.swing.JOptionPane;

public class GameLoto {


    public void gameon () {
        Loto lotto = new Loto();
        //int userChoice = Integer.parseInt(
                //JOptionPane.showInputDialog("Enter a number between 3 and 27:")
        //);

        //boolean userWon = false;


        for (int i = 0; i <5; i++) {        //  5 times to Run lotto
            String userInput = JOptionPane.showInputDialog(
                    "Enter a number between 3 to 27 : \nTry : " + (i + 1));
            int number = Integer.parseInt(userInput);
            int sum = lotto.getSum();
            int[] nums = lotto.getRanNumbers();
            //JOption Implementation

            JOptionPane.showMessageDialog(null,
                    "Roll " + (i + 1) + ":\nNumbers: "
                            + nums[0] + ", " + nums[1] + ", " + nums[2]
                            + "\nSum = " + sum);
            if (number == sum) {
                JOptionPane.showMessageDialog(null, " Congratulations! You won" +i + "tries!");
                return;
               // break; // end the game
            } //else if (i < 5){
                //JOptionPane.showMessageDialog(null, "No match. Try again!");
            //lotto.setRanNumber();
        }

            JOptionPane.showMessageDialog(null, "Computer wins! Better luck next time.");
        }
    }