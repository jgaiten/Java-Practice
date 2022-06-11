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
 * Homework 5: HashTable - This is the main method file of the program, which 
 * creates ChainedHashTable and OpenAddressedHashTable objects and tests all of
 * methods in each.
 */
public class HashingMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> test1 = new LinkedList<>();
        test1.add(2,1);
        System.out.println(test1.toString());
        
        ChainedHashTable CHT1 = new ChainedHashTable(30);
        OpenAddressedHashTable OAHT1 = new OpenAddressedHashTable(60);
    }
    
}
