package performFCFS;

public class PerformFCFS {
int[][] fcfs(int arrival_time[],int job_size[])
{
	int wait_t[]=new int[4];
	int job_start[]=new int[4];
	int job_finish[]=new int[4];
	int i,j;
	int output[][]=new int[4][5];
	job_start[0]=1;
	wait_t[0]=0;
	job_finish[0]=arrival_time[0]+job_size[0]-1;
	for(i=1;i<4;i++)
	{
		if(job_finish[i-1]>arrival_time[i])
		{wait_t[i]=job_finish[i-1]-arrival_time[i]+1;
		}
		else
		{ 
			wait_t[i]=0;
		}
		job_start[i]=arrival_time[i]+wait_t[i];
		job_finish[i]=(job_start[i]+job_size[i])-1;
	}
		for(i= 0;i<4;i++)
		{
			output[i][0]= i+1;
			output[i][1]= arrival_time[i];
			output[i][2]= wait_t[i];
			output[i][3]= job_start[i];
			output[i][4]= job_finish[i];
			
		}	
		return output;
	}
}
	