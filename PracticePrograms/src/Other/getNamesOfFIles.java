package Other;

import java.io.File;

public class getNamesOfFIles {

	public static void main(String[] args) {
		File folder = new File("/home/poshs/Desktop/TSLSTANDARDS/");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File "+listOfFiles[i].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }
		}
	}

}
