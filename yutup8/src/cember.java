import java.awt.*;

public class cember {
    int x,y;
    int yaricap;
    public cember(int x, int y, int yaricap) {
        super();
        this.x = x;
        this.y = y;
        this.yaricap = yaricap;
    }

    public void ekranCiz(Graphics g)
    {
        g.drawOval(x,y,yaricap,yaricap);
    }

    public void genisle(int i)
    {
        x=x-(i/2);
        y-=i/2;
        yaricap+=i;
    }
}
