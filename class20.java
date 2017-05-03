import java.util.Scanner;

/**
 * Created by Rushu on 5/3/2015.
 * taking input from user and store it into the array
 * printing the element from the array
 */
public class class20 {
    public static void main(String args[]){
        int i=0;
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        //storing input in the array
        for( i=0; i<5; i++){
            System.out.println("Enter the value which will be stored in array ");
            array[i] =sc.nextInt();
        }

        //printing the element/index from array
        for (i=0; i<5;i++){
            System.out.println(array[i]);
        }



    }
}
