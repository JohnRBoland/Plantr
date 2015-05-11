/*
 PlntrRsltPane.java	 
 CSIT 211 Final Project    
 Updated: 10.5.2015
 Programmer: John Boland
 
 Display's Plant Object data in a Small Window  

 */





import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PlntRsltPane{
	private JLabel Name;
	private JLabel SunEx;
	private JLabel Soil;
	private JLabel h2o;
	private JLabel D2Mat;
	private JLabel sprd;
	private JLabel desc;
	
	private JPanel Console;

	PlntRsltPane(Plant plnt){

		Name = new JLabel("Name:\t\r"+ plnt.getName());	
		SunEx = new JLabel("Sun Exposure: \t\r" + plnt.getSnExp());
		Soil = new JLabel("Soil:\t \r"+ plnt.getSoilPh());
		h2o = new JLabel("Water:\t\r"+ plnt.getWater());
		D2Mat = new JLabel("Days to Maturity:\t\r" + plnt.getDay2Ma());
		sprd = new JLabel("Seed Spread:\t\r" + plnt.getSprdInch());
			sprd.setBackground(Color.DARK_GRAY);
		desc = new JLabel("Description:\t\n" + plnt.getDescription());
			desc.setBackground(Color.lightGray);

		Console = new JPanel();
		JFrame frame = new JFrame();
		
		frame.add(Console);
		frame.setSize(200,200);
		Console.add(Name);
		Console.add(SunEx);
		Console.add(Soil);
		Console.add(h2o);
		Console.add(D2Mat);
		Console.add(sprd);
		Console.add(desc);
		frame.setContentPane(Console);
		
		Console.setVisible(true);
		frame.setVisible(true);
	}
}




