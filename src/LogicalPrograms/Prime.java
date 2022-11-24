package LogicalPrograms;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();
        int c = 0;
        for (int i = 2; i <= no / 2; i++) {
                if (no % i == 0) {
                    c = 1;
                }
            }
            if (c == 1) {
                System.out.println(no + " is not prime number");
            } else if (no==0) {
                System.out.println(no + " is not prime number");
            }
            else if (no==1) {
                System.out.println(no + " is not prime number");
            }
            else {
                System.out.println(no + " is  prime number");
            }
        }
    }

