package OOPS3;
/**
 * class to ceck all rules of tic tac toe
 */
public class RuleCheck {
	private static boolean win=false;
	/*
	 * function to check row is filled with same symbol
	 */
private static boolean rowcheck(int row,int column,char symbol){
	for(int i=0;i<3;i++){
		if(State.getGrid(i,column)!=symbol){
				return false;
			
			}
	}
	return true;
}
/*
 * fuction to check column is filled with same symbol
 */
			private static boolean columncheck(int row,int column,char symbol){
				for(int i=0;i<3;i++){
					if(State.getGrid(row,i)!=symbol){
							return false;
						}
				}
						return true;
			}
			/*
			 * fuction to check leftrow
			 */
		public static boolean checkLeftDiagnol(char symbol){
			int i,j;
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(i==j){
				if(State.getGrid(i, j)!=symbol)
				{
					return false;
				}
			}}}
				return true;
		}
		/*
		 * function to check right row
		 */
		public static boolean checkRightDiagnol(char symbol){
			int i,j;
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(i+j==3){
				if(State.getGrid(i, j)!=symbol)
				{
					return false;
				}
			}}}
				return true;
		}
		/*
		 * fuction to check the winning condition
		 */
		public static void checkWinner(int row,int column,char symbol){
			if(checkLeftDiagnol(symbol)||checkRightDiagnol(symbol)||columncheck(row, column, symbol)||rowcheck(row,column,symbol)){
			RuleCheck.setwin(true);
			}
			RuleCheck.setwin(false);
		}
		//to set the value to win
		public static void setwin(boolean win){
			 RuleCheck.win=win;
		}
		//to get the value of win
		public static boolean getwin(){
			return win;
		}
public static void main(String args[])
{
	RuleCheck r=new RuleCheck();
}
}
