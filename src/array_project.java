import java .util.Scanner;
public class array_project {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        System.out.print("How many days temperature :");
        int numDays = sc.nextInt();
        int sum= 0;
        for (int i =1 ;i<=numDays ;i++){
            System.out.print("Day " + i+ "'s high temp: ");
            int next = sc.nextInt();
            sum = sum+next;

        }
        double average = sum/numDays;
        System.out.println();
        System.out.println("The average temperature is :" + average);

            // now let's do it by array method
        }
    }

