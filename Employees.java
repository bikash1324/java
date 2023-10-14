package fall;
/* student id: 4553222
 * Bikash Sintan Lama
 * Topic: Inheritance
 */
class salaryinfo {
	int salary=5000;
}
public class Employees extends salaryinfo {
	public static void main(String[] Args) {
		Employees z=new Employees();
		System.out.println("the salary of an employee is "+z.salary);
	}
}
