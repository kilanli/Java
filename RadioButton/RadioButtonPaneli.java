import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonPaneli extends JPanel implements ActionListener {
        JRadioButton rbutton1,rbutton2,rbutton3,rbutton4; JLabel label1; JButton buton1;
        ButtonGroup grup1;
        String s;
        RadioButtonPaneli()
        {

            grup1=new ButtonGroup();
            label1=new JLabel("Sınıfınızı seçin:");
            rbutton1=new JRadioButton("1.Sınıf");
            rbutton2=new JRadioButton("2.Sınıf");
             rbutton3=new JRadioButton("3.Sınıf");
             rbutton4=new JRadioButton("4.Sınıf");
            add(label1);
            grup1.add(rbutton1);
            grup1.add(rbutton2);
            grup1.add(rbutton3);
            grup1.add(rbutton4);
            add(rbutton1);
            add(rbutton2);
            add(rbutton3);
            add(rbutton4);
            buton1=new JButton("Sınıfı seç");
            buton1.addActionListener(this);
            add(buton1);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
            String s="Seçilen sınıf ";
            if (rbutton1.isSelected())
            {
                s+=rbutton1.getText();
            } else if (rbutton2.isSelected()) {
                s+=rbutton2.getText();
            }
            else if (rbutton3.isSelected()) {
                s+=rbutton3.getText();
            }
            else if (rbutton4.isSelected()) {
                s+=rbutton4.getText();
            }
            else
                s="Lütfen sınıf seçiniz";
            JOptionPane.showMessageDialog(this,s);
    }

}


