import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class PlantrWin {
public static void main(String[]args){

	JButton search = new JButton("Search");
	search.setSize(80, 20);
	search.setVisible(true);
	JLabel explain = new JLabel("explain");
	JLabel Hello = new JLabel("Hello");
	JLabel help = new JLabel("help");
	
	explain.setSize(200, 100);
	
	
	JFrame frame = new JFrame ("Plantr");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setBackground(Color.lightGray);
	frame.setSize(200, 200);
	frame.add(search);
	search.setLocation(50, 600);
	frame.add(explain);
	frame.add(help);
	help.setSize(299, 212);
	frame.add(Hello);
	
	frame.setLocation(400, 300);
	
	frame.setVisible(true);

	}
}
