import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

            PazarListesi liste=new PazarListesi(5);
            liste.listeyeEkle("Ekmek");
            liste.listeyeEkle("Su");
            liste.listeyeEkle("Gofret");
            liste.listeyeEkle("Yağ");
            liste.listeyeEkle("un");


            int a;
            String b;
        Scanner input=new Scanner(System.in);
        System.out.println("eklenecek index");
         a=input.nextInt();
        System.out.println("Eklenecek eleman");
        b=input.next();

        liste.ekle(b,a);
        liste.yaz();
    }
}