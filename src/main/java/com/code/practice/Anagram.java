package com.code.practice;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// Annagram verification
		
		String word ="Angel"; 
		String anagram="Angee";
		HashMap<String,String> map=new HashMap<String, String>();
		
		if(word.length()==anagram.length()) {
			char[] wordArray=word.toCharArray();
			char[] anagramArray=anagram.toCharArray();
			
			for(char wordAlphabet:wordArray) {
				for (char anagramAlphabet: anagramArray ) {
					if(wordAlphabet==anagramAlphabet) {
						map.put(String.valueOf(wordAlphabet), "1");
						break;
					}
				}
				
			}
			
			if(map.values().contains(0)) {
				System.out.println(word +" && "+ anagram+" Not an Anagram..." );
			}else{
				System.out.println(word +" && "+ anagram+" are Anagram..." );
			};
		}
		else{
			System.out.println(word +" && "+ anagram+" Not an Anagram..." );
		};

	}

}
