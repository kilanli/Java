import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SoruDeneme extends JPanel implements ActionListener {
    JLabel soruMetni,skorLabel;
    JRadioButton cevapRadioA,cevapRadioB,cevapRadioC,cevapRadioD;
    JButton onayButton;
    ButtonGroup cevaplarGrup;
    Soru[] sorular=new Soru[5];
    int gecerliSoru=0;
    int skor=0,maxSoru=0;

    public SoruDeneme()
    {
        soruMetni=new JLabel();
        skorLabel=new JLabel("Skor->"+skor);
        cevapRadioA=new JRadioButton();
        cevapRadioB=new JRadioButton();
        cevapRadioC=new JRadioButton();
        cevapRadioD=new JRadioButton();
        onayButton=new JButton("Son Kararım!");
        cevaplarGrup=new ButtonGroup();
        cevaplarGrup.add(cevapRadioA);
        cevaplarGrup.add(cevapRadioB);
        cevaplarGrup.add(cevapRadioC);
        cevaplarGrup.add(cevapRadioD);
        onayButton.addActionListener(this);
        add(soruMetni);
        add(cevapRadioA);
        add(cevapRadioB);
        add(cevapRadioC);
        add(cevapRadioD);
        add(onayButton);
        add(skorLabel);
        soruOlustur();
        ekranaSoruYansit(gecerliSoru);
    }
    public void ekranaSoruYansit(int soruNo)
    {
        soruMetni.setText(sorular[soruNo].soruMetni);
        cevapRadioA.setText(sorular[soruNo].secenekA);
        cevapRadioB.setText(sorular[soruNo].secenekB);
        cevapRadioC.setText(sorular[soruNo].secenekC);
        cevapRadioD.setText(sorular[soruNo].secenekD);

    }
    public boolean cevapKontrol(Soru.Cevap verilenCevap)
    {
       return sorular[gecerliSoru].cevapKontrol(verilenCevap);
    }
    public void soruOlustur()
    {
        FileReader dosyaOkuyucu;
        BufferedReader okuyucu;
        try {
             dosyaOkuyucu=new FileReader("D:\\Javaa\\RadioButton\\out\\production\\RadioButton\\Yeni Text Document.txt");
             okuyucu=new BufferedReader(dosyaOkuyucu);
            String satir;

            while ((satir=okuyucu.readLine()) !=null)
            {
               String soruMetni=satir;
               String secenekA=okuyucu.readLine();
               String secenekB=okuyucu.readLine();
               String secenekC=okuyucu.readLine();
               String secenekD=okuyucu.readLine();
               String dogruCevapMetni=okuyucu.readLine();
               Soru.Cevap dogruCevap=null;
            if (dogruCevapMetni.equalsIgnoreCase("A"))
            {
                dogruCevap= Soru.Cevap.CEVAP_A;
            }
            else if (dogruCevapMetni.equalsIgnoreCase("B"))
                {
                    dogruCevap= Soru.Cevap.CEVAP_B;
                }
            else if (dogruCevapMetni.equalsIgnoreCase("C"))
            {
                dogruCevap= Soru.Cevap.CEVAP_C;
            }
             else   if (dogruCevapMetni.equalsIgnoreCase("D"))
                {
                    dogruCevap= Soru.Cevap.CEVAP_D;
                }
             if (dogruCevap!=null)
             {
                 sorular[maxSoru]=new Soru(soruMetni,secenekA,secenekB,secenekC,secenekD,dogruCevap);
                 maxSoru++;
             }
            }
            okuyucu.close();
            dosyaOkuyucu.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean cevap;
        if (cevapRadioA.isSelected())
        {
           cevap= cevapKontrol(Soru.Cevap.CEVAP_A);
           cevapRadioA.setSelected(false);
        } else if (cevapRadioB.isSelected())
        {
            cevap= cevapKontrol(Soru.Cevap.CEVAP_B);
            cevapRadioB.setSelected(false);

        }
        else if (cevapRadioC.isSelected())
        {
            cevap= cevapKontrol(Soru.Cevap.CEVAP_C);
            cevapRadioC.setSelected(false);

        }
        else if (cevapRadioD.isSelected())
        {
            cevap= cevapKontrol(Soru.Cevap.CEVAP_D);
            cevapRadioD.setSelected(false);

        }
        else
            cevap=false;
        if (cevap==true) {
            JOptionPane.showMessageDialog(this, "Dogru bildiniz");
            skor+=10;
            skorLabel.setText(""+skor);
        }
        else
            JOptionPane.showMessageDialog(this,"Yanlis cevap");
        gecerliSoru++;
        if (gecerliSoru<maxSoru)
        ekranaSoruYansit(gecerliSoru);
        else
            JOptionPane.showMessageDialog(this,"Oyun bitti , skorunuz->"+skor);
        cevaplarGrup.clearSelection();
    }


}
