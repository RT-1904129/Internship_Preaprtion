
import java.util.Scanner;
import java.util.Random;
public class fundamental {
    static public void main(String [] args){
        // jdk == (java Standered API) + (Java virtal machine)
        // int a = 23;
        // if(a > 18){
        //     System.out.println("You can derive");
        // }
        // else{
        //     System.out.println("You are underage !");
        // }
        // boolean a = true;
        // boolean b = false;
        // System.out.println(!a);
        //        if (a && b){
        //            System.out.println("Y");
        //        }
        //        else{
        //            System.out.println("N");
        //        }
        //        if (a || b){
        //            System.out.println("Y");
        //        }
        //        else{
        //            System.out.println("N");
        //        }

        // int age;
        // Scanner sc = new Scanner(System.in);
        // age = sc.nextInt();
        // switch(age){
        //     case 18:
        //         System.out.println("You are going to become an Adult!");
        //         break;
        //     case 23:
        //         System.out.println("You are going to join job!");
        //         break;
        //     case 60:
        //         System.out.println("You are going to retired!");
        //         break;
        //     default:
        //         System.out.println("Enjoy Your Life !");
        // }
        // The same idea can be also written by as 
        // switch(age){
        //     case 18 ->{
        //         System.out.println("You are going to become an Adult!");
        //         System.out.println("You are going to become an Adult!");
        //         System.out.println("You are going to become an Adult!");
        //         System.out.println("You are going to become an Adult!");
        //     }
        //     case 23 -> System.out.println("You are going to join job!");
            
        //     case 60 -> System.out.println("You are going to retired!");
            
        //     default -> System.out.println("Enjoy Your Life !");
        // }
        
//        Question 6
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
        
        // for generating random number we will use
        Random r = new Random();
        int a = r.nextInt();
        System.out.println(a);
        // while(i<=200){
        //     System.out.println(i);
        //     i++;
        // }
        // do{  
        //     System.out.println(i);  
        //     i++;  
        // }while(i<=10);
        // for(int i=5; i!=0; i--){
        //     System.out.println(i);
        // }
        //using for loop  
        // for(int i=10;i>0;i--){  
        //     if(i==7){  
        //         break;   //break the loop
        //     }  
        // System.out.println(i);  
        // } 
        // for(int i=7;i>0;i--){  
        //     if(i==3){  
        //         continue;//continue skips the rest statement
        //     }  
        //     System.out.println(i);  
        // }  

        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
        int [] marks = {98, 45, 79, 99, 80};

        // marks[5] = 96; - throws an error
        System.out.println(marks[4]);
        // Quick Quiz: Displaying the Array (for-each loop)
        // System.out.println("Printing using for-each loop");
        // for(int element: marks){
        //     System.out.println(element);
        // }
        // String[][][] arr = new String [2][3][4]
        // int [][] flats = new int[2][3]          //A 2-D array of 2 rows + 3 columns
        
    }
}
