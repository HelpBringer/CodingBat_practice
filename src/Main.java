
import stringTasks.*;
import arrayTasks.*;
import logicTasks.*;


public class Main {

    public static void main(String[] args){
        System.out.println(String1.helloName("World"));
        System.out.println(String1.left2("Hi"));
        System.out.println();


        Array2 arr2 = new Array2();
        System.out.println(arr2.has22(new int[]{1, 2, 2}));

        Logic2 logic2 = new Logic2();
        System.out.println(logic2.makeChocolate(4, 1, 9));
    }

}
