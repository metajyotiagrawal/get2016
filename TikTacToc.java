/**
 * 
 */
package assignment;

import java.util.Scanner;

/**
 * @author Ajinkya pande
 *
 */
public class TikTacToc {
	public static void main(String ar[]) {
		State.makeGridEmpty();
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to play with human or computer");
		System.out.println("Press 1 for human \n 2 for computer");
		System.out.println("Please Enter your choice");
		String ch = sc.nextLine();
		while (ch.length() > 1 || !ch.equals("1") && !ch.equals("2")) {
			System.out.println("Please enter correct choice");
			ch = sc.nextLine();
		}
		int choice = Integer.parseInt(ch);
		if (choice == 1) {
			Player[] p1 = new Player[2];
			p1[0] = new Player('X');
			p1[1] = new Player('O');
			while (Turn.getturnCount() < 9) {
				p1[Turn.getPlayerTurn()].makeMove(sc);
				State.showgrid();
				if (RuleCheck.isWin()) {
					System.out.println(p1[Turn.getPlayerTurn()].playerName()
							+ " Wins !!!!");
					break;
				}
				Turn.setturnCount();
				Turn.setPlayerTurn();
			}
		} else {
			Player p1 = new Player('X');
			ComputerAI com = new ComputerAI('O');
			while (Turn.getturnCount() < 9) {
				if(Turn.getPlayerTurn() == 0){
					p1.makeMove(sc);
				}else{
					com.makePlay();
				}
				State.showgrid();
				if (RuleCheck.isWin() && Turn.getPlayerTurn() == 0) {
					System.out.println(p1.playerName() + " Wins !!!!");
					break;
				}else if(RuleCheck.isWin() && Turn.getPlayerTurn() == 1){
					System.out.println("Computers Wins !!!!");
					break;
				}
				Turn.setturnCount();
				Turn.setPlayerTurn();
			}
		}
		if (Turn.getturnCount() == 9) {
			System.out.println("Match is draw !!!!!!");
		}
	}
}
