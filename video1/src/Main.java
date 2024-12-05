import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("merhaba dünya");
        String isim,soyad;
        isim="Ayse";
        soyad=isim+ " Merve "+ isim;
        System.out.println("merhaba");
        System.out.print(soyad);
        System.out.println("nasılsın");
        System.out.print(isim);
        int a=5,b=9;
        System.out.println("A+B ="+ a+b);
        // stringler ile işlem yapılırken sonuç yazdırmak için parantez içinde  işlemi yazıyoruz
        System.out.println("A+B ="+ (a+b));
        Scanner input=new Scanner(System.in);
        System.out.println("İsminiz");
        String s=input.nextLine();
        if (s.equals("ali"))
            System.out.println("amcan nasil:");
    }
}