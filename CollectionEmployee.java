package ds6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
* DS assignment 6
* Problem 2
* Class CollectionEmployee have collection of employees and sorts them on basis of ID and Name
*
*/
public class CollectionEmployee extends Employee {
	public static Scanner sc = new Scanner(System.in);
	HashMap<String, Employee> map = new HashMap<String, Employee>();

	ArrayList<Employee> idSortedList = new ArrayList<Employee>();
	boolean flag1 = false;
	ArrayList<Employee> nameSortedList = new ArrayList<Employee>();
	boolean flag2 = false;

	public void getEmployeeInfo() {
		String id = "";
		String name = "";
		String addr = "";
		try {
			System.out.println("enter ID");
			id = sc.next();
			System.out.println("enter name");
			name = sc.next();
			System.out.println("enter address");
			addr = sc.next();
		} catch (Exception e) {
			getEmployeeInfo();
		}

		Employee emp = new Employee(name, id, addr);
		if (!map.containsKey(id)) {
			map.put(emp.empId, emp);

			for (int i = 0; i < idSortedList.size(); i++) {
				flag1 = false;
				if (idSortedList.get(i).compareTo(emp) > 0) {
					idSortedList.add(i, emp);
					flag1 = true;
					break;
				}
			}
			if (!flag1) {
				idSortedList.add(emp);
			}
			for (int i = 0; i < nameSortedList.size(); i++) {
				flag2 = false;
				if (compare(nameSortedList.get(i), emp) > 0) {
					nameSortedList.add(i, emp);
					flag2 = true;
					break;
				}
			}
			if (!flag2) {
				nameSortedList.add(emp);
			}
		}
	}

	public static void main(String args[]) {
		CollectionEmployee obj = new CollectionEmployee();
		int exit = 1;
		while (exit != 0) {
			obj.getEmployeeInfo();
			System.out.println("enter 0 to exit");
			exit = sc.nextInt();
		}
		System.out.println("sorting on the basis of employement ID: ");
		for (int i = 0; i < obj.idSortedList.size(); i++) {
             System.out.println(obj.idSortedList.get(i).empId + "\t"
					+ obj.idSortedList.get(i).name + "\t"
					+ obj.idSortedList.get(i).address);

		}
		System.out.println("sorting on the basis of employee name: ");
		for (int i = 0; i < obj.nameSortedList.size(); i++) {
			System.out.println(obj.nameSortedList.get(i).empId + "\t"
					+ obj.nameSortedList.get(i).name + "\t"
					+ obj.nameSortedList.get(i).address);

		}
	}
}
