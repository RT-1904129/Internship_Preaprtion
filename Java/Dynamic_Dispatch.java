
//Dynamic method dispatch is also known as run time polymorphism.
// This technique is used to resolve a call to an overridden method at runtime rather than compile time
// its based on upcasting concept
// Upcasing is a technique in which a superclass reference variable refers to the object of the subclass.
// means Animal a = new Dog(); <=============== is correct result;
// But Dog a = new Animal(); <============ its wrong
// class Animal{}  
// class Dog extends Animal{} 



// public class Dynamic_Dispatch {
//     public static void main(String[] args) {
        
//     }
// }
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Dynamic_Dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        
        obj.on(); // its allowed
        // obj.music(); Not allowed
        obj.showTime(); // its allowd 


    }
}
