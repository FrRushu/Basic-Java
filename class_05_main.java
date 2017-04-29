import java.util.Scanner;

/**
 * Created by Rushu on 4/29/2015.
 */
public class class_05_main {
    public static void main(String args[]){
        class05 useit = new class05();
        useit.displaymessage();
        System.out.println("*******output from private method********");
        print();
        //method with parameters
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String name =sc.next();
        System.out.println("*******calling show name method from class 05********");
        useit.showName(name);

    }

    private static void print(){
        System.out.println("hello from private method");
    }
}
