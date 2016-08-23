package jdbc;

/**
 * POJO class for Book table in database libraryinformation
 *
 */
public class Books {
	private String accession_no;
	private String title_id;
	private String purchase_dt;
	private int price;
	private int status;

	public String getAccession_no() {
		return accession_no;
	}

	public void setAccession_no(String accession_no) {
		this.accession_no = accession_no;
	}

	public String getTitle_id() {
		return title_id;
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	public String getPurchase_dt() {
		return purchase_dt;
	}

	public void setPurchase_dt(String purchase_dt) {
		this.purchase_dt = purchase_dt;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
