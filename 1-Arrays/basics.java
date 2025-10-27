public class basics {
    public static void main(String[] args) {
        
        // Declaration of the array with explanation

        // happens at compile time
        int[] roll ; // Declaration of the integer array
        
        // happens at runtime
        roll = new  int[5]; // Initializes roll to hold 5 integers
    
        roll[0] = 5432;
        System.out.println(roll[0]);
    }
}