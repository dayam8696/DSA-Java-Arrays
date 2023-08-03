//deleting element from the array


public class deleting_element_in_array {
static  int arr []={ 10 , 20 ,40 , 60 , 90 };
     void delete_value(int value_to_be_deleted) {
         try {
             arr[value_to_be_deleted] =Integer.MIN_VALUE;
             System.out.println("Now The value is deleted sucessfully");
         }catch (ArrayIndexOutOfBoundsException e){
             System.out.println("The value that is provied is not in the range of array");
         }

    }
    public static void main(String[] args) {
        deleting_element_in_array obj = new deleting_element_in_array();
        // before deletion
        System.out.println("Before deletion the value at paticular index is " + arr[2]);

        obj.delete_value(2);

        //to check value is deleted or not
        System.out.println("The value after deleting that index is " + arr[2]);



    }


}
