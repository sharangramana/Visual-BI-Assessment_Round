import java.util.*;

// QUESTION 3

class Main {

    // driver function to get the count
    public static int numOnes(int[][] grid, int m, int n) {

        if(grid.length == 0)
            return 0;
        int count =0;

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == 1){
                    count++;
                    remove(grid, i, j);
                }
            }
        return count;
    }

    // function that does recursion to find the number of connected ones
    public static void remove(int[][] grid, int i, int j)
    {
        if(i >= grid.length || i<0 || j<0 || j>= grid[0].length || grid[i][j] == 0)
            return;


        grid[i][j] = 0;

        remove(grid, i+1,j);
        remove(grid, i-1,j);
        remove(grid, i, j-1);
        remove(grid, i, j+1);
    }

    //main function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        System.out.println("start entering the array elements");
        int[][] grid = new int[m][n];
        for(int i=0;i<m; i++) {
            for(int j=0; j<n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        System.out.println("the output is "+numOnes(grid, m, n));
    }
}