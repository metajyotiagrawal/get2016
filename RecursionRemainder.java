package assignment3;

public class RecursionRemainder {
	// function to calculate remainder
	int remainder(int x,int y)
	{
	if(y==0&&x<0){                      //to check illegal condition
		throw new IllegalArgumentException();
	}
	if((x<y){                          
	    return x;
	       }
	else{
	        return(remainder(x-y,y));
	}
	}
}
