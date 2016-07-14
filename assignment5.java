package assisgnment5;

public class assignment5 {
	int check_Sorted(int input[])
	{int temp=0,i=0;
		if(input[0]<input[1])
		{
			while(i<input.length)   //loop for ascending array
			{if(input[i]>input[i+1]){
				temp=1;
			     break;
			     }
			}
			if(temp==1)
			{return 0;
			}
			else
			{return 1;
			}
	     }
		else
		{
			while(i<input.length)    //loop for decending array
			{if(input[i]<input[i+1]){
				temp=1;
			     break;
			}
			}
			if(temp==1){
				return 0;
			      }
			else
			{return 2;
			}
		}
	}
		void msg(int output)
		{
		switch(output)
		{
		case 1:
			System.out.println("array is sorted in ascending order");
			break;
		case 2:
			System.out.println("array is sorted in descending order");
			break;
		case 0:
			System.out.println("array is unsorted");
			break;
		}
		}
}
