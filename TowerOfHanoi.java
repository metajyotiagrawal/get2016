package assignment4;

public class TowerOfHanoi {
	
	int index = 0;
	// function to do tower of hanoi
	public String[] towerOfHanoi(int numofdisc, char start, char auxiliary,
			char end,String[] array) {
		if (numofdisc == 1) {
			array[index]=start+" "+end;
			index++;
		} else {
			towerOfHanoi(numofdisc - 1, start, end, auxiliary,array);
			array[index++]=start+" "+end;
			towerOfHanoi(numofdisc - 1, auxiliary, start, end,array);
		}
		return array;
	}
	//function to return output array
	public String[] tow(int n){
		String arr[] = new String[(int)(Math.pow(2, n) - 1)];
		String[] output =towerOfHanoi(n, 'A', 'B', 'C', arr);
		return output;
		
	}
	//main function to check output
	public static void main(String ar[]){
		TowerOfHanoi toh = new TowerOfHanoi();
		String[] array = toh.tow(3);
		for(int i=0;i<7;i++){
			System.out.println(array[i]);
		}
	}
}
