package oopsassignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class Calculator implements ActionListener{
		private Digit[] digit;
		private Operator[] operator;
		private Layout layout;
		private Display display;
		
		public Calculator(){
			//do nothing constructor
		}
		
		public Calculator(int digit, int operator) {
			//initialize all the objects
		}

		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//logic for action when the buttons are clicked
		}
		
		public Digit[] getDigits() {
			//sending the reference for 
			return digit;
		}
}




