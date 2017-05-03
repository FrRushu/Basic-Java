/**
 * Created by Rushu on 5/3/2015.
 * Multi Dimensional Arrays
 */
public class class22 {
    public static void main(String args []){
        // 2 dimensional array
        //int arrayName [] [] = new  int[3][3];
        int arrayName [] [] ={{1,2,3},{4,5,6},{7,8,9}};
        //System.out.println(arrayName[2][2]);

        //printing the 2D array
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                System.out.print(arrayName[i][j]);
            }
            System.out.println();
        }


    }
}
