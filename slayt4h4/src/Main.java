public class Main {
    public static void main(String[] args) {
        String s1="Erciyes:Universitesi-Muhendislik:Fakultesi";
        /*
        String[] parts=s1.split("-");
        for (String part:parts)
            System.out.println(part);   */
        System.out.println(s1.replace('-','+'));
        int i=10;
        String x=String.valueOf(i);
        String y=Integer.toString(i);
        String s="in 1991 Oak released \t in 1996 it is renamed as java,Java JDK 1.0 released in 1996";
        System.out.println(s.replaceAll("in","at"));
        System.out.println(s.replaceAll("[jJ]ava","X"));
        
    }
}