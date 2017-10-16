package assignment9_4;

/**
 * @author MANJUNATH
 *
 *         Below Employee class has the properties such as Employee name,
 *         Designation and salary. with Parameterized constructor, getter and
 *         setters for the properties.
 *
 */
public class Employee {

	private String employeeName;
	private String employeeDesignation;
	private long employeeSalary;

	// parameterized constructor for Employee properties.
	public Employee(String employeeName, String employeeDesignation, long employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}

	// Getter and setters for the Employee class properties.
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public long getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(long employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
