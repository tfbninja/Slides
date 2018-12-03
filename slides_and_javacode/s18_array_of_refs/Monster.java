package s18_array_of_refs;

// A+ Computer Science
// www.apluscompsci.com

public class Monster
{
	private int myAge, mySize;

	public Monster() 
	{ 
		myAge = mySize = 0; 
	}

	public Monster(int age)
	{
	   myAge = age;
	   mySize = 0;
	}

	public Monster(int age, int size)
	{
	   myAge = age;
	   mySize = size;
	}

	public void setAge( int age)
	{ 
		myAge = age; 	
	}

	public int getAge()
	{ 
		return myAge; 
	}

	public String toString()
	{
		return myAge + " " + mySize;
	}
}