package s19_interfaces_23;

import static java.lang.System.*;

public class Interface
{
	public static void main ( String[] args )
	{

		System.out.println("Interface example\n");

		//Locatable x = new Locatable();  //not possible to instantiate an interface

		Locatable y = new Ship();  //change the constructor up

		out.println("Here is a ship " + y);
	}
}