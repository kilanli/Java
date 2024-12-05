
public class Main {
    public static void main(String[] args) {
        System.out.println(encrypt("abcdefg"));
    }
    private static String encrypt(String s)
    {
        String result="";
        int len=s.length();
        int i=0,j=9;
        while (i<j) {
            if (i < 4){
                result += s.charAt(j % len);}
            if (i / 2 != 1){
                result += s.charAt(i % len);}
            i++;
            j--;
        }
        return result;
    }
}