package Swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class First_swing {

	public static void main(String[] args) {
		Abc obj=new Abc();
		
	}

}

class Abc extends JFrame {

	public Abc() {
		setLayout(new FlowLayout());
		JLabel l =new JLabel("Hello World");
		JLabel l1 =new JLabel("Chinmay Keripale");

		add(l);
		add(l1);
		setVisible(true);
		setSize(400, 400);
	}
	
}