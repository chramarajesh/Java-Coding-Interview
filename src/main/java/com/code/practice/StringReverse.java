package com.code.practice;
public class StringReverse {
//Reverse of the string.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverse = "";
		String readyToReverse = "Hello How Are you";
		for (int i = readyToReverse.length() - 1; i >= 0; i--) {
			reverse = reverse + readyToReverse.charAt(i);
		}
		System.out.println(reverse);
	}

}
