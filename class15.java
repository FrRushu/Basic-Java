/**
 * Created by Rushu on 5/3/2015.
 */
import  java.util.Scanner;
import java.util.Random;
public class class15 {

    public static void main(String args []){
        //creating an object of the random class
        Random dice = new Random();
        int number;

        for (int i=1; i<=10;i++){
            number=1+dice.nextInt(6);
            System.out.println(number);
        }

    }
}
