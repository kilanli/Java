import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Scanner input =new Scanner(System.in);
        System.out.println("Enter a year");
        int year=input.nextInt();
        if(((year%4 ==0)&&(year%100!=0))||(year%400==0))
            System.out.println("This year is a leap year");
        else
            System.out.println("this year is not a leap year"); */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two num:");
        int num1=input.nextInt();
        int num2= input.nextInt();
        int gcd=1;
        int div=2;
        while (div<=num1 && div<=num2) {
            if (num1 % div == 0 && num2 % div == 0)
                gcd = div;
            div++;
        }
        System.out.println("gcd="+gcd);
    }
}