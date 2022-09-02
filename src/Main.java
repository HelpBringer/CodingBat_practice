import warmUpTasks.*;
import stringTasks.*;
import arrayTasks.*;
import logicTasks.*;
import recursionTasks.*;
import apTasks.*;
import mapTasks.*;
import functionalTasks.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        System.out.println(String1.helloName("World"));
        System.out.println(String1.left2("Hi"));
        System.out.println();

        WarmUp2 warmUp2= new WarmUp2();
        System.out.println(warmUp2.has271(new int[]{1, 2, 7, 1}));

        Array2 arr2 = new Array2();
        System.out.println(arr2.has22(new int[]{1, 2, 2}));

        Logic2 logic2 = new Logic2();
        System.out.println(logic2.makeChocolate(4, 1, 9));

        Recursion2 recursion2= new Recursion2();
        System.out.println(recursion2.split53(new int[]{3, 5, 6, 10, 3, 3}));

        AP1 ap1 = new AP1();
        System.out.println(ap1.commonTwo(new String[]{"a", "c", "x"}, new String[] {"a", "b", "c", "x", "z"}));

        Map2 map2 = new Map2();
        System.out.println(map2.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));

        Functional2 functional2 = new Functional2();
        System.out.println(functional2.square56(new ArrayList<>(List.of(3, 1, 4))));
    }

}
