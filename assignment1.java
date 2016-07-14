package PF1assignment1;

import java.util.Scanner;

public class assignment1 {
	
	public int toDecimal(int num)
	{int count=0,bin,sum=0;
	while(count<3)
	{bin=(num%10)*(int)Math.pow(2,count);
	sum=sum+bin;
	num=num/10;
	count++;
	}
		return sum;
		
	}

	public int convertToOctal(int x)
	{int rem,count=0;
	int sum=0,temp=x;
	while(temp>0)
	{rem=temp%1000;
	sum=sum+toDecimal(rem)*(int)Math.pow(10, count);
	count++;
	temp=temp/1000;
	}
	return sum;
	}
}

	

