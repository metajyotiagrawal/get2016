package jdbc;

/**
 * POJO class for bookIssue table in database libraryinformation
 *
 */
public class Book_issue {

	private String issue_dt;
	private String accession_no;
	private String member_id;
	private String due_dt;

	public String getIssue_dt() {
		return issue_dt;
	}

	public void setIssue_dt(String issue_dt) {
		this.issue_dt = issue_dt;
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

	public String getDue_dt() {
		return due_dt;
	}

	public void setDue_dt(String due_dt) {
		this.due_dt = due_dt;
	}

}
