package main;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList; 

public class NameGenerator {
	
	private ArrayList<String> name_list = new ArrayList<String>();
	
	public NameGenerator() throws FileNotFoundException {
		File getCSVFiles = new File("./name.csv");
		Scanner sc = new Scanner(getCSVFiles);
		sc.useDelimiter("\n");
		sc.next();
		while (sc.hasNext()) {
			name_list.add(sc.next().split(",")[1]);
		}
		sc.close();  
	}
	
	private int randomNumber() {
		int n = (int)((float)Math.random() * (float)this.name_list.size());
		return n;
	}
	
	public String getName() {
		return name_list.get(randomNumber());
	}
}
