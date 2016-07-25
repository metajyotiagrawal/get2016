package OOPS3;

public class Turn {
	private static int playerTurn;
	private static int turnCount;

	/*
	 * reurn the playerturn
	 */
	public static int getPlayerTurn() {
		return playerTurn;
	}

	/*
	 * set the turn of player
	 */
	public static void setPlayerTurn() {

		Turn.playerTurn = (++playerTurn) % 2;
	}

	/*
	 *  return the number of turn takes place
	 */
	public static int getturnCount() {
		return turnCount;
	}

	/*
	 *  set the number of turns
	 */
	public static void setturnCount() {
		turnCount++;                             //update the count value
	}
}
