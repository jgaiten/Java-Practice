
import java.util.Arrays;


/**
 *
 * @author Joseph Gaiten
 * @date 2/12/2019
 * Description: This is the MaxHeap, which envokes all of the possible 
 * methods to manipulate the MaxHeap int arrays created in MaxHeapMain.
 */
public class MaxHeap {
    private int[] heapArray;
    private int heapSize;
    
    //Any advice for the steps for setting up the constructor? I don't understand them.
    public MaxHeap(int[]values){
       heapArray = new int[values.length];
        for (int i = 0; i < heapArray.length; i++) {
            heapArray[i] = values[i];
            
        }
        heapSize = heapArray.length;
        buildMaxHeap();
    }
    
    private int parentOf(int index){
        if (index>=0 && index<=heapSize-1) {
            int parentIndex = (index+1)/2 -1 ;
            return parentIndex;
        }
        return -1;
    }
    private int leftChildOf(int index){
       int leftChildIndex = 2 * (index+1) - 1;
         if (leftChildIndex < heapSize) {
            return leftChildIndex;
        }
       return -1; 
    }
    
    private int rightChildOf(int index){
        int rightChildIndex = 2 * (index+1);
         if (rightChildIndex < heapSize) {
            return rightChildIndex;
        }
       return -1;   
    }
    //print out heapsize and elements of array
    public void printMaxHeap(){
        System.out.println("Here's the heapsize: " + heapSize);
        System.out.println("Here are the elements of the array: ");
        for (int i = 0; i < heapSize; i++) {
            System.out.print(heapArray[i] + ", ");
        }
    }
    
    //look at pseudocode for this again and how to swap
    private void maxHeapify(int index){
        int largest;
        int left = leftChildOf(index);
        int right = rightChildOf(index);
        
        if (left <= heapSize && heapArray[left] > heapArray[index]) {
            largest = left;
        }
        else largest = index;
        if (right <= heapSize && heapArray[right] > heapArray[index]) {
            largest = left;
        }
        if (largest != index) {
            int i = heapArray[index];
            int j = heapArray[largest];
            heapArray[largest] = i;
            heapArray[index] = j;
            maxHeapify(largest);
        }
 
    }
    
    private void buildMaxHeap(){
        for (int i = heapSize/2; i > 1; i--) {
            maxHeapify(i);
        }
    }
    
    public void heapSort(){
        int backupCopy = heapArray[heapSize];
        for (int i = heapArray[heapSize]; i > 2; i--) {
            int k = heapArray[1];
            int j = heapArray[i];
            heapArray[i] = k;
            heapArray[1] = j;
            maxHeapify(1);
        }
        heapArray[heapSize] = backupCopy;
    }
}
