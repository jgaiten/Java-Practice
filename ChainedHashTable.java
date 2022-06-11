package hw5.hashing;
import java.util.LinkedList;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Joseph Gaiten
 * @version 3/24/2019
 * Class: CSCI 333
 * Professor Whitley
 * Homework 5: HashTable - This program creates Chained Hash Tables with a given
 * input to determine its size. It also has insert, delete, search, and printTable
 * methods
 */
public class ChainedHashTable {
    
    public ChainedHashTable(int inputs){
        int arraySize = (int)Math.pow(2, inputs + 1);
        int[] mainArray = new int[arraySize];
    }
    
   public void insert(ChainedHashTable T, int x){
       int k = x;
       for (int i = 0; i < x; i++) {
           int j = x;
       }
   }
   
   public void search(ChainedHashTable T, int key){
       for (int i = 0; i < 10; i++) {
           int j = key;
       }
   }
   
   public void delete(ChainedHashTable T, int x){
       int k = x;
   }
   
   private int tableSize(ChainedHashTable T){
       return -1;
   }
}
