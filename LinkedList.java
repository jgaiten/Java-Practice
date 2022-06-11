
import java.util.NoSuchElementException;

/**
 *
 * @author Joseph Gaiten
 * @version 12/5/18 Project 4 LinkedLargeIntegers This is the LinkedList class
 * of the LargeLinkedINtegers project
 *
 */
public class LinkedList<E> {

    private Node head;
    private Node tail;
    private int size;

    /**
     * Creates the Nodes in the project
     */
    public class Node {

        private E data;
        private Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(E data) {
            this(data, null);
        }

        public Node() {
            this(null, null);
        }
    }

    public int size() {
        return getSize();
    }

    /**
     *
     * @param index
     * @return
     */
    private Node getNodeBefore(int index) {
        Node current = getHead();
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     *
     * @param obj
     * @return
     */
    public boolean contains(Object obj) {
        Node current = getHead().next;
        while (current != null) {
            if (current.data.equals(obj)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     *
     * @param obj
     * @return
     */
    public int indexOf(Object obj) {
        Node current = getHead().next;
        int index = 0;
        while (current != null) {
            if (current.data.equals(obj)) {
                return index;
            }
            current = current.next;
            index++;
        }
        throw new NoSuchElementException();
    }

    /**
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        return getNodeBefore(index).next.data;
    }

    /**
     *
     * @param element
     */
    public void add(E element) {
        tail.next = new Node(element);
        tail = getTail().next;
        size++;
    }

    /**
     *
     * @param index
     * @param element
     */
    public void set(int index, E element) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        getNodeBefore(index).next.data = element;
    }

    /**
     *
     */
    public void clear() {
        head.next = null;
        tail = getHead();
        size = 0;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void moveFirstToLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (getSize() > 1) {
            Node temp = getHead().next;
            head = temp.next;
            temp.next = null;
            tail.next = temp;
            tail = temp;
        }

    }

    public void moveLastToFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (getSize() > 1) {
            tail.next = getHead().next;
            head.next = getTail();
            tail = getNodeBefore(getSize() - 1);
            tail.next = null;
        }
    }

    public void swap(int i, int j) {
        if (i >= getSize() || j >= getSize()) {
            throw new IndexOutOfBoundsException("Properly caught bad arguments");
        }
        if (i == j) {
            return;
        }

        Node current1 = getNodeBefore(i);
        Node temp1 = current1.next;
        Node current2 = getNodeBefore(j);
        Node temp2 = current2.next;
        if (temp1 == null || temp2 == null) {
            System.out.println("Null found in one of temp Nodes");
        }
        current1.next = temp2;
        current2.next = temp1;
        Node temp3 = temp1.next;
        temp1 = temp2.next;
        temp2.next = temp3;

    }

    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }
}
