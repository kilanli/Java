public class Main {
    public static void main(String[] args) {
        Kedi kedi=new Kedi("Tekir",10);
        Kopek kopke=new Kopek("Karabas",6);
        kedi.yuru();
        kedi.yas=4;
        kedi.yasSoyle();
        kedi.sesCikar();
        kopke.sesCikar();
    }
}