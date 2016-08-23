package jdbc;
/**
 * POJO class for title_author table in database libraryinformation
 *
 */
public class title_author {
	
	private String title_id;
	private String author_id;
	private String getTitle_id() {
		return title_id;
	}
	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}
	public String getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}
	

}
