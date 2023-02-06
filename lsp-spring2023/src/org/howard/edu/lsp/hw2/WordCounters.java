package org.howard.edu.lsp.hw2;

import java.io.*;
import java.util.HashMap;

import org.howard.edu.lsp.utils.FileReader;


//Author: Aeman Almotairi (@02959924)

public class WordCounters {
	
	/**
	 * this method reads a text file and counts the number of times each word that it contains appears
	 * @param args
	 * @throws FileNotFoundException
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
	    // create a new  FileReader
		FileReader fr = new FileReader();
		
		// Create a HashMap to store the word count
		HashMap<String, Integer> Counter = new HashMap<>();
		
		// read text from file 'fr' and store it into the variable 'inputs'
		String  inputs= fr.readToString("main/resources/Words.txt");
		
		// Split the text into words
		String[] words =inputs.split(" ") ;
		
		
		 for (String word: words) {
         	// Check the length of the word and if it contains only alphabets
         	if(word.length() > 3 && word.matches(".*[a-zA-Z]+.*")){
         		
         		// Convert to Lower Case
         		word = word.toLowerCase();
         		
         		//increment the count for each word
         		if (Counter.containsKey(word)) {
       
         			Counter.put(word, Counter.get(word) + 1);
         			
         		} else {
         			
         			Counter.put(word, 1);
         		}
         		
         	}
         }
		
		 
		 //// Print the result
		 for (String word: Counter.keySet()) {
             System.out.println(word + "\t" + Counter.get(word));
         }
	}
}
	
		
            

