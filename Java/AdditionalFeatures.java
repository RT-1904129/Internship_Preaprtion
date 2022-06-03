
import java.util.Random;

// This is external thing we learnet
// public class AdditionalFeatures {
//     // Here we can take infinite argument This is important features of java
//     static int add(int ...arr){
//         int result = 0;
//         for (int a : arr){
//             result = result + a;
//         }
//         return result;
// }

// public static void main(String[] args, int i){
//     System.out.println(add(1,2));
//     System.out.println(add(2,3,4));
//     System.out.println(add(4,5,6));
// }
// }

// OOBS started ===========================================

// class Employee{
//     int id;
//     int salary;
//     String name;
//     public void printDetails(){
//         System.out.println("My id is " + id);
//         System.out.println("and my name is "+ name);
//     }

//     public int getSalary(){
//         return salary;
//     }
// }

// class Employee{
//     int Salary;
//     String name;
//     public int getSalary(){
//         return Salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String newName){
//         name = newName;
//     }
// }

// class cellphone{

//     public void ring(){
//         System.out.println("ringing....");
//     }
//     public void vibr(){
//         System.out.println("Vibrating....");
//     }
// }
// if you want t creste new random nuber 
    

// class MyEmployee{
//     // So if we do attribute as private we need to define methods for this to access its value or change its value 
//     // We canot do it directly
    
//     private int id;
//     private String name;

//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         this.name = n;
//     }
//     public void setId(int i){
//         this.id = i;
//     }
//     public int getId(){
//         return id;
//     }
// }


// we can use **this** also as we are using self in python for example
// So for good Programming Practice use **this** along with attribute when you are calling it.
// For getting value of PI we will use Math.PI in function 


// class Cylinder{
//     private int radius;
//     private int height;

//     public Cylinder(int radius, int height) {
//         this.radius = radius;
//         this.height = height;
//     }

//     public int getRadius() {
//         return radius;
//     }

//     public void setRadius(int radius) {
//         this.radius = radius;
//     }

//     public int getHeight() {
//         return height;
//     }

//     public void setHeight(int height) {
//         this.height = height;
//     }
//     public double surfaceArea(){
//         return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
//     }
//     public double volume(){
//         return Math.PI * radius * radius * height;
//     }


// }

// We can define constructor function also along with class and that should be public in nature.
class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 0;
        name = "Your-Name-Here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 1;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

public class AdditionalFeatures {
    public static void main(String[] args) {
        // System.out.println("This is our custom class");
        // Employee harry = new Employee(); // Instantiating a new Employee Object
        // Employee john = new Employee(); // Instantiating a new Employee Object

        // // Setting Attributes for Harry
        // harry.id = 12;
        // harry.salary = 34;
        // harry.name = "CodeWithHarry";

        // // Setting Attributes for John
        // john.id = 17;
        // john.salary = 12;
        // john.name = "John Khandelwal";

        // // Printing the Attributes
        // harry.printDetails();
        // john.printDetails();
        // int salary = john.getSalary();
        // System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);

        // Employee harry = new Employee();
        // harry.setName("CodeWithHarry");
        // harry.Salary = 233;
        // System.out.println(harry.getSalary());
        // System.out.println(harry.getName());
        // cellphone mobile = new cellphone();
        // mobile.ring();
        // mobile.vibr();

        // Random x = new Random();
        // // Inside nextInt what we write it is bound of it.
        // int y =  x.nextInt(5);
        // System.out.println(y);


        // MyEmployee harry = new MyEmployee();
        // // harry.id = 45;
        // // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        // harry.setName("CodeWithHarry");
        // System.out.println(harry.getName());
        // harry.setId(234);
        // System.out.println(harry.getId());

        
        // MyMainEmployee harry = new MyMainEmployee();
        //harry.setName("CodeWithHarry");
        //harry.setId(34);
        // System.out.println(harry.getId());
        // System.out.println(harry.getName());
    }
}
