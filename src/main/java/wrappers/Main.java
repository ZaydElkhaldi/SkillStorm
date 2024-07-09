package wrappers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int myNumber = 5;
        // Warpping primitive myNumber into an object
        Integer myWrapperNumber = myNumber;

        // UnWrapping the integer object to get access to the primitive value
        int myUnwrappedNumber = myWrapperNumber.intValue();

        System.out.println(myWrapperNumber);

        List<Integer> list = new ArrayList<Integer>();

        // This works by just using int due to **autoboxing** which is done by the compiler
        for (int i = 1; i < 50; i+=2) {
            list.add(i);
        }

    }
}