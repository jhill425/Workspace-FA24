// Jennifer Hill 8/21/24 Ch 1 Web Assist Assignment 1

import javax.swing.JOptionPane;
		import java.util.Random;

		public class RandomGuess {
		    public static void main(String[] args) {
		        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10.");

		        Random random = new Random();
		        int randomNumber = random.nextInt(10) + 1;
		        
		        JOptionPane.showMessageDialog(null, "The number I guessed is: " + randomNumber);
		    }
		}
