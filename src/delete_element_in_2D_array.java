import java.util.Arrays;
public class delete_element_in_2D_array {
    int [][] arr = {{10 ,20,60} ,{80 ,90 ,100},{70 ,40 ,45}};
    public void delete_element(int row , int col){
        try {
            System.out.println("Sucessfully deleted :" +arr[row][col]);
            arr[row][col]=Integer.MIN_VALUE;

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index number");
        }
    }

    public static void main(String[] args) {
        delete_element_in_2D_array dym = new delete_element_in_2D_array();

        dym.delete_element(2,2);
        System.out.println(Arrays.deepToString(dym.arr));
    }
}
