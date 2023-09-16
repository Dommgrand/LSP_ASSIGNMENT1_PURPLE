package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class WordCount {
	/**
	 * Dom Fraser
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader filename = new FileReader(); //reads file
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); //creates hash map
		try {
			String filepath = filename.readToString("main/java/resource/words.txt"); //obtains file path
			System.out.println(filepath);
			String[] separated = filepath.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" "); //removes non chars, changes string to lower case, and separates string
			//String[] separated = filepath.toLowerCase().split(" "); //separates string
			for (int x = 0; x < separated.length; x++) { //iterates over separated string
				if (separated[x].length() > 3) { //checks for 3 or more chars 
					if (hashmap.get(separated[x]) == null) {
						hashmap.put(separated[x], 1); //initiates occurrences to 1
							}
					else {
						hashmap.put(separated[x], hashmap.get(separated[x]) +1);
					}
				}
				
			}
			for (String i : hashmap.keySet()) {
				System.out.println(i + " " + hashmap.get(i)); //prints hash map key
			}
		}
		catch (FileNotFoundException e) { //catches errors
			System.out.println("File not found in directory");
		}
		}

	}
