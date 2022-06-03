class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

// By using extends we can derived parent class Base .This is inheritence .
// two class canot act as superclass for a subclass So the multiple Inheritance 
// does not allowed in java .we can access all thing from parent class accept the 
// private things of parents in inheritence.
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

// public class Inheritence {
//     public static void main(String[] args) {
//         // Creating an Object of base class
//         Base b = new Base();
//         b.setX(4);
//         System.out.println(b.getX());

//         // Creating an object of derived class
//         Derived d = new Derived();
//         d.setY(43);
//         System.out.println(d.getY());
//     }
// }




// public class Inheritence {
//     public static void main(String [] args){

//     }
// }






// class Base1{
//     Base1(){
//         System.out.println("I am a constructor");
//     }
//     Base1(int x){
//         System.out.println("I am an overloaded constructor with value of x as: " + x);
//     }
// }

// class Derived1 extends Base1{
//     Derived1(){
//         //super(0);
//         System.out.println("I am a derived class constructor");
//     }
//     Derived1(int x, int y){
//         super(x);
//         System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
//     }
// }

// class ChildOfDerived extends  Derived1{
//     ChildOfDerived(){
//         System.out.println("I am a child of derived constructor");
//     }
//     ChildOfDerived(int x, int y, int z){
//         super(x, y);
//         System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
//     }
// }
// public class cwh_46_constructors_in_inheritance {
//     public static void main(String[] args) {
//         // Base1 b = new Base1();
//         // Derived1 d = new Derived1();
//         // Derived1 d = new Derived1(14, 9);
//         // ChildOfDerived cd = new ChildOfDerived();
//         ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
//     }
// }


// this :-is a way for us to reference an object of the class which is being created/referenced.
// super :- A reference variable used to refer immediate parent class object. 
// class EkClass{ 
//     int a; 
//     public int getA() { 
//         return a; 
//     } 
   
//     EkClass(int a){ 
//         this.a = a;
//      } 
//     public int returnone(){
//         return 1; 
//     } 
// } 
//     class DoClass extends EkClass{ 
//         DoClass(int c){ 
//             super(c); 
//             System.out.println("I am a constructor"); 
//         } 
//     } 
//     public class Inheritence { 
//         public static void main(String[] args) {
//             // EkClass e = new EkClass(65); 
//             DoClass d = new DoClass(4); 
//             // System.out.println(e.getA()); 
//         } 
//     }

// we should care about Override sign also because it is recommanded to use it
class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}