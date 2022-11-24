package JUnit;

import java.util.Scanner;

public class Binary {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = DectoBin.toBinary();
        System.out.println("orignal = "+s);
        System.out.println("Swapped = "+swap(s));
        System.out.println("Decimal= "+todecimal(swap(s)));
        System.out.println("Power of 2= "+checkpower(swap(s)));

    }

    public static String swap(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.length() == 8) {
                break;
            } else {
                s = "0" + s;
            }
        }
        //System.out.println(s);
        String left = s.substring(0, 4);
        String right = s.substring(4, s.length());
        // System.out.println(left);
        //System.out.println(right);
        String newstr = right + left;
        return newstr;
    }

    public static int todecimal(String newstr) {
        int c = 0;
        int dec = 0;
        //System.out.println(newstr);
        for (int i = newstr.length() - 1; i >= 0; i--) {
            //System.out.println(Integer.parseInt(newstr.substring(i,i+1)));
            dec = (int) (dec + Integer.parseInt(newstr.substring(i, i + 1)) * Math.pow(2, c));
            c = c + 1;
        }
        return dec;
    }

    public static boolean checkpower(String s) {
        int val = todecimal(s);
        {
            if (val == 0) {
                return false;
            }
            while (val != 1) {
                val = val / 2;
                if (val % 2 != 0 && val != 1) {
                    return false;
                }
            }
            return true;
        }
    }
}

