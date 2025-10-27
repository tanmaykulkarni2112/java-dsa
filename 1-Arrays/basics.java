import java.util.Scanner;
import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        
        // {section 1}

        // Declaration of the array with explanation

        // happens at compile time
        int[] roll ; // Declaration of the integer array
        
        // happens at runtime
        // THIS IS STORED IN THE HEAP MEMORY > dynamic memory allocation
        roll = new  int[5]; // Initializes roll to hold 5 integers
    
        // refernce variable int[] roll will point to the array created inside the heap memory

        // INDEXING
        int[] ids = {1,231,431,533,1231};
        // indexing of arrays starts form 0
        int size = 5; // size of the array
        for (int i = 0; i < size; i++) {
            System.out.println("The index is " + i + "and the value there is " + ids[i]);
        }


        // Default values in arrays
        int[] intExample = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(intExample[i]);
        }

        String[] strExample = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println(strExample[i]);
        }

        // FOR EACH LOOP
        for (int id: ids) { // ids is declared above
            System.out.println("WE USED FOREACH LOOP TO PRINT " + id);
        }          

        // {section 2} -- USING METHODS

        System.out.println("Using the .length methods to update the strExample array");
        for (int i = 0; i < strExample.length; i++) {
            Scanner sc = new Scanner(System.in);
            // strExample[i] = sc.nextLine();
            // System.out.println("At index " + i + " the new value is " + strExample[i]);
        }

        // Using the Arrays.toString() method to print the array
        System.out.println("Using the Arrays.toString() method to 'print' the array")
        System.out.println(Arrays.toString(strExample));

    }
}