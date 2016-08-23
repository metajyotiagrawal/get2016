package jdbc;
/**
 * POJO class for bookReturn table in database libraryinformation
 *
 */
public class book_return {
	
	private String return_dt;
	private String accession_no;
	private String member_id;
	private String issue_dt;
	public String getReturn_dt() {
		return return_dt;
	}
	public void setReturn_dt(String return_dt) {
		this.return_dt = return_dt;
	}
	public String getAccession_no() {
		return accession_no;
	}
	public void setAccession_no(String accession_no) {
		this.accession_no = accession_no;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getIssue_dt() {
		return issue_dt;
	}
	public void setIssue_dt(String issue_dt) {
		this.issue_dt = issue_dt;
	}
	

}
