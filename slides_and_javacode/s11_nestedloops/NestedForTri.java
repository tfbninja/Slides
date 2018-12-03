package s11_nestedloops;

// A+ Computer Science
// www.apluscompsci.com
//nested for loop example
public class NestedForTri {

    public static void main(String args[]) {

        /*
   	 	*
			**
			***
			****
			*****
			******
			*******
			********
			*********
         */
        int stop = 9;
        /*//add in a for loop to print the rows   //rows
		   //add in a for loop to print out the * on each row  //columns
		      System.out.print("*");
		   //print out a new line*/
        for (int i = 1; i <= stop; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
