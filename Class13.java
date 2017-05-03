import java.util.Scanner;

/**
 * Created by Rushu on 5/3/2015.
 * calculate basic interest calculator
 */
public class Class13 {

    public static void main(String args[]){

        double principalAmount;
        double noOfYears;
        double rateOfInterest;
        double simpleInterest;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount");
        principalAmount = sc.nextDouble();

        System.out.println("Enter number of years");
        noOfYears = sc.nextDouble();

        System.out.println("Enter rate of interest");
        rateOfInterest = sc.nextDouble();

        simpleInterest=(principalAmount*rateOfInterest*noOfYears)/100;

        System.out.println("The interest is "+ simpleInterest);







    }
}
