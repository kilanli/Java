import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame pencere=new JFrame();
        yeniPanel panel=new yeniPanel();
        pencere.add(panel);
        pencere.setVisible(true);
        pencere.setSize(480,640);
    }
}