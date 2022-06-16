import java.util.*;
public class LinkedListFile {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

            l1.add(11);
            l1.add(22);
            l1.add(33);
            l1.add(44);
            l1.add(55);
            l1.add(77);
            l1.add(5,77); // Inserts 77 at index 5
            System.out.println("L1 Linked list : "+ l1);
            
            System.out.println("L1 Linked list before: "+ l1);

            l1.remove(2); //removes element present at 2nd index
            System.out.println("L1 Linked list after: "  + l1);
            l1.set(2,10); //changes element present at 2nd index (33 changed to 10)
            System.out.println("L1 Linked list after: "  + l1);

            l1.addLast(100); //Inserting 100 at the end of L1

            l1.addFirst(0); //Inserting 0 at the starting of L1

            l1.addLast(676);
            l1.addFirst(788);
            System.out.println(l1.contains(27));
            System.out.println(l1.indexOf(6));
            System.out.println(l1.lastIndexOf(6));

            //l1.clear();
            l1.set(1, 566);
            for(int i=0; i<l1.size(); i++){
                System.out.print(l1.get(i));
                System.out.print(", ");
            }
    
        }
}
