package tutorialFunc;


public class array {
    public static void main(String [] args){

        // array
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // indexing
        nums[0] = 77;

        // printing
        for(int i=0; i<nums.length; i++) {
           // System.out.println(nums[i]);
        }

        // array -> allocate elements and store values later  on
        int[] smalls = new int[3];

        smalls[0] = 77;
        smalls[1] = 1;
        smalls[2] = 2;

        for(int i=0; i<smalls.length; i++) {
           // System.out.println(smalls[i]);
        }


        // 2 dimentional array
        int[][] numGrid = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};

        for(int i=0; i<numGrid.length; i++) {
            for(int j=0; j<numGrid[i].length; j++) {
               // System.out.print(numGrid[i][j]);
            }
       // System.out.print("\n");
        }

        // 2 dimensional array -> allocate elements and store values later on
        int[][] grid = new int[3][3];

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;
        grid[2][0] = 7;
        grid[2][1] = 8;
        grid[2][2] = 9;

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[i].length; j++) {
                 // System.out.print(grid[i][j]);
            }
        // System.out.print("\n");
        }


        // for each loop -> iterates through elements in an array
        int[] numLoop = {1, 2, 3, 4, 5, 6, 7};

        // read: for every index in numLoop
        for(int i : numLoop) {
            System.out.println(i);
        }
    }
}