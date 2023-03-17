import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        boolean leap = false;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Year");
        int a = sc.nextInt();
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap=false;
        if (leap)
        {
            System.out.println("it is leap year");
        }
        else
            System.out.println("not leap year");
    }
}
