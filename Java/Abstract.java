// Abstract means existing in thought as an idea but do not have concrete existence(physical existence)
// Abstract method :- A method that is declared without an implimentation is called abstract method
// For example - abstract void moveTo(double x,double y)
// if any class include abstract method then the class itself called as abstract class
// So for if we are overridde all funtions of abstract method than only the given function is not abstract class unless it is become abstratc class .

abstract class Parent2{
    int a=45;
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}


class Child2 extends Parent2{
    // int a= 50;
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
    public void sayHello(){
        System.out.println("You Hello");
    }
}

// Here function is abstract because it need to overide both greet and greet2 methode but it overrideonly
abstract class Child3 extends Parent2{
    public void greet2(){
        System.out.println("I am good");
    }
}
public class Abstract {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child2 c = new Child2();
        c.a = 70;// we can modify abstract value from outside
        System.out.println(" a ki value," + c.a);
        c.sayHello();
        c.greet2();
        c.greet();
        // Child3 c3 = new Child3(); -- error
    }
}
