/**
 * Created by Rushu on 5/3/2015.
 * "Enhanced For Loop" For Arrays
 */
public class class21 {
    public static void main(String args[]){
        //*array name can be anything 
        int array[] = {1,2,3,4,5};
        int sum = 0;

        //here "i" is an identifier which is going to identify the element inside of the array
        for(int i:array){
            sum+=i;

        }
        //replacement of the traditional for loop
        System.out.println(sum);



    }
}

