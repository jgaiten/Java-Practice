import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author Joseph Gaiten
 * @version 3/5/2019
 * Class: CSCI 333
 * Professor Whitley
 * Homework 4 Random Sort Select: This program creates five lists of integers
 * and uses them to test two methods- countingSort and randomizedQuickSelect, all
 * of which is zero-indexed(at least it was supposed to be).
 */
public class RamSortSelect {
    /**
     * This is a sorting method that sorts all of the values in an integer array 
     * in ascending order
     * @param inputArray
     * @param memArray
     * @param largeInput 
     */
    public void countingSort(int[] inputArray,int[]memArray,int largeInput){
        int[] newArray = new int[largeInput];
        for (int i = 0; i <= largeInput-1; i++) {
            newArray[i]=0;
        }
        for (int i = 0; i <= inputArray.length-1; i++) {
            newArray[inputArray[i]]++;
        }
        for (int i = 1; i <= largeInput-1; i++) {
            newArray[i] = newArray[i] + newArray[i-1];
        }
        for (int i = inputArray.length-1; i >=0 ; i--) {
            memArray[newArray[inputArray[i]]] = inputArray[i];
            newArray[inputArray[i]]--;
        }
    }
    /**
     * This method finds the expected order runtime by using a random variable as 
     * the pivot, then recursively calls until the solution is found.
     * @param inputArray
     * @param leftBound
     * @param rightBound
     * @param orderStat
     * @return 
     */
    private int randomizedQuickSelect(int[] inputArray,int leftBound, int rightBound, int orderStat){
        if (leftBound==rightBound) {
            return inputArray[leftBound];
        }
        Random rand = new Random();
        int z = rand.nextInt(rightBound-leftBound)+ leftBound;
        swap(inputArray,z,rightBound);
        int q = partition(inputArray,leftBound,rightBound);
        int k = q - leftBound + 1;
        if (orderStat == k) {
            return inputArray[q];
        }
        else if(orderStat < k){
            return randomizedQuickSelect(inputArray,leftBound,q-1, orderStat);
        }
        else{
            return randomizedQuickSelect(inputArray,q+1,rightBound,orderStat-k);
        }
    }
    /**
     * This is the wrapper method for the original randomizedQuickSelect method
     * in the instance that there are any parameters missing. This makes sure that 
     * the original array is not destroyed and the method finishes properly.
     * @param mainArray
     * @param input
     * @return 
     */
    public int randomizedQuickSelect(int[] mainArray, int input){
        int[] copyArray = mainArray.clone();
        return randomizedQuickSelect(copyArray,0,copyArray.length-1,input);
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
     
    public static void main(String[] args) {
        RamSortSelect cs = new RamSortSelect();
        Random randTest = new Random();
        
        int[] first = {2,3,45,66,345,3};
        int[] test1 = new int[first.length];
        int[] second = {99,45,2,4,67,88};
        int[] test2 = new int[second.length];
        int[] third = {3,5,43,454,6776,1,3,4,5};
        int[] test3 = new int[third.length];
        int[] fourth = {5,777,44,343,4,242,245};
        int[] test4 = new int[fourth.length];
        int[] fifth = {2,3,4,5,6,7};
        int[] test5 = new int[fifth.length];
        
        System.out.println("Time to test the countingSort method!");
        System.out.println();
        System.out.println("Here's the first array: " + Arrays.toString(first));
        System.out.println("Testing Counting Sort...");
        cs.countingSort(first,test1, first.length);
        System.out.println("Here's the result!");
        System.out.println(Arrays.toString(first));
        System.out.println();
        System.out.println("Here's the second array: " + Arrays.toString(second));
        System.out.println("Testing Counting Sort...");
        cs.countingSort(second,test2, second.length);
        System.out.println("Here's the result!");
        System.out.println(Arrays.toString(second));
        System.out.println();
        System.out.println("Here's the third array: " + Arrays.toString(third));
        System.out.println("Testing Counting Sort...");
        cs.countingSort(third,test3, third.length);
        System.out.println("Here's the result!");
        System.out.println(Arrays.toString(third));
        System.out.println();
        System.out.println("Here's the fourth array: " + Arrays.toString(fourth));
        System.out.println("Testing Counting Sort...");
        cs.countingSort(fourth,test4, fourth.length);
        System.out.println("Here's the result!");
        System.out.println(Arrays.toString(fourth));
        System.out.println();
        System.out.println("Here's the fifth array: " + Arrays.toString(fifth));
        System.out.println("Testing Counting Sort...");
        cs.countingSort(fifth,test5, fifth.length);
        System.out.println("Here's the result!");
        System.out.println(Arrays.toString(fifth));
        System.out.println(); 
        System.out.println();
        System.out.println("Time to test randomized quickselect!");
        System.out.println();
        System.out.println("Here's the first array: " + Arrays.toString(first));
        System.out.println("Test random quickselect...");
        cs.randomizedQuickSelect(first, 0, first.length, randTest.nextInt(first.length));
        System.out.println("Here's the results!");
        System.out.println(Arrays.toString(first));
        System.out.println();
        System.out.println("Here's the second array: " + Arrays.toString(second));
        System.out.println("Test random quickselect...");
        cs.randomizedQuickSelect(second, 0, second.length, randTest.nextInt(second.length));
        System.out.println("Here's the results!");
        System.out.println(Arrays.toString(second));
        System.out.println();
        System.out.println("Here's the third array: " + Arrays.toString(third));
        System.out.println("Test random quickselect...");
        cs.randomizedQuickSelect(third, 0, third.length, randTest.nextInt(third.length));
        System.out.println("Here's the results!");
        System.out.println(Arrays.toString(third));
        System.out.println();
        System.out.println("Here's the fourth array: " + Arrays.toString(fourth));
        System.out.println("Test random quickselect...");
        cs.randomizedQuickSelect(fourth, 0, fourth.length, randTest.nextInt(fourth.length));
        System.out.println("Here's the results!");
        System.out.println(Arrays.toString(fourth));
        System.out.println();
        System.out.println("Here's the fifth array: " + Arrays.toString(fifth));
        System.out.println("Test random quickselect...");
        cs.randomizedQuickSelect(fifth, 0, fifth.length, randTest.nextInt(fifth.length));
        System.out.println("Here's the results!");
        System.out.println(Arrays.toString(fifth));
        System.out.println();
        
        
        
        
    }
}
