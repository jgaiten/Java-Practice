import java.util.Arrays;
/**
 *
 * @author Joseph Gaiten
 * @date 2/12/2019
 * Description: This file contains the main method of the Max Heap assignment. It 
 * creates 5 MaxHeap objects and then tests the results of the printMaxHeap and 
 * heapSort methods in the MaxHeap file.
 */
public class MaxHeapMain {
    //How do I create a MaxHeap object properly? This doesn't work.
    public static void main(String[] args) {
        int[] first = {2,3,45,66};
        int[] second = {99,45,2,4,67,88};
        int[] third = {3,5,43,454,6776,1,3,4,5};
        int[] fourth = {5,777,44,343,4,242,245};
        int[] fifth = {2,3,4,5,6,7};
        
        MaxHeap firstTest = new MaxHeap(first);
        firstTest.printMaxHeap();
        firstTest.heapSort();
        System.out.println("Here's the same MaxHeap after heapSort was declared!");
        firstTest.printMaxHeap();
        
        MaxHeap secondTest = new MaxHeap(second);
        firstTest.printMaxHeap();
        firstTest.heapSort();
        System.out.println("Here's the same MaxHeap after heapSort was declared!");
        firstTest.printMaxHeap();
        
        MaxHeap thirdTest = new MaxHeap(third);
        firstTest.printMaxHeap();
        firstTest.heapSort();
        System.out.println("Here's the same MaxHeap after heapSort was declared!");
        firstTest.printMaxHeap();
        
        MaxHeap fourthTest = new MaxHeap(fourth);
        firstTest.printMaxHeap();
        firstTest.heapSort();
        System.out.println("Here's the same MaxHeap after heapSort was declared!");
        firstTest.printMaxHeap();
        
        MaxHeap fifthTest = new MaxHeap(fifth);
        firstTest.printMaxHeap();
        firstTest.heapSort();
        System.out.println("Here's the same MaxHeap after heapSort was declared!");
        firstTest.printMaxHeap();
    }  
}
