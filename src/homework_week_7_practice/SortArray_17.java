package homework_week_7_practice;

import java.util.Arrays;

// Write a java program to sort a numeric array and a String array.
public class SortArray_17 {
    public static void main(String[] args) {
        //Numeric Array declaration
        int [] numArray = { 1789,2035,1899,2040,1950,2255,7897,1455,787};
        //string Array declaration
        String [] strArray = { "Alpha","Bravo","Delta","Hotel","MIke","Sierra","Peter","Kilo"};
        System.out.println("Actual Numerical Arrray Was :" + Arrays.toString(numArray));
        //Sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is : "+Arrays.toString(numArray));
        System.out.println("");
        System.out.println("Actual String Array was :" + Arrays.toString(strArray));
        //Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is :"+Arrays.toString(strArray));
    }

}
