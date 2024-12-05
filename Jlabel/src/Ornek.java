import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ornek extends JFrame implements MouseListener {
    JLabel label1;
    JPanel panel1;
    JLabel label2;
    JLabel label3;
    int sayi;
    public Ornek()
    {
        super();
        panel1=new JPanel();
        label1=new JLabel("Hoşgeldiniz");
         label2=new JLabel("Merhaba");
         label3=new JLabel(sayi+"");

        panel1.add(label1);
        panel1.add(label2);
        panel1.add(label3);
        add(panel1);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    sayi++;
    label3.setText(""+sayi);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
