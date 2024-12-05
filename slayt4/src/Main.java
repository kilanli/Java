import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mes="Welcome to Java";
        System.out.println(mes);
        System.out.println(mes.trim());
        String string = " 004 -034556 ";
        String [] parts = string . split ("-");
        String part1 = parts [0];
        String part2 = parts [1];
        System.out.println(part1);
        System.out.println(part2);
    }
}