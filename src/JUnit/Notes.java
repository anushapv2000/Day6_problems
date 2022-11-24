package JUnit;


import java.util.Scanner;

public class Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the note value");
        int no=sc.nextInt();
        int[] a={1000,500,100,50,10,5,2,1};
        int val = 0,c=0;
        for(int i=0;i<a.length;i++) {
            if ((no / a[i]) == 0) {
                continue;
            } else {
               // System.out.println("noteva"+a[i]);
                val = no / a[i];
                System.out.println(a[i] + " " + val);
                c=c+val;
                if ((no % a[i]) == 0) {
                    break;
                }
                else {
                   // System.out.println("val mod"+no%a[i]);
                    no = no % a[i];
                   // continue;

                }
            }
        }
        System.out.println("Number of minimum notes required is="+c);
    }
}
