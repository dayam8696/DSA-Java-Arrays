import java.util.Arrays;
import java.util.Scanner;
public class searching_element_2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you want to find");
        int value = sc.nextInt();
        int [][] dym = {{10 ,20,60} ,{80 ,90 ,100},{70 ,40 ,45}};
        try {
            for (int row = 0 ; row<dym.length ;row++){
                for (int col = 0 ; col<dym[0].length ; col++){
                    if(dym[row][col]== value){
                        System.out.println("Value is found row : " +row +"col : "+ col);

                    }

                }
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Element not found");
        }



    }
}
