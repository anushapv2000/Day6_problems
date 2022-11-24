package LogicalPrograms;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {   int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Number of times series to be printed");
        int no =sc.nextInt();
        int f=1;int s=0;
        if(no==1){
            System.out.println("Series="+s);
        } else if (no==2) {
            System.out.println("Series="+s+" "+f);
        }
        else
        {
            System.out.print("Series=");
            System.out.print(s+" "+f);
            for(int i=2;i<no;i++)
            {

                sum=s+f;
                System.out.print(" "+sum);
                s=f;
                f=sum;
            }
        }
    }
}
