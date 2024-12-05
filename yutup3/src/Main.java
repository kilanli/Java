import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        menuGoster();
    }

    public static void menuGoster() {
        Scanner input = new Scanner(System.in);
    int get=0;
        while (get != 4) {
            System.out.println("1. Ara");
            System.out.println("2. Kaydet");
            System.out.println("3. Yükle");
            System.out.println("4. Çıkış");
             get = input.nextInt();
        }
    }
}
