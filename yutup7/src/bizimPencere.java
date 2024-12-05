import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class bizimPencere extends JFrame implements MouseListener, KeyListener {
    private Random rnd;
    private int x1,x2,y1,y2;

    private String yazi;
    public bizimPencere()
    {
        super();
        rnd=new Random();
        x1=0;x2=0;y1=0;y2=0;
        yazi="Merhaba";
    }


    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(x1,y1,x2,y2);
        addMouseListener(this);
        g.drawString(yazi,50,50);
        addKeyListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == e.BUTTON1) {
            x1 = e.getX();
            y1 = e.getY();
        } else if (e.getButton() == e.BUTTON3) {
            x2 = e.getX();
            y2 = e.getY();
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {//fareye her basıldığında çağrılır

    }

    @Override
    public void mouseReleased(MouseEvent e) {// fare tuşu her bırakıldığında çağrılır

    }

    @Override
    public void mouseEntered(MouseEvent e) { //

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {// tuş tipine göre

    }

    @Override
    public void keyPressed(KeyEvent e) {//tuşa basıldığında
        yazi=yazi+e.getKeyChar();
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {//tuş bırakıldığında

    }
}

