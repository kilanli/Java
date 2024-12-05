import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class karePencere extends JPanel implements ActionListener, MouseListener {
    int x,y;
    int yuk,gen;
    int artisMiktari=3;
    cember[] cemberler;
    int cemberAdet=0,cemberMax=10,cemberEleman=0;
    Timer zaman;
    public karePencere()
    {
        super();
        addMouseListener(this);
        cemberler=new cember[cemberMax];
         zaman=new Timer(140,this);
        zaman.start();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for (int i=0;i<cemberEleman;i++)
        {
            cemberler[i].ekranCiz(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i=0;i<cemberEleman;i++)
        {
            cemberler[i].genisle(artisMiktari);
        }
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

            cember yeniCember = new cember(e.getX(), e.getY(), 0);
            cemberler[cemberAdet] = yeniCember;
            cemberAdet=(cemberAdet+1)%cemberMax;
        if (cemberEleman<cemberMax)
        {
            cemberEleman++;
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    zaman.start();
    }

    @Override
    public void mouseExited(MouseEvent e) {
zaman.stop();
    }
}
