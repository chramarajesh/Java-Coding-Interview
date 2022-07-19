package com.code.practice;

import java.util.HashMap;
//Find the characters with Duplicate count.
public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String findDuplicate="Hanuman";
		HashMap<String, Integer> verifyDuplicateMap=new HashMap<String, Integer>();
		
		String[] splitFindDuplicate=findDuplicate.split("");
		System.out.print(splitFindDuplicate);
		
		for(String verifyDup:splitFindDuplicate) {
			if(verifyDuplicateMap.get(verifyDup)!=null) {
			verifyDuplicateMap.put(verifyDup, verifyDuplicateMap.get(verifyDup)+1);
			}else {
				verifyDuplicateMap.put(verifyDup, 1);
			}
		}

		//Print all the keys with duplicated count
		verifyDuplicateMap.forEach(
                (key, value) -> System.out.println("Key : " + key + "\t Count : " + value)
                );
		
	}

}
