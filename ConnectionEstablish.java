package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * class to establish connection with database
 */
public class ConnectionEstablish {

	Statement st;

	/*
	 * to establish connection steps include load or register driver establish
	 * connection using connection class create statement using statement class
	 */
	public Statement getconnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String host = "jdbc:mysql://localhost:3306/";
			String DBname = "libraryinformation";
			String mysqlURL = host + DBname;
			Connection con = DriverManager.getConnection(mysqlURL, "root",
					"jyoti");
			DatabaseMetaData db=con.getMetaData(); 
			
			if(st==null){
				st = (Statement) con.createStatement();
				return st;
			}
			else
			{
				return st;
			}
		} catch (ClassNotFoundException ex) {
			System.out.println("Error loading driver");
			return st;
		}

	}

	public static void main(String args[]) throws SQLException {
		Query Q = new Query();

		try {
			ArrayList<Titles> titleList = Q.getBookTitle();

			ListIterator<Titles> itr = titleList.listIterator();
			System.out.println("TitleId\tTitleName\tSubjectId\tPublisherId");
			do {
				Titles newTitle = itr.next();
				System.out.println(newTitle.getTitle_id() + "\t"
						+ newTitle.getTitle_nm() + "\t"
						+ newTitle.getSubject_id() + "\t\t"
						+ newTitle.getPublisher_id());
			} while (itr.hasNext());
		} catch (NoSuchElementException e) {
			System.out.println("No Such Element Found");
		}
		Q.getMemberNameByBookTitle();
		int deletedBooks = Q.DeleteBooks();
		System.out.println("Number of books deleted :" + deletedBooks);

	}
}
