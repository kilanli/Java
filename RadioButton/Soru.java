public class Soru {
    String soruMetni;
    String secenekA,secenekB,secenekC,secenekD;
      public   enum Cevap {CEVAP_A,CEVAP_B,CEVAP_C,CEVAP_D}
    Cevap dogruCevap;

    public Soru(String soruMetni, String secenekA, String secenekB, String secenekC, String secenekD, Cevap dogruCevap) {
        this.soruMetni = soruMetni;
        this.secenekA = secenekA;
        this.secenekB = secenekB;
        this.secenekC = secenekC;
        this.secenekD = secenekD;
        this.dogruCevap = dogruCevap;
    }
    boolean cevapKontrol(Cevap cevap)
    {
        if (dogruCevap==cevap)
            return  true;
        else
            return false;
    }
}
