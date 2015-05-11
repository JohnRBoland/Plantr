/*
 PlntrRsltPane.java	 
 CSIT 211 Final Project    
 Updated: 10.5.2015
 Programmer: John Boland
 
 Display's Plant Object data in a Small Window  

 */


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;


public class PlntRsltPane{
	private JTextArea Name;
	private JTextArea SunEx;
	private JTextArea Soil;
	private JTextArea h2o;
	private JTextArea D2Mat;
	private JTextArea sprd;
	private JTextArea desc;
	private JPanel Console;



	PlntRsltPane(Plant plnt){
		
		JFrame frame = new JFrame();
		frame.setSize(200,400);
		JPanel Console = new JPanel();
		
		Name = new JTextArea("Name: "+ plnt.getName());	
		Name.setBounds(6, 5, 186, 16);
		Soil = new JTextArea("Soil: "+ plnt.getSoilPh());
		Soil.setBounds(7, 26, 185, 16);
		h2o = new JTextArea("Water: "+ plnt.getWater());
		h2o.setBounds(6, 68, 186, 16);
		D2Mat = new JTextArea("Days to Maturity: " + plnt.getDay2Ma());
		D2Mat.setBounds(7, 89, 185, 16);
		sprd = new JTextArea("Seed Spread: " + plnt.getSprdInch());
		sprd.setBounds(6, 110, 186, 16);
			
		desc = new JTextArea("Description: " + plnt.getDescription());
		desc.setBounds(6, 131, 186, 55);
			desc.setBackground(Color.lightGray);
		Console.setLayout(null);

		Console.add(Name);
		Console.add(Soil);
		SunEx = new JTextArea("Sun Exposure:  " + plnt.getSnExp());
		SunEx.setBounds(6, 47, 186, 16);
		Console.add(SunEx);
		Console.add(h2o);
		Console.add(D2Mat);
		Console.add(sprd);
		Console.add(desc);
		Console.setVisible(true);
		frame.setContentPane(Console);
		frame.setVisible(true);
		
}
}

