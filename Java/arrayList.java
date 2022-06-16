
import java.util.*;
public class arrayList {
    public static void main(String [] args){
        // The ArrayList class is the dynamic array found in the java.util package.
        // it behave like vector
        ArrayList<Integer>l1 = new ArrayList<>();
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(5); 
        // add(Index,Object) : Inserts an element at the given index
        l1.add(5,5);  // inserts 5 at the 5th index in l1

        System.out.println("Array list before : "+ l1);

        l1.remove(0);
        System.out.println("ArrayList after removing the value at index 0 :" + l1);
        
        ArrayList<Integer> l2 = new ArrayList<>();

        System.out.println("Array list : "+ l1);
        System.out.println("L1 list contains 7 : " + l1.contains(7));
        System.out.println("L1 list contains 4 : " + l1.contains(4));

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        System.out.println("L1 Array list : "+ l1);
        System.out.println("L2 Array list : " +l2);
        l1.addAll(l2);

        // You can add the elements of l2 at the starting of l1 by typing
        // L1.addAll(0,l2);
        // l1.clear() for clear the list
        System.out.println("L1 Array list after merging: "+ l1);
        System.out.println("L2 Array list : " +l2);
        System.out.println("L1 Array list : "+ l1);
        System.out.println("The first occurrence of 3 in l1 is at index : " + l1.indexOf(3));
        System.out.println("L1 Array list : "+ l1);
        System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(3));

        l1.set(1,566);
        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
