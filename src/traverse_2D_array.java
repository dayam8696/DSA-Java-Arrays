import java.util.Arrays;

public class traverse_2D_array {

        public static void main(String[] args) {
//            // step 1 - Declare
//            int[][]  int2DArray;
//
//            // step 2 - Instantiate
//            int2DArray = new int[2][2];
//
//            // step 3 initialize
//
//            int2DArray[0][0] = 1;
//            int2DArray[0][1] = 2;
//            int2DArray[1][0] = 3;
//            int2DArray[1][1] = 4;
//
//            System.out.println(Arrays.deepToString(int2DArray));

            // All together in one step

            int [][] twodArray = {{5 , 6} , {7,8}};
            for (int row = 0 ; row<twodArray.length ;row++){
                for (int col = 0 ; col<twodArray[0].length ; col++){
                    System.out.print(twodArray[row][col]+ " ");}
                System.out.println();
            }
           // System.out.println(Arrays.deepToString(twodArray));

        }
    }