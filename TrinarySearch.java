
/**
 * @author Joseph Gaiten
 * @version 1/26/2019 
 * Homework 1: Recursion w/ Trinary Search 
 * Description: This
 * class performs a trinary search on five given lists of ints as int arrays in
 * order to find a target value
 */
public class TrinarySearch {

    //the five lists that are being searched through using Trinary Search
    public static int[] numList1 = {2, 4, 5, 7, 14, 20, 45, 55, 75, 100, 120, 200, 205};
    public static int[] numList2 = {1, 6, 8, 10, 12, 13, 14, 15, 19, 20, 25, 30, 40};
    public static int[] numList3 = {2, 3, 4, 4, 5, 6, 7, 8, 8, 10, 12, 14, 35, 57, 70};
    public static int[] numList4 = {10, 12, 24, 43, 66, 67, 77, 78, 85, 91, 100};
    public static int[] numList5 = {45, 46, 75, 86, 100, 110, 120};

    /**
     * @param data- the given list of ints in an int array
     * @param start- the starting point of the search, inclusively
     * @param end- the end point of the search, inclusively
     * @param target- the int being searched for in the list
     * @return the target int value if it is found, and -1 if it is not found
     * Description: This method performs a trinary search using given int arrays,
     * a starting point, an end point, and a given target to search for. 
     */
    public static int triSearch(int[] data, int start, int end, int target) {
        int dataLength = end - start + 1;

        if (dataLength >= 3) {
            int interval = dataLength / 3;
            int bound1 = interval + start;
            int bound2 = interval * 2 + start;
            if (target <= data[bound1]) {
                return triSearch(data, start, bound1, target);
            } else if (target <= data[bound2]) {
                return triSearch(data, bound1 + 1, bound2, target);
            }
            return triSearch(data, bound2 + 1, end, target);
        }
        for (int i = start; i <= end && dataLength != 0; i++) {
            if (data[i] == target) {
                System.out.println("This number was found at index ");
                return i;
            }
        }
        System.out.println("The number was not found");
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("For the first search, the list of numbers is: ");
        for (int i : numList1) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("The number being searched for is 55.");
        System.out.println(triSearch(numList1, 0, 13, 55));
        
        System.out.println();
        
        System.out.println("For the second search, the list of numbers is: ");
        for (int i : numList2) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("The number being searched for is 1.");
        System.out.println(triSearch(numList2, 0, 13, 1));
        
        System.out.println();
        
        System.out.println("For the third search, the list of numbers is: ");
        for (int i : numList3) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("The number being searched for is 4.");
        System.out.println(triSearch(numList3, 0, 14, 4));
        
        System.out.println();
        
        System.out.println("For the fourth search, the list of numbers is: ");
        for (int i : numList4) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("The number being searched for is 100.");
        System.out.println(triSearch(numList4, 0, 10, 100));
        
        System.out.println();
        
        System.out.println("For the fifth search, the list of numbers is: ");
        for (int i : numList5) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("The number being searched for is 0, which is not in the list.");
        System.out.println(triSearch(numList5, 0, 7, 0));
    }
}
