package PFassignment1;

public class Pyramid1 {
	//function to return spaces
	String spaces(int row,int n)
	{int i=0;
	String space="";
		if(row<n){
			for(i=row;i<n;i++)
			{space=space+" ";
			}
			return space;
		}
		else{
			for(i=0;i<row-n;i++){
				space=space+" ";
		}
		return space;
		}
		}
	//function to return number
	String number(int row,int n)
	{
		String number="";
		 int counter=0;
		 if(row<=n){
			 for(int i=0;i<2*row;i++)
			 {
				if(i<row){
					counter++;
					number=number+counter;
					}
				else if(i>row)
				{
					counter--;
					number=number+counter;
				
				}
			 }
		 }
		 else if(row>n)
		 {
			 for(int i=0;i<2*(n-(row-n))-1;i++){
				 if(i<(n-(row-n))){
						counter++;
						number=number+counter;
						}
					else
					{
						counter--;
						number=number+counter;
					}
			 }
		 }
		return number;
		 
}
	 //function to return whole pyramid
	String[] printwholepyramid(int t){              
		String result[]=new String[2*t-1];
		int i;
		for(i=1;i<=2*t-1;i++){ 
			String temp1=spaces(i,t);
			String temp2=number(i,t);
			result[i-1]=temp1+temp2;
		}
		return result;
		}
	
	public static void main(String ar[]){
		Pyramid1 p1 = new Pyramid1();
		String[] output =  p1.printwholepyramid(5);
		for(int i=0;i<9;i++)
			System.out.println(output[i]);
	}
}
