package assignment9_4;

import java.util.Comparator;

/**
 * @author MANJUNATH
 *
 *         Below CompareEmployee class implement the Comparator interface, and
 *         override the default compare method. This class get the Employee
 *         class object and assigned it with variable. will compare the
 *         Employees salary, if the salary is same then compared with employee
 *         name. if employee name is same then it'll compare with employee
 *         designation
 *
 */
public class CompareEmployee implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) { // override the default compare method of Comparator interface.

		Employee employeeOne = emp1; // user defined 1st object
		Employee employeeTwo = emp2; // user defined 2nd object

		if (employeeOne.getEmployeeSalary() < employeeTwo.getEmployeeSalary()) { // compares the salary of the employees
																					// if employee1 salary is less than
																					// employee 2 then it returns -1,
																					// it's already in sorted order.
			return -1;
		} else if (employeeOne.getEmployeeSalary() > employeeTwo.getEmployeeSalary()) { // compares the salary of the
																						// employees if employee1 salary
																						// is greater than employee 2
																						// then it returns 1, sort the
																						// salary in ascending order.
			return 1;
		} else if (employeeOne.getEmployeeSalary() == employeeTwo.getEmployeeSalary()) { // compares the salary of the
																							// employees if employee1
																							// salary is equals to
																							// employee 2 then sort the
																							// employee data by employee
																							// name alphabetically.
			if (!(employeeOne.getEmployeeName().equalsIgnoreCase(employeeTwo.getEmployeeName()))) {
				return employeeOne.getEmployeeName().compareTo(employeeTwo.getEmployeeName());
			} else {
				return employeeOne.getEmployeeDesignation().compareTo(employeeTwo.getEmployeeDesignation()); // if
																												// salary
																												// and
																												// name
																												// both
																												// are
																												// same
																												// then
																												// sort
																												// the
																												// employee
																												// data
																												// by
																												// designation
																												// of
																												// the
																												// employee
			}
		} else {
			return 0;
		}
	}

}
