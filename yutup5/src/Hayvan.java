public class Hayvan {
    int yas;
    String isim;

    public Hayvan(String isim, int yas) {
    }

    public void Hayvan(String isim,int yas)
    {
        this.isim=isim;
        this.yas=yas;
    }
    public void yuru()
    {
        System.out.println("Yürüyorum");
    }
    public void yasSoyle()
    {
        System.out.println("Yas:"+yas);
    }
    public void sesCikar()
    {
        System.out.println("Ben bir hayvanim");
    }
}
