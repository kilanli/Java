import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDenemesi extends JPanel implements ActionListener {
    JButton button1,button2;
    JLabel label1;
    int sayi=0;
    public ButtonDenemesi()
    {
        super();
        button1=new JButton("Arttır");
        button1.addActionListener(this);
        button2=new JButton("Azalt");
        button2.addActionListener(this);
        label1=new JLabel("0") ;
        add(button1);
        add(button2);
        add(label1);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Deneme Programı");
        ButtonDenemesi panel1 = new ButtonDenemesi();
        frame.add(panel1);

        frame.setSize(640,480);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Arttır"))
        {
            sayi++;
            label1.setText(sayi+"");
        } else if (e.getActionCommand().equals("Azalt")) {
            sayi--;
            label1.setText(sayi+"");
        }
    }
}
