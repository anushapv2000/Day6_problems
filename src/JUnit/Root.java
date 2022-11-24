package JUnit;

import java.util.Scanner;

public class Root {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args)
    {
        sqrt();
    }
    public static void sqrt(){
        System.out.println("Enter value");
        int c=sc.nextInt();
        int t=0;
        t=c;
        double e=0.000000000000001;
        while(Math.abs(t-(c/t)) < e*t){
            t=c/t;
            System.out.println("Output = "+t);
        }

    }
}
