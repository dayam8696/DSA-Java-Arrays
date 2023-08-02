//finding the array element
public class findi_array_element {

    public static void main(String[] args) {
        int arr[] = {20, 50, 60, 70, 30,};
        int num = 60;
        for (int i = 0; i <= arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Value is found at index " + i);


            }
        }
    }
}



