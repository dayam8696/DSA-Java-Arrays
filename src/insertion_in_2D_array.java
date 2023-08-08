import java.util.Arrays;
public class insertion_in_2D_array {
    int arr [][] = null;

    // Constructor
    public  insertion_in_2D_array (int numberofRows , int numberOfColoumns){
        this.arr = new int[numberofRows][numberOfColoumns];
        for (int row = 0 ;row< arr.length ; row++){
            for (int col = 0 ; col<arr[0].length ; col++){
                arr[row][col]= Integer.MIN_VALUE;
            }
        }
    }

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
    // code will execute sucessfully

    public static void main(String[] args) {
        insertion_in_2D_array obj = new insertion_in_2D_array(3,3);
        obj.insertValueInTheArray(1,2,30);
        obj.insertValueInTheArray(2,2,50);
        System.out.println(Arrays.deepToString(obj.arr));

    }
}
