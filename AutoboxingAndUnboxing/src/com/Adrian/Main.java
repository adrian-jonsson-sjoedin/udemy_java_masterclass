package com.Adrian;

import java.util.ArrayList;

//this is basically a wrapper
class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();// can't do this since int is a prim. data class and
        //not an object

        //can do this instead using the IntClass above
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(45));//in first array element in array list adds an object of
        //type IntClass with value of 45

        //better way of doing it
        Integer integerDeprecated = new Integer(54); //deprecated. write as bellow instead. this goes for all prim. datatypes.
        Integer integer = Integer.valueOf(45);
        Double doubleValue = Double.valueOf(12.25);

        //with boxing
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
        // without boxing
//        for (int i = 0; i <= 10; i++) {
//            intArrayList.add(i);
//        }
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i));
//        }

        Integer myIntValue = 56; //same as, Integer myIntValue = Integer.valueOf(56);
        int myInt = myIntValue; //same as, int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl)); //could have removed Double.valeOf(dbl) and just write add(dbl). Java adds that for you
        }
        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();//could have removed doubleValue(). Java adds that for you
            System.out.println(i + " --> " + value);
        }
    }
}
