package oopsession2;

public class Questions implements Comparable<Questions>{
	
	String ques;
	
	public String getQues() {
		return ques;
	}
	
	public void setQues(String ques) {
		this.ques = ques;
	}
	
	public int compareTo(Questions sf) {
		return ques.compareTo(sf.getQues());
	}
}
