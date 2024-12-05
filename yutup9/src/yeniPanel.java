import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class yeniPanel extends JPanel implements ActionListener {


    Timer zaman;
    dortgen[] digerDortgen;
    Random random=new Random();
    int adim,eleman=5;
    public yeniPanel()
    {
        super();
        zaman=new Timer(40,this);
        zaman.start();

        digerDortgen=new dortgen[5];
        digerDortgen[0]=new dortgen(10,20,20,20,random.nextInt(10),random.nextInt(10));
        digerDortgen[1]=new dortgen(100,20,20,20,random.nextInt(10),random.nextInt(10));
        digerDortgen[2]=new dortgen(78,150,20,20,random.nextInt(10),random.nextInt(10));
        digerDortgen[3]=new dortgen(130,250,20,20,random.nextInt(10),random.nextInt(10));
        digerDortgen[4]=new dortgen(780,200,20,20,random.nextInt(10),random.nextInt(10));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i=0;i<eleman;i++)
            digerDortgen[i].ekranCiz(g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0;i<eleman;i++)
            digerDortgen[i].hareketEt(digerDortgen,eleman);
        repaint();
    }
}
