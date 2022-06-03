
import java.util.Scanner;
import java.util.Random;

public class method {

    // static int calculate(int a,int b){
    //     return a+b;
    // }
    // static public void main(String [] args){
    //     // It is used when function is not Static if you make it Static than 2nd method applied.
    //     // method obj = new method();
    //     // int c = obj.calculate(2,3);
    //     // 2nd method
    //     int c = calculate(2,3);
    //     System.out.println(c);
    // }

    // here we can do function Overloading

    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!"); 
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        // tellJoke();

        // Case 1: Changing the Integer
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);


        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!


    }
}
