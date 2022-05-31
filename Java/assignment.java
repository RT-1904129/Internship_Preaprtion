
import java.util.Scanner;


public class assignment {
    public static void main(String [] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the marks per subject :");
        int eachsubject = s.nextInt();
        System.out.println("Enter the math marks :");
        int mat  = s.nextInt();
        System.out.println("Enter the English marks");
        int b =  s.nextInt();
        float total = ((mat+b)*100.0f)/(eachsubject*2);
        System.out.println(total);
    }
}
