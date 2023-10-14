package fall;
/* student id: 4553222
 * Bikash Sintan Lama
 * Topic: Inheritance
 */
class sportvehicle{
	String manufacturer;
}
class SUV extends sportvehicle{
	int passengercount;
}
class sedan extends sportvehicle{
	String model;
}
public class Vehicle {

	public static void main(String[] args) {
		SUV z=new SUV();
		z.manufacturer = "Toyota";
		z.passengercount = 5;
		System.out.println("SUV details ");
		System.out.println("---------------");
		System.out.println("The manufacturer is "+ z.manufacturer);
		System.out.println("Total passenger is " + z.passengercount);

	}

}
