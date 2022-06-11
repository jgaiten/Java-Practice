
import java.util.NoSuchElementException;

/**
 *
 * @author Joseph Gaiten
 * @version 12/5/18 Project 4 LinkedLargeIntegers
 * This is the main class of the LargeLinkedINtegers project
 *
 */
public class LinkedLargeInteger<E> implements LargeInteger {

    

    LinkedList<Integer> largeIntegerList;
    int carryNum;
    
    /**
     * 
     * @param stringLargeNumber the string accepted by the constructor 
     */
    public LinkedLargeInteger(String stringLargeNumber) {
        largeIntegerList = new LinkedList<>();
        for (int i = 0; i <= stringLargeNumber.length(); i++) {
            int intList = Integer.parseInt(stringLargeNumber);
        }
//        head = new Node();
//        tail = head;
//        size=0;
    }
    /**
     * 
     * @param intLargeNumber the int accepted by the constructor
     */
    public LinkedLargeInteger(int intLargeNumber) {
        this(intLargeNumber + "");

    }
    /**
     * 
     * @param longLargeNumber the long accepted by the constructor
     */
    public LinkedLargeInteger(long longLargeNumber) {
        this(longLargeNumber + "");
    }
    
    
    /**
     * This method adds the values of two LinkedLargeIntegers together
     * @param x the LinkedLargeInteger being added to another LinkedLargeInteger
     * @return the sum of the two LinkedLargeIntegers
     */
   @Override
    public LinkedLargeInteger add(LinkedLargeInteger x) {
        int sum = 0;
       
        String finalSum = "";
       
        LinkedLargeInteger smallest = getShortestList(this, x);
       
        for (int i = 0; i < smallest.largeIntegerList.size(); i++){
            sum = (largeIntegerList.get(i) + (int) x.largeIntegerList.get(i) + carryNum);
            finalSum = carry(sum) + finalSum;
        }
        if (largeIntegerList.size() == x.largeIntegerList.size()){
            finalSum = carryNum + finalSum;
        }
        else if (x.equals(smallest)){
            for (int i = smallest.largeIntegerList.size(); i < largeIntegerList.size(); i++){
                sum = carryNum + largeIntegerList.get(i);
                finalSum = carry(sum) + finalSum;
            }
        }
        else {
            for (int i = smallest.largeIntegerList.size(); i < x.largeIntegerList.size(); i++){
                sum = carryNum + (int) x.largeIntegerList.get(i);
                finalSum = carry(sum) + finalSum;
            }
        }
       
        return new LinkedLargeInteger<Integer>(finalSum);
    }
    
    /**
     * This method performs subtraction on two LinkedLargeIntegers
     * @param x the LinkedLargeInteger amount being subtracted from another 
     * LinkedLargeInteger
     * @return the resulting difference of the subtraction
     */
    @Override
    public LinkedLargeInteger subtract(LinkedLargeInteger x) {
        int sum = 0;
       
        String finalSum = "";
       
        LinkedLargeInteger smallest = getShortestList(this, x);
       
        for (int i = 0; i < smallest.largeIntegerList.size(); i++){
            sum = (largeIntegerList.get(i) - (int) x.largeIntegerList.get(i) - carryNum);
            finalSum = carry(sum) + finalSum;
        }
        if (largeIntegerList.size() == x.largeIntegerList.size()){
            finalSum = carryNum + finalSum;
        }
        else if (x.equals(smallest)){
            for (int i = smallest.largeIntegerList.size(); i < largeIntegerList.size(); i++){
                sum = carryNum + largeIntegerList.get(i);
                finalSum = carry(sum) + finalSum;
            }
        }
        else {
            for (int i = smallest.largeIntegerList.size(); i < x.largeIntegerList.size(); i++){
                sum = carryNum + (int) x.largeIntegerList.get(i);
                finalSum = carry(sum) + finalSum;
            }
        }
       
        return new LinkedLargeInteger<Integer>(finalSum);
    }
    
