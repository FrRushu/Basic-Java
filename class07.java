/***
 * Created by Rushu on 4/29/2015.
 */
public class class07{
    public static void main(String args[]){
        //if statement
        int phy,che;
        phy=70;
        che=90;
        if(phy>80 && che>40){
            System.out.println("you passed the test");
        }
        else if(phy>80 || che>80){
            System.out.println("you got an A+");
        }
        else {
            System.out.println("you failed the test");

        }
    }
}
