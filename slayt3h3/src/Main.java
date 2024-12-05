import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*  Scanner input=new Scanner(System.in);
        System.out.println("Enter a year.");
        int year=input.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println(year+"is a leap year");
        }
        else
            System.out.println(year+"is not a leap year");


        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int gcd=1,div=2;

        while (div<=num1 && div<=num2)
        {
            if(num1%div==0 && num2%div==0)
                gcd=div;
            div++;
        }
        System.out.println("gcd:"+gcd);
        */

        int[] numbers={1,2,3};
         for(int number:numbers){
             System.out.println(number);}
         Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int numofPrimes=input.nextInt();
        int count=0,num=2;
        while (count<numofPrimes)
        {
            boolean isPrime=true;
            for(int div=2;div<=num/2;div++)
            {
                if(num%div==0)
                    isPrime=false;
            }
            if (isPrime==true) {
                count++;
                System.out.println(num);
            }
            num++;
        }
    }
}