package OOPS4;

import java.util.Scanner;
/**
 * Consider Edit as a main menu
 * to check which submenu is selected by user
 * fontSize and fontStyle are two sub menu of Edit menu
 * fontSize variable is to enter available fontsizes
 * fontStyle variable is to enter available fontstyles
 * @author jyoti
 *
 */
public class EditMenu {
	private int fontSize[] = { 1, 2, 3, 4, 5 };        //available fontsize
	private String fontStyle[] = { "Arial", "Denmark", "CG Omega", "Courier",
			"BinnerD"};                      //available fontstyles that can be selected
	public void check(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter submenu");
		String submenu=sc.nextLine();
		if(submenu.equalsIgnoreCase("fontSize"))
		{
			getFontSize();
		}
		else if(submenu.equalsIgnoreCase("fontStyle"))
		{
			getFontStyle();
		}
		else
		{
			System.out.println("Invalid Choice");
		}
	}	
	
/*
 * fuction to enter font size by user
 */
	public void getFontSize() {
		System.out.println("Available Font Size");
		for (int i = 0; i < 5; i++) {
			System.out.print(fontSize[i] + "  ");
		}
		System.out.println();
		Scanner in = new Scanner(System.in);                             
		//enter fontStyle by user
		System.out.println("Enter Font Size");
		int fontS = in.nextInt();    
		if (fontS == 1 || fontS == 2 || fontS == 3 || fontS == 4 || fontS == 5) {
			System.out.println(fontS);
		} else {
			System.out.println("Invalid Choice");                     //if user enter other than available choices
		}
	}
/*
 * function to enter fontstyle by users
 */
	public void getFontStyle() {
		System.out.println("Available Font Style");
		for (int i = 0; i < 5; i++) {
			System.out.print(fontStyle[i] + "  ");
		}
		Scanner tu = new Scanner(System.in);
		System.out.println("Enter Font Style");
		String fontSty = tu.nextLine();                   //enter fontStyle by user
		if (fontSty.equalsIgnoreCase("Arial") || fontSty.equalsIgnoreCase("Denmark")|| fontSty.equalsIgnoreCase("CG Omega")
				|| fontSty.equalsIgnoreCase("Courier") || fontSty.equalsIgnoreCase("BinnerD")) {
			System.out.println(fontSty);
		} else {
			System.out.println("Invalid Choice");               //if user enter other than available choices
		}
	}

	public static void main(String args[]) {
		EditMenu e = new EditMenu();
		e.getFontSize();
		e.getFontStyle();
	}
}
