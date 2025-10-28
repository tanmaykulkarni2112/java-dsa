import java.util.Scanner;
import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        // {section 1}
        // =======================
        // Declaration of the array with explanation

        // Happens at compile time
        int[] roll; // Declaration of an integer array (reference variable only)

        // Happens at runtime
        // THIS IS STORED IN THE HEAP MEMORY → dynamic memory allocation
        roll = new int[5]; // Initializes roll to hold 5 integers

        // The reference variable 'roll' now points to the array created in heap memory

        // INDEXING
        int[] ids = {1, 231, 431, 533, 1231};
        // Indexing of arrays starts from 0
        int size = ids.length; // Always better to use .length instead of hardcoding
        for (int i = 0; i < size; i++) {
            System.out.println("The index is " + i + " and the value there is " + ids[i]);
        }

        // Modify the data inside array
        ids[2] = 432;
        System.out.println("Updated value at index 2: " + ids[2]);

        // Default values in arrays
        int[] intExample = new int[3];
        System.out.println("Default values in int array:");
        for (int i = 0; i < intExample.length; i++) {
            System.out.println(intExample[i]);
        }

        String[] strExample = new String[3];
        System.out.println("Default values in String array:");
        for (int i = 0; i < strExample.length; i++) {
            System.out.println(strExample[i]);
        }

        // FOR-EACH LOOP
        System.out.println("Traversing ids using for-each loop:");
        for (int id : ids) { // ids is declared above
            System.out.println("We used for-each loop to print " + id);
        }

        // {section 2} -- USING METHODS
        // =======================

        System.out.println("Using the .length property to traverse the strExample array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < strExample.length; i++) {
            // Uncomment below lines to accept input dynamically
            // System.out.print("Enter a string for index " + i + ": ");
            // strExample[i] = sc.nextLine();
        }
        sc.close(); // Always close scanner to avoid resource leak

        // Using the Arrays.toString() method to print the array
        System.out.println("Using Arrays.toString() method to print the array:");
        System.out.println(Arrays.toString(strExample));
    }
}
