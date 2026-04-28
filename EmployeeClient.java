package interfaceDemo;

import java.util.Arrays;
import java.util.List;
 
public class EmployeeClient {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = Arrays.asList(new Employee("manasa", 35000), new Employee("john", 25000),
				new Employee("manasa", 15000)
 
		);
		empList.stream().filter(emp -> emp.salary > 30000).map(emp -> emp.name).forEach(System.out::println);
 
	}
 
}