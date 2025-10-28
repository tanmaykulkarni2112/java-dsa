import java.util.ArrayList;

class ArrayLists {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> ourList = new ArrayList<>();

        ourList.add(1);
        ourList.add(2);
        ourList.add(3);
        System.out.println(ourList); // printing our ArrayList

        // Note the difference: this will print the address of the array and not the actual array elements
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 23;
        arr[2] = 32131;
        System.out.println(arr);

        // Retrieve a specific value
        int val = ourList.get(2);
        System.out.println(val);

        // Update the value at index 2
        ourList.set(2, 67);
        System.out.println(ourList);

        // Remove the value from the ArrayList
        ourList.remove(0); // removes the element at index 0 and shifts others left
        System.out.println(ourList);

        // Insert a value at a specific index
        ourList.add(0, 3123); // adds the value at index 0 and shifts others right
        System.out.println(ourList);

        // Creating an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("WORLD");
        System.out.println(stringList);

        // We cannot access or update values at non-existing indexes
        try {
            stringList.get(3);
        } catch (Exception e) {
            System.out.println("Going wrong with " + e.getMessage());
        }
    }
}
