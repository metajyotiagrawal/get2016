package jdbc;

/**
 * POJO class for titles table in database libraryinformation
 *
 */
public class Titles {

	private String title_id;
	private String title_nm;
	private String subject_id;
	private String publisher_id;

	public String getTitle_id() {
		return title_id;
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	public String getTitle_nm() {
		return title_nm;
	}

	public void setTitle_nm(String title_nm) {
		this.title_nm = title_nm;
	}

	public String getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}

	public String getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(String publisher_id) {
		this.publisher_id = publisher_id;
	}

}
