public abstract class Ogr {
    private String isim;
    private int no;
    public Ogr(String isim,int no)
    {
        super();
        this.isim=isim;
        this.no=no;
    }
    public String getIsim()
    {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    public void adSoyle()
    {
        System.out.println("Adim:"+isim);
    }

    public void bil() {
    }

    public  void hesapla(){

    }
    public  abstract void bolumSoyle();

}
