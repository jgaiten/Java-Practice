
/**
 *
 * @author Joseph Gaiten
 * @version 12/5/18 Project 4 LinkedLargeIntegers
 * This is the interface class of the LargeLinkedINtegers project
 *
 */
public interface LargeInteger extends Comparable {

    /**
     * 
     * @param LLI
     * @return 
     */
    public LinkedLargeInteger add(LinkedLargeInteger LLI);

    /**
     * 
     * @param LLI
     * @return 
     */
    public LinkedLargeInteger subtract(LinkedLargeInteger LLI);

    /**
     * 
     * @param LLI
     * @return 
     */
    public LinkedLargeInteger multiply(LinkedLargeInteger LLI);

    /**
     * 
     * @param obj
     * @return 
     */
    public int compareTo(Object obj);

    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj);

    /**
     * 
     * @return 
     */
    @Override
    public int hashCode();

    /**
     * 
     * @return 
     */
    @Override
    public String toString();
}
