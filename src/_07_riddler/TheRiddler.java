package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
 int Score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String Answer = JOptionPane.showInputDialog(null,"What has hands but can not clap?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (Answer.equals("A Clock")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	Score++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
}
		// 6. Add some more riddles

String Answer2 = JOptionPane.showInputDialog(null,"What has a head and a tail, but no body?");
if (Answer2.equals("A Coin")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	Score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong!");
}
		// 2. Make a pop up to show the score.

JOptionPane.showMessageDialog(null, Score);
		
	}
}

