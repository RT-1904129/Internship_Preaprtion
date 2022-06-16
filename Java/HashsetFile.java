import java.util.HashSet;
public class HashsetFile {
  public static void main(String [] arg){
//     HashSet(): This constructor is used to create a new empty HashSet that can store 16 elements and have a load factor of 0.75.
//     HashSet(int initialCapacity): This constructor is used to create a new empty HashSet which has the capacity to store the specified number of elements and having a load factor of 0.75.
//     HashSet(int initialCapacity, float loadFactor): This constructor is used to create a new empty HashSet with the capacity & load factor equal to specified integer and float value.
//     HashSet(Collection<? extends E> c): This constructor is used to create a HashSet using the elements of collection c.

        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11); // This element will be ignored

        System.out.println(myHashSet);
        System.out.println("myHashSet before removing any element : " + myHashSet);
        myHashSet.remove(3); //deletes 3 from the hashset
        System.out.println("myHashSet after removing a element : " + myHashSet);

        HashSet<Integer> myHashSet1 = new HashSet<>();

        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet1.isEmpty());

        System.out.println("myHashSet before : " + myHashSet);
        myHashSet.clear(); //deletes all the elements from the hashset
        System.out.println("myHashSet after  : " + myHashSet);
        System.out.println("The size of myHashSet is : " + myHashSet.size());
        

    } 
}
