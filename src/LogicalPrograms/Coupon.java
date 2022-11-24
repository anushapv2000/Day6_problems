package LogicalPrograms;

public class Coupon {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
        int max = 100000000;
        int random = (int) (Math.random() * max);
        String s=" ";
        while(random>0)
        {
            int n=random%chars.length;
            s=s+chars[n];
            random=random/chars.length;
        }
        System.out.println("String is "+s);
    }
}