package Queue;
 /**
  * Class student defines students college choice and rank
  *
  */
public class Student {

	
	public String name;
	public College choice;
	public int rank;
	
	//constructor with parameters
	public Student(String nm,int rnk,College Clg){
		this.name=nm;
		this.rank=rnk;
		this.choice=Clg;
	}
	
}
