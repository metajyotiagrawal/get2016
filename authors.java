package jdbc;
/**
 * POJO class for author table in database libraryinformation
 *
 */
public class authors {
	
	private String author_id;
	private String author_nm;
	private String getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_nm() {
		return author_nm;
	}
	public void setAuthor_nm(String author_nm) {
		this.author_nm = author_nm;
	}
	

}
