import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("2 veya daha büyük bir sayi girin.");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();
        if(sayi<2){
            boolean cont=false;
        }
        for(int i=2;i<sayi;i++)
        {
            
            System.out.println(i);
        }

    }
}