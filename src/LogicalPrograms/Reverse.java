package LogicalPrograms;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int no=sc.nextInt();
        int rev=0;
        while (no!=0)
        {
            int n=no%10;
            rev=rev*10+n;
            no=no/10;
        }
        System.out.println("reversed  Number="+rev);
    }
}
