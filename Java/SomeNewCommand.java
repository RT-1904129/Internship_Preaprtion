
import java.util.Scanner;

// public class SomeNewCommand {
//     public static void main(String[] args) {
//         // SYNTAX ERROR DEMO
//         // int a = 0 // Error: no semicolon!
//         // b = 8; // Error: b not declared!

//         // LOGICAL ERROR DEMO
//         // Write a program to print all prime numbers between 1 to 10
//         System.out.println(2);
//         for (int i=1; i<5; i++){
//             System.out.println(2*i+1);
//         }

//         // RUNTIME ERROR
//         int k;
//         Scanner sc = new Scanner(System.in);
//         k = sc.nextInt();
//         System.out.println("Integer part of 1000 divided by k is "+ 1000/k);

//     }
// }

// public class cwh_80_try {
//     public static void main(String[] args) {
//         int a = 6000;
//         int b = 0;
//         // Without Try:
// //        int c = a / b;
// //        System.out.println("The result is " + c);
//         // With Try:
//         try {
//             int c = a / b;
//             System.out.println("The result is " + c);
//         }
//         catch(Exception e) {
//             System.out.println("We failed to divide. Reason: ");
//             System.out.println(e);
//         }
//         System.out.println("End of the program");
//     }
// }


// public class cwh_81 {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array index");
//         int ind = sc.nextInt();

//         System.out.println("Enter the number you want to divide the value with");
//         int number = sc.nextInt();
//         try{
//             System.out.println("The value at array index entered is: " + marks[ind]);
//             System.out.println("The value of array-value/number is: " + marks[ind]/number);
//         }
//         catch (ArithmeticException e){
//             System.out.println("ArithmeticException occured!");
//             System.out.println(e);
//         }
//         catch (ArrayIndexOutOfBoundsException e){
//             System.out.println("ArrayIndexOutOfBoundsException occured!");
//             System.out.println(e);
//         }
//         catch (Exception e){
//             System.out.println("Some other exception occured!");
//             System.out.println(e);
//         }
//     }



// public class cwh_82_nested_try_catch {
//     public static void main(String[] args) {
//         int [] marks = new int[3];
//         marks[0] = 7;
//         marks[1] = 56;
//         marks[2] = 6;
//         Scanner sc = new Scanner(System.in);
//         boolean flag = true;
//         while(flag) {
//             System.out.println("Enter the value of index");
//             int ind = sc.nextInt();
//             try {
//                 System.out.println("Welcome to video no 82");
//                 try {
//                     System.out.println(marks[ind]);
//                     flag = false;
//                 } catch (ArrayIndexOutOfBoundsException e) {
//                     System.out.println("Sorry this index does not exist");
//                     System.out.println("Exception in level 2");
//                 }
//             } catch (Exception e) {
//                 System.out.println("Exception in level 1");
//             }
//         }
//         System.out.println("Thanks for using this program");
//     }
// }

public class SomeNewCommand {
    
}
