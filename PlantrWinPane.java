/*
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;


public class PlantrWinPane extends PlantrWin{
	
	
	private int ran;
	private JButton push;
	private JLabel label;
	private JPanel Console;
	private Plant plnt;
	
	public PlantrWinPane(){
		ran = 0;
		push = new JButton("cancel stuff");
		push = new JButton("View stuff");
		push.addActionListener (new ButtonListener());
		
		label = new JLabel("Generate a Number Between 1 and 100");
		
		Console.add(push);
		Console.add(label);
		
		Console.setBackground(Color.lightGray);
		Console.setPreferredSize (new Dimension(300, 80));
		Console.setVisible(true);
		Console.setAlignmentY(1);
		}
	//Set up for Button Listener.
	private class ButtonListener implements ActionListener
		{

	//Generates Random Number and Updates Label
		public void actionPerformed (ActionEvent event)
			{
			Random generator = new Random();
			ran = Math.abs(generator.nextInt(100) + 1);
			label.setText("You Generated :" + ran);
			}
		}


	}
	
*/


