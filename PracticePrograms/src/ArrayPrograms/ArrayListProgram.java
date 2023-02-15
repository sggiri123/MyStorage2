package ArrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Shridhar");
		list.add("Shashank");
		list.add("Pranjal");
		list.add("Pranjal");
		list.add("Pranjal");
		
	
		for (int i =0; i<list.size(); i++) {
			
			if (list.get(i).startsWith("S") || list.get(i).startsWith("s")) {
				System.out.println(list.get(i));
			}
			   list.get(i).toLowerCase().startsWith("s");
		}
	Set<String> StringList = new LinkedHashSet<>(list);
	
	//list.clear();
	//StringList.addAll(StringList);
	
	System.out.println(StringList);
		
	}

}
