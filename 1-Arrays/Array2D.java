class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // number of rows and columns are to be speciified
        System.out.println(arr.length); // here number of rows are 2
        System.out.println(arr[0].length); // here number of columns are 2

        int[][] uglyMatrix = {
            {1,2,3},
            {4,5,6}
        };

        for (int i = 0; i < uglyMatrix.length; i++) {
            for (int j = 0; j < uglyMatrix[i].length ; j++) {
                System.out.println(uglyMatrix[i][j]);
            }
        }

        for (int row = 0; row < uglyMatrix.length; row++) {
        // awesome way of printing the same using Arrays.toString()
        System.out.println(java.util.Arrays.toString(uglyMatrix[row]));
        }


        // This is especially useful when the array is non symetric 

        int[][] uglierMatrix = {
            {1,2,3},
            {4,5,6,7,8},
            {9,10},
            {11}
        };

        for (int i = 0; i < uglierMatrix.length; i++) {
            for(int[] col : uglierMatrix) {
                System.out.println(col); // this will print the address of each array
                System.out.println(java.util.Arrays.toString(col)); // this will traverse and print each array
            }
        }

    }
}