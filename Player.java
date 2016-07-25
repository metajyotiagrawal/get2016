package OOPS3;

import java.util.Scanner;

public class Player {
private char symbol;
public Player(){
	
}
public Player(char ch){
	this.symbol=ch;
}
//returning the player name
public String playerName(){
	return "Player"+symbol;
}
public void makeMove()
{Scanner sc=new Scanner(System.in);
	System.out.print(playerName()+"chance to play");
	System.out.println();
	System.out.print("enter the row");
	int row=sc.nextInt();
	System.out.print("enter the column");
	int column=sc.nextInt();
	State.setGrid(row, column,symbol);
	RuleCheck.checkWinner(row, column, symbol);
}
	public static void main(String args[])
	{Player p=new Player();
	}
}
