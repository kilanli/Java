import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame pencere=new JFrame("Program");
        pencere.add(new karePencere());
    //karePencere pencere=new karePencere();
    pencere.setSize(640,480);
    pencere.setVisible(true);
    }
}