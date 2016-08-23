package jdbc;
/**
 * POJO class for subjects table in database libraryinformation
 *
 */
public class subjects {
	private String subject_id;
	private String subject_nm;
	private String getSubject_id() {
		return subject_id;
	}
	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}
	public String getSubject_nm() {
		return subject_nm;
	}
	public void setSubject_nm(String subject_nm) {
		this.subject_nm = subject_nm;
	}
	

}
