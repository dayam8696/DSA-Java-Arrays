//Insertion IN Array
import java .util.Arrays;
public class insertionInArray {
    static int[] arr = null;
    public insertionInArray (int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i =0 ;i<arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert (int location,int valueToBeInserted){
        try {
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Sucessfully inserted");
            }
            else {
                System.out.println("This cell is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");

        }
    }

    public static void main(String[] args) {
        insertionInArray num = new insertionInArray(10);
        num.insert (0 , 40);
        num.insert (1, 60);
        num.insert (2 , 70);
        num.insert (1 , 50);
        num.insert (5 , 42);
        num.insert (10 , 30);
        System.out.println(Arrays.toString(arr));
        for (int i = 0 ; i<=arr.length ; i++){
            System.out.println(arr[i]);
        }


    }
}
