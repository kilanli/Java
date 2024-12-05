import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] myArray=new double[10];
        System.out.println(myArray.length);
        String[] seasons={"Spring","Summer","Autumn","Winter"};
        System.out.println(seasons[2]);
        System.out.println(myArray.toString());
        System.out.println(seasons.toString());
        double[] scores=new double[5];
        for (int i=0;i<5;i++)
        {
            System.out.printf("scores[%d] =%.2f%n",i,scores[i]);
        }
        int[] list={1,3,4,6};
        System.out.println(Arrays.toString(list));
        int[] source={1,3,4,6,8};
        int[] target=Arrays.copyOf(source,source.length);
        System.out.println(Arrays.toString(target));

    }
}