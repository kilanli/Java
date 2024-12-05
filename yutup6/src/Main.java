public class Main {
    public static void main(String[] args) {
        Ogr o1=new FenOgr("Ümit",4651);
        Ogr o2=new MatOgr("Kemal",561688);
        o1.adSoyle();
        o2.adSoyle();
        ((MatOgr) o2).bilgiyaz();
    }

}