package DS4;
/**
 * Class to define Job parameters
 * profile for job profile
 * priority to set priority of job profile
 *
 */
public class Job {
	int priority;
	String profile;
	public Job(){
		
	}
	
	//constructor to set priority of profile
	public Job(String profile){
		this.profile=profile;
		this.priority=setPriority(this);
		
	}

	public Job(int P,String pro)
	{
		this.priority= P;
		this.profile = pro;
	}
	public int setPriority(Job job)
	{
		switch(job.profile)
		{
		case "chair":
			job.priority = 4;
			
			break;
		case "professor":
			job.priority= 3;
			break;
		case "graduate student":
			job.priority= 2;
			break;
		case "under graduate student":
			job.priority= 1;
			break;
			default :
				job.priority= -1;
				break;
		}
		return job.priority;
	}

}
