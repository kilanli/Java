import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int A=10,B=20;
        update(A,B);
        System.out.println(A+" "+B);
    }
    public static void update(int X,int Y)

    {
        X=X+Y;
        Y=Y+X;
        System.out.println(X+" "+Y);
    }
}