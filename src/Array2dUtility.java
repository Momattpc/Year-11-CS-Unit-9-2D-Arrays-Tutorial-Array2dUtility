
public class Array2dUtility {

    // Declare all methods as static.
public static String print(int [][]arrayone){
    String hold = " ";
for (int[] row: arrayone){
    for (int col: row ){
        hold+= col + " ";

    }
    hold+= "\n";

}
   return hold;
}
    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
public static int sum(int [] [] arraytwo){
    int sum = 0;
    for (int[] row: arraytwo){
        for (int col: row){
            sum+= col;
        }
    }
    return sum;
}
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
public static double average(int [] [] arraythree){

    int lengthRowColumn = arraythree.length * arraythree[0].length;
    double averages = sum(arraythree) / (double) lengthRowColumn ;
    return averages;
}
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
public static int minimum(int [] [] arrayfour){
    int hold = arrayfour[0][0];
    for (int[] row: arrayfour){
        for (int col: row){

            if (col < hold){
                hold = col;
            }
        }
    }
    return hold;
}
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int maximum(int [] [] arrayfive){
        int hold = arrayfive[0][0];
        for (int[] row: arrayfive){
            for (int col: row){

                if (col > hold){
                    hold = col;
                }
            }
        }
        return hold;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int evenCountStandard(int [] [] arraysix){
        int hold = 0;
        for (int i =0; i<arraysix.length; i++){
            for (int j = 0; j<arraysix[0].length; j++){

                if (arraysix[i][j] % 2 == 0){
                    hold++;
                }
            }
        }
        return hold;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountEnhanced(int [] [] arraysix){
        int hold = 0;
        for (int[] row: arraysix){
            for (int col: row){

                if (col % 2 == 0){
                    hold++;
                }
            }
        }
        return hold;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static boolean allPositive(int [] [] arraysix){
        for (int[] row: arraysix){
            for (int col: row){

                if (col < 0){
                    return false;
                }
            }
        }
        return true;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static int[] rowSums(int[][]arrayseven){
    int[] myArray = new int[arrayseven.length];
        int hold = 0;
    for (int i = 0; i < arrayseven.length; i++){
            for (int j = 0; j<arrayseven[i].length; j++){

                hold+=arrayseven[i][j];

            }
        myArray[i] = hold;
            hold = 0;
    }
        return myArray;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] colSums(int [] [] arraysix){
        int[] myArray = new int[arraysix[0].length];
        int hold = 0;
        for (int i = 0; i < arraysix[0].length; i++){
            for (int j = 0; j<arraysix[0].length; j++){

                hold+=arraysix[j][i];

            }
            myArray[i] = hold;
            hold = 0;

        }
        return myArray;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.

}
