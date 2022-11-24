package JUnit;

import java.util.Scanner;

public class DectoBin {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String s=toBinary();
        System.out.println("Binary value is "+s);
    }
    public static String toBinary(){
        System.out.println("Enter the value");
        int no=sc.nextInt();
        int r=0;String s="";
        while(no!=0){
            r=no%2;
            s=String.valueOf(r)+s;
            no=no/2;
        }
        return s;
    }
}
