package DS6;

import java.util.Comparator;
/**
 * DS assignment 6 
 * problem 1
 * Employee class defines an employee with employeeID->empId,name ->name,address-> address
 * Comparable and Comparator interfaces are implemented for sorting 
 */
	public class Employee implements Comparable ,Comparator<Employee>{
		public String name;
		public String empId;
		public String address;
		
		//default constructor
		public Employee() {
		
		}
		
		//constructor with arguments
		public Employee(String name,String id,String addr)
		{
			
			this.name=name;
			this.empId=id;
			this.address=addr;
			
		}
	public String getName(){
		return name;
	}

		public String getEmpId() {
		return empId;
	}
	    //compare on the basis of ID
		@Override
		public int compareTo(Object emp) {
	return getEmpId().compareTo(((Employee)emp).getEmpId());

		}
		
		//comparision on the basis of name
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.name.compareTo(o2.name);
		}
}
