
import java.util.Scanner;

public class Literals {
    public static void main(String[] args){
        byte age = 34;
        int age2 = 56;
        short age3 = 87;
        long ageDino  = 5666666L;
        char ch = 'A';
        float f1 = 5.6f;
        double d1 = 4.66;
        boolean a = true;
        System.out.println(a);
        String str = "Harray";

        // it will not creat new line
        System.out.print(str);

        // it will create new line
        System.out.println(d1);
        // Here we are using Literal very strictly 
        // so donot forget to appley Litaral at end of things if they are avilable.
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter the Integer value :");
        // int b = s.nextInt();
        // System.out.println(b);
        // System.out.println("Enter the nes floating value:");
        // float f = s.nextFloat();
        // System.out.println(f);
        System.out.println("Enter the new string:");
        String str1 = s.next();
        System.out.println(str1);
        str1 = s.next();
        System.out.println(str1);

        // Use nextLine alone means don't use with next() because it is taking '\n'input along with thing
        // So better Use it alone. 
        System.out.println("Enter the whole string :");
        String str2 = s.nextLine();
        System.out.println(str2);
        
        // if you want to check either the number is int or not use hasNextInt
        //hasNestDouble if the given nuber is double or not
        // hasNextBoolean ,hasNextByte


        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        // int a = 6;
        // float b = 5.6454f;
        // System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        // System.out.format("The value of a is %d and value of b is %f", a, b);
     

    }
    
}
