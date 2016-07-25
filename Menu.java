package OOPS4;

import java.util.Scanner;

/**
 * to check which menu is selected by user
 * two menu=Edit,FileChoose
 * if Edit is choosen then EditMenu class is called
 * if FileChoose is choosen then FileChooseMenu is called
 * @author jyoti
 *
 */
public class Menu {
public static void main(String args[])
{  Scanner sc=new Scanner(System.in);
System.out.println("enter menu");
String menu=sc.nextLine();
if(menu.equalsIgnoreCase("Edit"));
{
	EditMenu e=new EditMenu();                     //object of edit class
	e.check();
}
if(menu.equalsIgnoreCase("FileChoose")){
	FileChooseMenu fc=new FileChooseMenu();            //object of fileChoose class
	fc.getUserChoice();
}

}
}