    /**
     * This method performs multiplication on two LinkedLargeIntegers
     * @param x the given LinkedLargeInteger
     * @return the product of the two LinkedLargeIntegers
     */
    @Override
    public LinkedLargeInteger multiply(LinkedLargeInteger x) {
        int sum = 0;
       
        String finalSum = "";
       
        LinkedLargeInteger smallest = getShortestList(this, x);
       
        for (int i = 0; i < smallest.largeIntegerList.size(); i++){
            sum = (largeIntegerList.get(i) * (int) x.largeIntegerList.get(i) + carryNum);
            finalSum = carry(sum) + finalSum;
        }
        if (largeIntegerList.size() == x.largeIntegerList.size()){
            finalSum = carryNum + finalSum;
        }
        else if (x.equals(smallest)){
            for (int i = smallest.largeIntegerList.size(); i < largeIntegerList.size(); i++){
                sum = carryNum + largeIntegerList.get(i);
                finalSum = carry(sum) + finalSum;
            }
        }
        else {
            for (int i = smallest.largeIntegerList.size(); i < x.largeIntegerList.size(); i++){
                sum = carryNum + (int) x.largeIntegerList.get(i);
                finalSum = carry(sum) + finalSum;
            }
        }
       
        return new LinkedLargeInteger<Integer>(finalSum);
    }
   
    /**
     * A helper method that returns the shortest of two given 
     * LinkedLargeIntegers
     * @param one a LinkedLargeInteger
     * @param two a LinkedLargeInteger
     * @return the LinkedLargeInteger that is the shortest between the two
     */
    public LinkedLargeInteger getShortestList(LinkedLargeInteger one, LinkedLargeInteger two){
        if (one.largeIntegerList.size() > two.largeIntegerList.size()){
            return two;
        }
        return one;
    }
    
    /**
     * This helper method returns an amount being carried 
     * @param r initial amount
     * @return an amount being carried in the mathematical process
     */
    public int carry(int r){
        carryNum = 0;
       
        while (r > 9){
            r -= 10;
            carryNum++;
        }
        return r;
    }
    
    /**
     * This method compares two different Objects for any differences
     * @param obj a given Object
     * @return a 1,0, or -1 depending on if they were the same or if one was
     * greater than the other
     */
    public int compareTo(Object obj) {
        
       // if (this >= obj)
            //return 1;
         if (this == obj)
            return 0;
        else
            return -1;           
    }
    
    
    /**
     * Creates the hashCode for the class
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash  = 7;
        hash = 31 * largeIntegerList.hashCode();
        return hash;
    }

    /**
     * Checks whether two objects are the same
     * @param obj an object 
     * @return a boolean for if the two objects are the same
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
       
        return true;
    }

    /**
     * Prints the data calculated from the LinkedLargeIntegers
     * @return a String containing information from the LinkeLargeIntegers 
     */
    @Override
    public String toString() {
        String string = "";
       
        for (int i = largeIntegerList.size() - 1; i >= 0; i--){
            string += largeIntegerList.get(i) + "";
        }
        return string;
    }
    public static void main(String[] args) {
        LinkedLargeInteger test1 = new LinkedLargeInteger("34332");
        LinkedLargeInteger test2 = new LinkedLargeInteger(777);
        LinkedLargeInteger test3 = new LinkedLargeInteger(1283829473);
        LinkedLargeInteger test4 = new LinkedLargeInteger(100);
        
        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());
        
        System.out.println("Addition");
        System.out.println(test1.add(test3));
        System.out.println(test2.add(test1));
       
        System.out.println("Subtraction");
        System.out.println(test1.subtract(test2));
        System.out.println(test3.subtract(test1));
        
        System.out.println("Multiplication");
        System.out.println(test2.multiply(test1));
        System.out.println(test4.multiply(test2));
        
        
        
    }
}
