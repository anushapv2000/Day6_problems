package JUnit;

public class Payment {
    public static void monthlyPayment(String[] args){
        double P=Double.parseDouble(args[0]);
        double Y=Double.parseDouble(args[1]);
        double R=Double.parseDouble(args[2]);
        double payment=0;
        double r=R/(12*100);
        payment=(P*r)/(1-Math.pow((1+r),(-12*Y)));
        System.out.println(payment);

    }
    public static void main(String[] args)
    {
        monthlyPayment(args);
    }
}
