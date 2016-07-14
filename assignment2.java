package assignment2;

import java.util.Scanner;

public class assignment2 {
	int[] removeDuplicate(int input[])
	{
		
	int i,j,temp=0,k[]=new int[input.length];
	boolean indicate=true;
	for(i=0;i<input.length;i++)
	{
		for(j=0;j<temp;j++){
		if(input[i]==k[j])
		{indicate=false;
		}
		}
		if(indicate==true){
			k[temp]=input[i];
		     temp++;
		}
		indicate=true;
	}
		int output[]=new int[temp];
	for(i=0;i<temp;i++){
		output[i]=k[i];
	}

	return output;
	}
	}

