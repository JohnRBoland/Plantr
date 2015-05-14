	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.List;
	import javax.swing.JOptionPane;

public class PlantrPops {

	public static void main(String [] args){
		int j = 0;
		int again = 1;
		int onCheck; 
		String search;
		String message;
		
		
		String fileLocation = "/Users/johnboland/Documents/workspace/Practice programs/src/funPrograms/newcopy.txt";
		
		List<Plant> plantList = new ArrayList<Plant>();
		PlnLstConst i = new PlnLstConst();
		
		try {
			plantList = i.PlantConstructor(fileLocation);
		} catch (FileNotFoundException e) {
			System.out.print("FileNotFound");
			e.printStackTrace();
		}
		
		
		onCheck = JOptionPane.showConfirmDialog(null, "This Plantr application will search for plants based on name and will return relevent information");

		if(onCheck == JOptionPane.OK_OPTION){
		do	{
			message = "Search Plantr for...";
			search = JOptionPane.showInputDialog(message, "Please enter a Plant Name");				
			
			
			
			for (Plant plnt: plantList) {
				if(plnt.getName().toLowerCase().contains(search.toLowerCase())){
				PlntRsltPane A = new PlntRsltPane(plnt);	
				j++;}
				if(j == 0){
				message = "Search \"" + search +"\" found no matches";
				search = JOptionPane.showInputDialog(message, "Please enter a Plant Name" );
				}
			}
			again = JOptionPane.showConfirmDialog(null, "Would you like to search for another plant?");
		}while( again == JOptionPane.YES_OPTION);	

		
	}//end of plantr

	JOptionPane.showMessageDialog(null, "Thank you for using the Plantr app. \r Good-bye");
		
		
		}
	}



