package com.code.practice;

import java.util.Arrays;
//Find the Largest and smallest Number from the Array.
public class FindLargestAndSmallestNumberFromArray {

	public static void main(String[] args) {
		int[] intArray= {2,3,4,5,1,8};
		int temp;
		for(int i=0;i<intArray.length;i++) {
			for (int j=0;j<intArray.length;j++) {
				if(intArray[i]<intArray[j]) {
					 temp = intArray[i];
					intArray[i]=intArray[j];
					intArray[j]=temp;
				}
			}
		}
		
		System.out.println("Total Array: "+Arrays.toString(intArray));
		System.out.println("Smallest Array: "+intArray[0]);
		System.out.println("Largest Array: "+intArray[0]);
		

	}

}
