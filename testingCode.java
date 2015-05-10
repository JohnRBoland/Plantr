
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class testingCode {
public static void main(String [] args){
	List<Plant> plantList = new ArrayList<Plant>();
	PlnLstConst i = new PlnLstConst();
	try {
		plantList = i.PlantConstructor("/Users/johnboland/Documents/workspace/Practice programs/src/funPrograms/newcopy.txt");
	} catch (FileNotFoundException e) {
		System.out.print("FileNotFound");
		e.printStackTrace();
	}
	for (Plant plnt: plantList) {
		if(plnt.getName().contains("a")){
	System.out.println(plnt.toString());}
	}
	
	}
}
