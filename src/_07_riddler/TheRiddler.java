package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer= JOptionPane.showInputDialog("What is the answer to life the universe and everything?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("42")) {
		JOptionPane.showMessageDialog(null, "Correct!");
		score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			JOptionPane.showMessageDialog(null, "No");
		}
		// 6. Add some more riddles
		String answerr= JOptionPane.showInputDialog("If there are 3 apples and you take away 2, how many do you have?");
		if(answerr.equals("2")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "No");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "yur score iz " + score);
	}
}

//security