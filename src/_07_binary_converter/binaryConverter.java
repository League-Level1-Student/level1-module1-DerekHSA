package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	
JFrame lol = new JFrame();
JPanel wyatt = new JPanel();
JLabel lucas = new JLabel();
JTextField finn = new JTextField(20);
JButton lel = new JButton();
binaryConverter(){
	lol.add(wyatt);
	wyatt.add(finn);
	wyatt.add(lel);
	wyatt.add(lucas);
	lel.addActionListener(this);
	lol.setVisible(true);
	lol.pack();
	
}
String convert(String input) {
    if(input.length() != 8){
        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
        return "-";
    }
    String binary = "[0-1]+";//must contain numbers in the given range
    if (!input.matches(binary)) {
        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
        return "-";   
    }
    try {
        int asciiValue = Integer.parseInt(input, 2);
        char theLetter = (char) asciiValue;
        return "" + theLetter;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        return "-";
    }
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String Oliver=finn.getText();
	String buddy=convert(Oliver);
	System.out.println(buddy);
}

}
