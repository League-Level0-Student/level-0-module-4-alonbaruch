package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */
		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int bo = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		int bob = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		System.out.println(bob);
		System.out.println(bo);
		if (bob == 0) {
			isWeekday = true;
			} 
		else {
			isWeekday = false;
		}
if (bo==0) {
	isVacation = true;
}
else {
	isVacation = false;
}
/*
		 * Print “sleep in�? if it is a vacation or a weekend. 
		 * If it’s a weekday, print  get up lazybones!�? 
		 * If it is a weekday, and we are on vacation, print “sleep in�?.
		 */
	if(isVacation == true && isWeekday == false) {
		System.out.println("sleep in.........");
	}
		if(isVacation == false && isWeekday == false) {
			System.out.println("sleep in.........");
		}
		if(isWeekday == true && isVacation == false) {
	System.out.println("wake up LAzyBOnE!");
		}
		if(isVacation == true && isWeekday == true) {
			System.out.println("sleep in.........");
		}
	}
	}

