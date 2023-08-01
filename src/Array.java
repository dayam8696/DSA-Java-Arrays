import java .util.Arrays;
// Creating And Displaying Array
public class Array {

    public static void main(String[] args) {
        int [] arr ;
        arr = new int[3];
        arr[0]= 10;
        arr[1]= 20;
        arr[2]= 30;
        System.out.println(Arrays.toString(arr));
        for (int i = 0 ; i<=arr.length ; i++){
            System.out.println(arr[i]);
        }
      
    }
}
