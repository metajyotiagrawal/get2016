package Queue;

import java.util.ArrayList;
/**
 * class to provide counseling on the basis of rank
 * College names with seats are stored in a list
 * Students according to there ranks are stored in a queue
 *
 */
public class Counseling {

	ArrayList<College> colList = new ArrayList<College>();    //Array list of colleges
	Queue<Student> stuqueue=new Queue<Student>();          //Queue of Students 
	String[] secondRoundStudents ;
	int cnt=0,sec = 0;  //cnt is to traverse array having result of counseling
	                    //sec is to traverse array having students name in second counseling
public void addlist(College C){
		colList.add(C);
	}

/*
 * counseling process
 * returns an array having student name and corresponding college provided in counseling
 */
public String[][] doCounselling()
{
	
	//Queue<Student> secCounsel=new Queue<Student>();
	String outArray[][]=new String[stuqueue.maxlength][2];
	secondRoundStudents = new String[5];                  //stores students name who are 
	                                                      //participating in second counseling
	for(int i=0;i<stuqueue.maxlength;i++)
	{
		Student s=(Student) stuqueue.deQueue();
		if(s.choice.noOfSeats>0)
		{
			s.choice.noOfSeats--;
			outArray[cnt][0]=s.name;
			outArray[cnt][1]=s.choice.Colname;
			cnt++;
		}
		else
		{
			secondRoundStudents[sec]=s.name;
			sec++;
		}
	}
	
	return outArray;
	}

/*
 * to print second counseling students 
 */

public void showsecondArray()
{
	System.out.println("students in 2nd round are:");

	for(int i=0;i<sec;i++)
	{
		System.out.println(secondRoundStudents[i]);
	}

}

/*
 * to print results of counseling
 */
public void showResult(String[][] ss)
{
	for(int i=0;i<cnt;i++)
	{
		for(int j=0;j<ss[0].length;j++)
		{
			System.out.print(ss[i][j]+"\t");
		}
		System.out.println();
	}
}

/*
 * makes a queue of students according to there ranks
 */
public void makeStudentQueue(Student[] students)
{

	for(int n=0;n<students.length ;n++)
	{
		
		int min=100,index=0;
	
	for(int i=0;i<students.length;i++)
	{
		if(min>students[i].rank)
		{
			min=students[i].rank;
			index=i;
			
		}
		
	}
	stuqueue.enQueue(students[index]);
	students[index].rank = 1000;
	}
}


public static void main(String args[])
{
	Counseling obj = new Counseling();
	College C1=new College("Jecrc",1);
	College C2=new College("Skit", 2);
	College C3=new College("Pce", 2);
	Student[] students = {new Student("A",3,C1),new Student("B",9,C2),new Student("C", 5, C1),new Student("D", 4, C1),new Student("E", 2, C2)};
    obj.makeStudentQueue(students);
    obj.showResult( obj.doCounselling());
    obj.showsecondArray();

}
}
