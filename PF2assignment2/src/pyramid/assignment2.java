package PFassignment;

public class assignment2 {
	//function for spaces
	String spaces(int row)    
	{
		int i;
		String s="";       
		for(i=5;i>row;i--){
	        s=s+" ";
		}
		return s;                                     //return spaces
	}
	//fuction for number
	String number(int row)                   
	{
		int j=0;
		String num="";
			for(j=1;j<=row;j++){
			num=num+j;            //return numbers
			}
		return num;
	}
	//function to return whole pyramid
	String[] printwholepyramid(int n){               
	String result[]=new String[n];
	int i;
	for(i=1;i<=n;i++){ 
	String temp1=spaces(n-(i-1));
	String temp2=number(n-(i-1));
	result[i-1]=temp1+temp2;
	}
	return result;
	}

}
