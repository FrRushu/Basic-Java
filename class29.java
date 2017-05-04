/**
 * Created by Rushu on 5/4/2015.
 * Encapsulation example
 */
class employee{
    private String name ;

    public void setName(String newName){
        name=newName;
    }

    public String getName(){
        return name;
    }
}

public class class29 {

    public static void main(String args[]){
        employee nameSetting  = new employee();
//        this things work for public stuffs
//        rony.name = "Mohammed Ulla Rony ";
//        System.out.println(rony.name);
        //*** for private stuff we need encapsulation , hence in private method we don't have the direct access
        //which is why we have to use getter and setter method
        nameSetting.setName("Fazle Rabbi Rushu");
        System.out.println(nameSetting.getName());


    }
}
