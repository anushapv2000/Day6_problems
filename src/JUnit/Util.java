package JUnit;

import java.util.Scanner;

public class Util {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("enter 1 - Cel to Fahrenheit 2 - Fahrenheit to celcius");
        int ch=sc.nextInt();
        temperatureConversion(ch);
    }
    public static  void temperatureConversion(int ch)
    {double f=0.0,cel=0.0;
        if (ch==1){
            f=0;
            System.out.println("Enter celcius value");
            cel= sc.nextDouble();
            f=((cel*9)/5)+32;
            System.out.println("fahrenheit values= "+f);

        }
        else {
            System.out.println("Enter fahrenheit value");
            f=sc.nextDouble();
            cel = ((f - 32) * 5) / 9;
            System.out.println("Celcius="+cel);
        }

    }
}
