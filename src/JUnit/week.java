package JUnit;

public class week {
    public static void main(String[] args){
        dayOfWeek(args);
    }
    public static void dayOfWeek(String[] args){
        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);
        int y=Integer.parseInt(args[2]);
        int yy=y-(14-m)/12;
        int x=yy+(yy/4)-(yy/100)+(yy/400);
        int mm=m+12*((14-m)/12)-2;
        int dd=(d+x+31*mm/12)%7;
        System.out.println(yy+" "+mm+" "+dd);
        String day[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        switch (mm){
            case 1:
                System.out.println("January"+" "+day[dd]);
                break;
            case 2:
                System.out.println("February"+" "+day[dd]);
                break;
            case 3:
                System.out.println("March"+" "+day[dd]);
                break;
            case 4:
                System.out.println("April"+" "+day[dd]);
                break;
            case 5:
                System.out.println("May"+" "+day[dd]);
                break;
            case 6:
                System.out.println("June"+" "+day[dd]);
                break;
            case 7:
                System.out.println("July"+" "+day[dd]);
                break;
            case 8:
                System.out.println("August"+" "+day[dd]);
                break;
            case 9:
                System.out.println("September"+" "+day[dd]);
                break;
            case 10:
                System.out.println("October"+" "+day[dd]);
                break;
            case 11:
                System.out.println("November"+" "+day[dd]);
                break;
            case 12:
                System.out.println("December"+" "+day[dd]);
                break;


        }
    }
}
