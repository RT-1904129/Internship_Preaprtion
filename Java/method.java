import java.util.function.ObjDoubleConsumer;
import java.util.Scanner;
import java.util.Random;

public class method {

    int calculate(int a,int b){
        return a+b;
    }
    static public void main(String [] args){
        method obj = new method();
        int c = obj.calculate(2,3);
        System.out.println(c);
    }
}
