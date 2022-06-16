import java.util.*;
public class ArrayDequeFile{
    public static void main(String[] args){
        // It it type of Deque like in c++
        // used to create an empty array deueue that has the capacity to hold 16 elements
        ArrayDeque<Integer>ad1 = new ArrayDeque<>();


        // ArrayDeque(): Used to create an empty array deque that has the capacity to hold 16 elements.
        // ArrayDeque(int numElements): Used to create an empty array deque that has the capacity to hold the specified number of elements.
        // ArrayDeque(Collection<? extends E> c): Used to create an array deque containing all the elements of the specified collections.
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);
        ad1.offerFirst(10);
        System.out.println(ad1);

        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addLast(5);
        ad1.offerLast(10);
        
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());

        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());

        // ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        // ad1.add(6);
        // ad1.add(56);
        // ad1.add(9);
        // ad1.add(10);
        // ad1.add(91);
        // ad1.add(19);
        ad1.pollFirst(); //deletes 6
        ad1.removeFirst(); //deletes 56
        ad1.addFirst(5);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());



    }
}