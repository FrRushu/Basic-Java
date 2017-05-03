/**
 * Created by Rushu on 5/3/2015.
 * Adding Elements of an Array
 */
public class class17 {
    public static void main(String args []){
        int arrayName[] = {1,2,3,4,5};
        int sum=0;

        for (int counter=0; counter < arrayName.length; counter++){
            sum=sum+arrayName[counter];
        }
        System.out.println(sum);
    }
}
