//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String response=JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
int num0=Integer.parseInt(response);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
if(num0>3) {
	JOptionPane.showInputDialog(null, "YOU CRAZY CAT HORDER!!!!!!!!!");
}

		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
if(num0<3) {
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
	


	private static void JOptionPane;(String string) {
		// TODO Auto-generated method stub
		
	}

	static void playVideo(String https://www.youtube.com/watch?v=LyKpzSm3MIE) {
		try {
			URI uri = new URI(https://www.youtube.com/watch?v=LyKpzSm3MIE);
			java.awt.Desktop.getDesktop().browse(uri);
		 catch (Exception e) {
			e.printStackTrace();
		}
	}

}

}