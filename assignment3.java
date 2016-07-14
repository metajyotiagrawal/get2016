package assignment3;

public class assignment3 {
 int[] longestSequence(int input[])
{
	 int index=0,i,j=0,temp,max=0,length=1;
		for(temp=0;temp<input.length-1;temp++)
		{
			if(input[temp]<input[temp+1])
			{
				length++;
			}
			else
			{
				if(length>max)
				{
					max=length;
					index=temp-length+1;
				}
				length=1;
			}
		}
		int[] output = new int[max];
		for(i=index;i<(index+max);i++)
		{
			output[j++]=input[i];
		}
		return output;
	}

}
