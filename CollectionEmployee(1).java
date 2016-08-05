package DS6;

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
	HashMap<String, Employee> map = new HashMap<String, Employee>();    //map maps Employee ID with their details

	ArrayList<Employee> idSortedList = new ArrayList<Employee>();       //list for sorting by ID 
	boolean flag1 = false;
	ArrayList<Employee> nameSortedList = new ArrayList<Employee>();     //list used to sort by name
	boolean flag2 = false;

	public void getEmployeeInfo() {
		String id = "";
		String name ="";
		String addr= "";
		try{
		System.out.println("enter ID");
		String id = sc.next();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter address");
		String addr = sc.next();
		}
		catch(Exception e)
		{
			System.out.println("something went wrong try again")
			getEmployeeInfo();
		}
		Employee emp = new Employee(name, id, addr);
		if (!map.containsKey(id))         //map avoids repeated Id 
		{
			map.put(emp.empId, emp);     
              
			for (int i = 0; i < idSortedList.size(); i++)	 //loop to find position in list where new employee should be added			
			{
				flag1 = false;
				if (idSortedList.get(i).compareTo(emp) > 0) {
					idSortedList.add(i, emp);
					flag1 = true;
					break;
				}
			}   //if no employee found greater than current employee  then is being added at the end of list
			if (!flag1) {
				idSortedList.add(emp);
			}
			//same task is repeating here for sorting by name
			for (int i = 0; i < nameSortedList.size(); i++){
				flag2 = false;
				if (compare(nameSortedList.get(i), emp) > 0){
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
		for (int i = 0; i < obj.idSortedList.size(); i++){
			
			System.out.println(obj.idSortedList.get(i).empId+"\t"+obj.idSortedList.get(i).name+"\t"+obj.idSortedList.get(i).address);

		}
		System.out.println("sorting on the basis of employee name: ");
		for (int i = 0; i < obj.nameSortedList.size(); i++){
			System.out.println(obj.nameSortedList.get(i).empId+"\t"+obj.nameSortedList.get(i).name+"\t"+obj.nameSortedList.get(i).address);

		}
	}
}
