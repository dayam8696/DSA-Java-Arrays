import java.util.Arrays;
public class Creating_2D_Array {
    public static void main(String[] args) {
        // step 1 - Declare
        int[][]  int2DArray;

        // step 2 - Instantiate
        int2DArray = new int[2][2];

        // step 3 initialize

        int2DArray[0][0] = 1;
        int2DArray[0][1] = 2;
        int2DArray[1][0] = 3;
        int2DArray[1][1] = 4;

        System.out.println(Arrays.deepToString(int2DArray));

        // All together in one step

       int [][] twodArray = {{5 , 6} , {7,8}};
        System.out.println(Arrays.deepToString(twodArray));

    }
}
