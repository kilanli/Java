public class FenOgr extends Ogr{
    public FenOgr(String isim,int no)
    {
        super(isim,no);
    }
    public void bil()
    {
        System.out.println("Bildim");
    }

    @Override
    public void bolumSoyle() {
        System.out.println("Benim bolumum Fen");
    }
}
