import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Joseph Gaiten
 * @version 2/21/2019
 * Class: CSCI 333
 * Professor Whitley
 * Homework 3: Quicksort - This program creates 10 lists of integers to test
 * the quick sort and randomized quick sort operations, all zero indexed.
 * The results of each are shown during runtime.
 */
public class Quicksort {
    /**
     * This method uses quicksort in order to sort the elements of a given int array
     * from beginning to end inclusively, while 0 indexed
     * @param sortArray
     * @param start
     * @param end 
     */
    public void quickSort(int[]sortArray, int start, int end){
        if (start < end) {
            int q = partition(sortArray,start,end);
            quickSort(sortArray,start, q-1);
            quickSort(sortArray, q +1, end);
        }
        
    }
    /**
     * This helper method for the quicksort and randomize quicksort methods
     * partitions the elements in a given int array by using a pivot variable 
     * determined by the starting integer
     * @param sortArray
     * @param start
     * @param end
     * @return 
     */
    private int partition(int[]sortArray, int start, int end){
        int x = sortArray[end];
        int i = start - 1;
        for (int j = start; j <= (end-1); j++) {
            if (sortArray[j] <= x) {
                i = i + 1;
                swap(sortArray,i,j);
            }
        }
        swap(sortArray, i + 1, end);
        return i + 1;
    }
    /**
     * This helper method swaps the positions of two elements in an integer array 
     * @param swapArray the array whose elements are being swapped
     * @param index1 position of element 1
     * @param index2 position of element 2
     */
    private void swap (int[]swapArray,int index1, int index2){
        int temp = swapArray[index1];
        swapArray[index1] = swapArray[index2];
        swapArray[index2] = temp;
    }
    
    /**
     * This method uses random quicksort in order to sort the elements of a 
     * given int array from beginning to end inclusively, while 0 indexed
     * @param sortArray
     * @param start
     * @param end 
     */
    public void randomQuickSort(int[]sortArray, int start, int end){
        if (start < end) {
            Random rng = new Random();
            int z = rng.nextInt(end - start + 1)+ start;
            swap(sortArray,z,end);
            int q = partition(sortArray,start,end);
            quickSort(sortArray,start, q-1);
            quickSort(sortArray, q +1, end);
        }
    }
    
    public static void main(String[] args) {
        Quicksort qs = new Quicksort();
        //The first five arrays wil be testing the quickSort method
        int[] test1 = {2,3,45,6,4,3,3,45};
        int[] test2 = {1,3,43,35,56,4,67,757};
        int[] test3 = {7,7,87,8,5,5,54};
        int[] test4 = {10,35,35,4,632,4,3245,1,4};
        int[] test5 = {5,5,5,43,43,0,2,2,56,7};
        //The next five arrays will be testing the random quicksort method
        int[] test6 = {2,3,23,3,4,5,6,6,7};
        int[] test7 = {4,7,7,7,7,7,86,1,54,1000};
        int[] test8 = {5,6,7,8,8,9,9,0,0,1,2};
        int[] test9 = {7,6,4,3,5,4,6,768,10};
        int[] test10 = {12,12,2,343,0,64646,6677};
        
        System.out.println("The first five arrays are going to test quicksort!");
        System.out.println("This is the first array!");
        System.out.println(Arrays.toString(test1));
        System.out.println("We're going to use quicksort on this array!");
        System.out.println("Here are the results!");
        qs.quickSort(test1,0,test1.length-1);
        System.out.println(Arrays.toString(test1));
        System.out.println();
        System.out.println("This is the second array!");
        System.out.println(Arrays.toString(test2));
        System.out.println("We're going to use quicksort on this array!");
        System.out.println("Here are the results!");
        qs.quickSort(test2,0,test2.length-1);
        System.out.println(Arrays.toString(test2));
        System.out.println();
        System.out.println("This is the third array!");
        System.out.println(Arrays.toString(test3));
        System.out.println("We're going to use quicksort on this array!");
        System.out.println("Here are the results!");
        qs.quickSort(test3,0,test3.length-1);
        System.out.println(Arrays.toString(test3));
        System.out.println();
        System.out.println("This is the fourth array!");
        System.out.println(Arrays.toString(test4));
        System.out.println("We're going to use quicksort on this array!");
        System.out.println("Here are the results!");
        qs.quickSort(test4,0,test4.length-1);
        System.out.println(Arrays.toString(test4));
        System.out.println();
        System.out.println("This is the fifth array!");
        System.out.println(Arrays.toString(test5));
        System.out.println("We're going to use quicksort on this array!");
        System.out.println("Here are the results!");
        qs.quickSort(test5,0,test5.length-1);
        System.out.println(Arrays.toString(test5));
        System.out.println();
        System.out.println("The next five tests are going to test random quicksort!");
        System.out.println("This is the sixth array!");
        System.out.println(Arrays.toString(test6));
        System.out.println("We're going to use random quicksort on this array!");
        System.out.println("Here are the results!");
        qs.randomQuickSort(test6,0,test6.length-1);
        System.out.println(Arrays.toString(test6));
        System.out.println();
        System.out.println("This is the seventh array!");
        System.out.println(Arrays.toString(test7));
        System.out.println("We're going to use random quicksort on this array!");
        System.out.println("Here are the results!");
        qs.randomQuickSort(test7,0,test7.length-1);
        System.out.println(Arrays.toString(test7));
        System.out.println();
        System.out.println("This is the eighth array!");
        System.out.println(Arrays.toString(test8));
        System.out.println("We're going to use random quicksort on this array!");
        System.out.println("Here are the results!");
        qs.randomQuickSort(test8,0,test8.length-1);
        System.out.println(Arrays.toString(test8));
        System.out.println();
        System.out.println("This is the ninth array!");
        System.out.println(Arrays.toString(test9));
        System.out.println("We're going to use random quicksort on this array!");
        System.out.println("Here are the results!");
        qs.randomQuickSort(test9,0,test9.length-1);
        System.out.println(Arrays.toString(test9));
        System.out.println();
        System.out.println("This is the tenth array!");
        System.out.println(Arrays.toString(test10));
        System.out.println("We're going to use random quicksort on this array!");
        System.out.println("Here are the results!");
        qs.randomQuickSort(test10,0,test10.length-1);
        System.out.println(Arrays.toString(test10));
        System.out.println();
        System.out.println("All done!");
        
    }
}
