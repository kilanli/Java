import javax.swing.*;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxPaneli extends JPanel implements ActionListener {

    JCheckBox check1;
    JCheckBox check2;
    CheckBoxPaneli()
    {
        check1=new JCheckBox("Yurtta Kalıyor");
        add(check1);
         check2 = new JCheckBox("Burslu");
        add(check2);
        JButton button1=new JButton("Onayla");
        button1.addActionListener(this);
        add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = "Seçilen öğrenci ";
        if (check1.isSelected()) {
            s += "Yurtta kalıyor ";
        } else {
            s += "Yurtta kalmıyor ";
        }
        if (check2.isSelected()) {
            s += "Burslu öğrenci ";
        } else {
            s += "Burssuz öğrenci ";
        }
        JOptionPane.showMessageDialog(this, s);
    }
}
