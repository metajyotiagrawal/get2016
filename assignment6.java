package assignment6;

public class assignment6 {
	int[] join(int a[],int asize,int b[],int bsize,int c[])
	{
		int i=0,j=0,k=0;
		while(i<asize && j<bsize){
			if(a[i]<b[j]){
				c[k]=a[i];
			     i++;
			     k++;
			      }
			else{
				c[k]=b[j];
			     j++;
			     k++;
			     }
	          }
		while(i<asize){
			   c[k]=a[i];
		       i++;
		       k++;
		        }
		while(j<bsize)
		{c[k]=b[j];
		j++;
		k++;
		}
          return c;
	
	}}
	


