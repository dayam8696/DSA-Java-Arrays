import java.util.Arrays;

public class access_2D_array_element {

        int arr [][] = null;

        // Constructor
        public  access_2D_array_element (int numberofRows , int numberOfColoumns){
            this.arr = new int[numberofRows][numberOfColoumns];
            for (int row = 0 ;row< arr.length ; row++){
                for (int col = 0 ; col<arr[0].length ; col++){
                    arr[row][col]= Integer.MIN_VALUE;
                }
            }
        }
                //  insertion in 2d Array

        public void insertValueInTheArray(int row ,int col , int value){
            try {
                if (arr[row][col] == Integer.MIN_VALUE){
                    arr[row][col] = value;
                    System.out.println("The value in inserted sucessfully ");
                }
                else {
                    System.out.println("This cell is already occupied");
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index for 2D array");
            }

        }
        // accessing element in 2d array
    public void access_array_element(int row ,int col){
        System.out.println("\n Accessing Row# " +row +  " col# " + col);
        try {
            System.out.println("the value is " + arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

        public static void main(String[] args) {
            access_2D_array_element obj = new access_2D_array_element(3,3);
            obj.insertValueInTheArray(1,2,30);
            obj.insertValueInTheArray(2,2,50);
            obj.insertValueInTheArray(1,1,90);
            obj.insertValueInTheArray(0,0,55);
            obj.insertValueInTheArray(0,1,88);
            obj.access_array_element(2,2);
            obj.access_array_element(1,1);
            System.out.println(Arrays.deepToString(obj.arr));

        }
    }


