class linearSearch{

    public static void main(String[] args) {
        
        // Linear Search in Array
        int[] intArr = {1,2,3,4,5,12,441,22,121};
        System.out.println(linearSearchInArray(441, intArr)); // 441 is presnt at the index 6  (0 based indexing)
        System.out.println(linearSearchInArray(0, intArr)); // 0 is not presnt, method will return -1
        
        // -----

        // Linear Search in String
        String ourStr = new String("ABCSfdafwx");
        System.out.println(linearSearchInString('x', ourStr)); // this should return 9

        // -----

        // Finding minimal value in Array
        int[] nums = {412,12,123414,241,1231,1231,12341};
        System.out.println(minimal(nums));

        // Searching in 2d array
        int[][] mat = {{1,2,3}, {4,5}, {6,7,8,9,10}, {11}};
        search2D(11, mat); // this will return 1 based indexing 

        // Count of Even and Odd numbers in array
        EvenOdd(nums);
    }

    static int linearSearchInArray(int value, int[] arr) {
        int size = arr.length;
        for(int i = 0; i < size; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchInString(char character, String example) {
        int size = example.length();
        char[] charArr = example.toCharArray(); // we need to process String to Char array here
        for(int i = 0; i < size; i++) {
            if (character == charArr[i]) {
                return i;
            }
        }
        return -1;
    }


    static int minimal(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } 
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    static void search2D(int val, int[][] matrix) {
        for (int i = 0 ; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == val) {
                    System.out.println("The row is " + (i + 1) + " and the col is " + ( j + 1));
                    return; 
                }
            }
        }
        System.out.println("The value is not present");
    }


    static void EvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("THE EVEN COUNT IS "+ even +" AND ODD COUNT IS "+ odd);
    }
}

