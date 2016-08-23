package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
/**
 * query class includes queries of all three assignment question
 *
 */
public class query {

	ConnectionEstablish connect = new ConnectionEstablish();
/*
 * Problem1
 * to fetch all the books published by author, given the name of the author.
 * Returns the list of books data 
 */
	public ArrayList<titles> getBookTitle() throws SQLException {
		//arrayList to store titles information of given author
		ArrayList<titles> list = new ArrayList<titles>();
			connect.getconnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter author name");
			String authorName = sc.nextLine();
            String query1 = "SELECT t.title_id,t.title_name,subject_id,publisher_id FROM titles t JOIN title_author ta ON ta.title_id=t.title_id JOIN authors a ON a.author_id = ta.author_id WHERE a.author_nm ='"
					+ authorName + "'";
            ResultSet rs1 = connect.st.executeQuery(query1);
			//to check if result set is empty
			if (rs1.next() == false) {   
				System.out
						.println("Author name does not exist OR no such book found");
				return list;
			}

			else {
				do {
					titles t = new titles();
					t.setTitle_id(rs1.getString(1));
					t.setTitle_nm(rs1.getString(2));
					t.setSubject_id(rs1.getString(3));
					t.setPublisher_id(rs1.getString(4));
					list.add(t);
				} while (rs1.next());
				
				return list;
				
			}
		 
	}
/*
 * Problem2
 * Given the name of the book, to be issued by an existing member
 * Returns flag to indicate whether the  the book has been issued or not
*/
	public boolean getMemberNameByBookTitle() {
		//ArrayList to store members name
		ArrayList<String> memberList = new ArrayList<String>();
		try {
			boolean flag = false;
			connect.getconnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Book name");
			String bookName = sc.nextLine();

			String query2 = "SELECT member_name FROM members_details m JOIN bookIssue bi ON bi.member_id=m.member_id JOIN Book b ON b.accession_num=bi.accession_num JOIN titles t ON t.title_id=b.title_id WHERE title_name='"
					+ bookName + "'";

			ResultSet rs2 = connect.st.executeQuery(query2);
			//to check if result set is empty
			if (rs2.next() == false) {
				System.out
						.println("This book has not been issued OR you have entered wrong book title ");
				return flag;

			}

			else {
				do {
					members member = new members();
					member.setMember_name(rs2.getString(1));
					memberList.add(member.getMember_name());
                   } while (rs2.next());
				ListIterator<String> itr = memberList.listIterator();
				System.out.println("Members who issued this book are:");
				do {
					System.out.println(itr.next());
				} while (itr.hasNext());
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return true;
	}
/*
 * Problem3
 * to delete all those books which were not issued in last 1 year
 *  Returns the number of books deleted
*/
	public int DeleteBooks() {
		//ArrayList to store book information which are issued in last one year
		ArrayList<books> bookList = new ArrayList<books>();
		try {
			
			connect.getconnection();

			String query3 = "DELETE FROM Book WHERE accession_num NOT IN (SELECT accession_num FROM bookIssue bi WHERE bi.issue_dt NOT BETWEEN CURDATE() AND DATE_SUB(CURDATE(),INTERVAL 8 MONTH))";
			int rs3 = connect.st.executeUpdate(query3);
			String query4 = "SELECT * FROM Book";

			ResultSet rs4 = connect.st.executeQuery(query4);

			while (rs4.next()) {
				books book = new books();
				book.setAccession_no(rs4.getString(1));
				book.setPurchase_dt(rs4.getString(2));
				book.setStatus(rs4.getInt(4));
				book.setTitle_id(rs4.getString(5));
				book.setPrice(rs4.getInt(3));
				bookList.add(book);
			}

			ListIterator<books> itr1 = bookList.listIterator();
			System.out
					.println("Books after deleting entries of books which have not been issued for last one year");
			System.out.println("TitleId\tAccessionNumb\tPrice\tPurchaseDate");
			do {
				books Book = itr1.next();
				System.out.println(Book.getTitle_id() + "\t"
						+ Book.getAccession_no() + "\t\t" + Book.getPrice()
						+ "\t" + Book.getPurchase_dt());
			} while (itr1.hasNext());
			return rs3;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
