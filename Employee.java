package DS6;

import java.util.Comparator;

/**
 * Employee class defines an employee with employeeID->empId,name
 * ->name,address-> address
 *
 */
public class Employee implements Comparable<Object>, Comparator<Employee> {
	public String name;
	public String empId;
	public String address;

	// default constructor
	public Employee() {

	}

	// constructor with argument
	public Employee(String name, String id, String addr) {

		this.name = name;
		this.empId = id;
		this.address = addr;

	}

	public String getName() {
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	// to compare on id basis
	@Override
	public int compareTo(Object emp) {
		return getEmpId().compareTo(((Employee) emp).getEmpId());

	}

	// to compare on name basis
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}
