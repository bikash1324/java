package fall;
/* student id: 4553222
 * Bikash Sintan Lama
 * Topic: Inheritance
 */

public class Construct {
	int marks;
	String course;
Construct()
	{
		System.out.println("example of constructor");
	}
Construct(int a, String b)
	{
		System.out.println("age is "+ a);
		System.out.println("name is "+ b);
	}
Construct(String a, int marks)
	{
		course=a;
		System.out.println("course name is "+ course);
		System.out.println("score is "+ marks);
	}
	public static void main(String[] Args) {
		Construct r=new Construct();
		Construct z=new Construct(20, "Joe");
		Construct t=new Construct("java", 40);
	}
}
