 package _08_string_methods;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
String alona247 = "funny";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(alona247.charAt(2));
		// 3. Print the length of your String to the console.
		//    HINT: .length()
System.out.println(alona247.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
for (int i = 0; i < alona247.length(); i++) {
	System.out.println(alona247.charAt(i));
}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "ABC" and you are searching 
		//             for char 'b', then print "b is at index 1"
		String a = JOptionPane.showInputDialog(null, "which character do you want to search?");
for (int i = 0; i < alona247.length(); i++) {
			if((alona247.charAt(i)+"").equals(a)) {
				JOptionPane.showMessageDialog(null, a + " is at position " + i);
				
				System.out.println(alona247.charAt(i));
			
			}
	
		
		}
	}
}


