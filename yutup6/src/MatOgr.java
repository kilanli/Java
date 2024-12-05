public class MatOgr extends Ogr implements Bil{
    public MatOgr(String isim,int no)
    {
        super(isim,no);
    }
    public void hesapla()
    {
        System.out.println("Hesapladim");
    }

    @Override
    public void bolumSoyle() {
        System.out.println("Bolumum Mat");
    }

    @Override
    public void bilgiyaz() {
        System.out.println("Bilgisayar ile yazıldı");
    }

    @Override
    public int bilgi(int a, int b) {
        return a*b+b*2;
    }
}
