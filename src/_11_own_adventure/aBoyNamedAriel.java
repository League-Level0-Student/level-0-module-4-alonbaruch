package _11_own_adventure;

import javax.swing.JOptionPane;

public class aBoyNamedAriel {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Once upon a time there was a boy named ariel and he was very stupid. Once he went in his bed and ");
	String a = JOptionPane.showInputDialog(null, "went to sleep or gos' on his phone");
	if(a.equals("left")) {
		JOptionPane.showMessageDialog(null, "Once upon a time there was a boy named ariel and he was very stupid. Once he went in his bed and went to sleep. The end");
	System.exit(0);
	}
	if(a.equals("right")) {
		JOptionPane.showMessageDialog(null, "Once upon a time there was a boy named ariel and he was very stupid. Once he went in his bed and went on his phone.");
	}
	JOptionPane.showMessageDialog(null, "He was wondering what app he should go on youtube or class royal. ");
	String b = JOptionPane.showInputDialog(null, "Y or C");
	if(b.contentEquals("Y")) {
		JOptionPane.showMessageDialog(null, "He was wondering what app he should go on youtube or class royal and after a while he decided to go on youtube. Then he fell aslepp. YOU WON. the end.");
	}
	if(b.contentEquals("C")) {
		JOptionPane.showMessageDialog(null, "He was wondering what app he should go on youtube or class royal and after a while he decided to go on class royal. Then he fell aslepp with a nightmare."
				+ "you lose. the end.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}