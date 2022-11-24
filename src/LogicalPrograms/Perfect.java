package LogicalPrograms;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int sum=0;
        for (int i=1;i<=no/2;i++){
            if(no%i==0) {
                sum = sum + i;
            }
        }
        if(no==sum)
        {
            System.out.println(no+" is a perfect number");
        }
        else
        {
            System.out.println("Not a perfect number");
        }

    }
}
