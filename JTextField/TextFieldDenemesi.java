import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.MinguoEra;

public class TextFieldDenemesi extends JPanel implements ActionListener {
    JTextField textfield1;
    JButton button1;
    JLabel label1;
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        TextFieldDenemesi panel1=new TextFieldDenemesi();
        frame.add(panel1);
        frame.setVisible(true);
        frame.setSize(640,480);
    }
    public  TextFieldDenemesi()
    {
        super();
        label1=new JLabel();
        add(label1);
        textfield1=new JTextField(30);
        add(textfield1);
        button1=new JButton("Tamam");
        button1.addActionListener(this);
        add(button1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Tamam"))
        {
            label1.setText("Merhaba "+textfield1.getText()+" Nasılsınız ?");
            textfield1.setText("");
            textfield1.requestFocus();
        }
    }
}
