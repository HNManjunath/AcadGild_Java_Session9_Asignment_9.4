package assignment9_4;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author MANJUNATH
 *
 *         Below class is to implement sorting function using comparator.
 *         Getting the properties from the Employee class and sorting the
 *         employees based on the employee salary, employee name or employee
 *         designation. If two employees have the same salary then consider
 *         alphabetical orders of their names,If two employees have the same
 *         name then consider designation for comparison.
 *
 */
public class EmployeeMainClass {
	private static Scanner sc;

	/**
	 * @param args
	 */
	// Main method starts...
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long empSalary = 0; // Declaring and initializing local variables for Employee class object.
		String empName = "";
		String empDesignation = "";
		TreeSet<Employee> employeeTreeSet = new TreeSet<Employee>(new CompareEmployee()); // Creating treeset object for
																							// Employee class
		sc = new Scanner(System.in); // Scanner class object to get the input from the user.
		int input = 0;

		while (true) {
			System.out.println("\nEnter 1: Insert Employee Data\t2:Display Employee Data\t3:Exit");
			input = sc.nextInt(); // Getting the input from the user to insert/display the Employee data

			if (input == 1) { // if user input is 1, then it prompt user to insert the employee
								// name,designation and salary
				System.out.println("Enter Employee Name:");
				sc.nextLine();
				empName = sc.nextLine(); // To get employee name and assign the value to empName variable.
				System.out.println("Enter Employee Designation:");
				empDesignation = sc.nextLine(); // To get employee designation and assign the value to empdesignation
												// variable.
				System.out.println("Enter Employee Salary:");
				empSalary = sc.nextLong(); // To get employee salary and assign the value to empSalary variable.
				employeeTreeSet.add(new Employee(empName, empDesignation, empSalary)); // Final data will be added to
																						// Employee class constructor.
			} else if (input == 2) { // if the user input is 2 then application will display the Employee list.
				System.out.println("Employee data in sorted order:");
				System.out.println(
						"-----------------------------------------------------------------------------------------\n");
				for (Employee employeedata : employeeTreeSet) { // Iterate the sorted data present in the
																// employeeTreeSet
					System.out.println("Employee Name:	" + employeedata.getEmployeeName() + "	,	"
							+ "Employee Designation:	" + employeedata.getEmployeeDesignation() + "	,	"
							+ "Employee Salary:	" + employeedata.getEmployeeSalary()); // Display
					// the
					// iterated
					// and
					// sorted
					// EMployee
					// data

				}
			} else if (input == 3) { // if the user input is 3, then application will stop the execute.
				System.out.println("Exit from the Application");
				System.exit(0);
			} else { // if the user input is not present in the given option, then application
						// display the invalid message.
				System.out.println("Enter Valid Input");
			}
		}

	}

}
