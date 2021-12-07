package com.Adrian;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];//reference type holds a reference or an adress to
                                     //object but not the object themselves
        int[] anotherArray = myIntArray;//this points to the same object as myIntArray

        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray ="+Arrays.toString(anotherArray));

        anotherArray[0] = 1;//this will change the value of the integer on index 0
                            //for the object anotherArray points to. Meaning this also
                            //changes myIntArray
        System.out.println("after change myIntArray = "+Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = "+Arrays.toString(anotherArray));
    }

}
