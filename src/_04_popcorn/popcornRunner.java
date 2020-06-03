package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornRunner {
public static void main(String[] args) {
	String f =JOptionPane.showInputDialog("What flavor of popcorn would you like?");
	Popcorn o = new Popcorn(f);
	Microwave m = new Microwave();
	m.putInMicrowave(o);
	String t =JOptionPane.showInputDialog("How many minutes should I keep the popcorn in the microwave?");
	int time=Integer.parseInt(t);
	m.setTime(time);
	m.startMicrowave();

}
}
