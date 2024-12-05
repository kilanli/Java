import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    String file="C:\\Users\\aferd\\OneDrive\\Masaüstü\\imdb_top_250 (1).csv";    //dosyayı file da tutuyoruz
    BufferedReader reader=null;         //
    String line=""; //reading each line
    try{
       reader=new BufferedReader(new FileReader(file));             // değişkende reader ı örnekliyoruz

        while ((line=reader.readLine())!=null)    //null ile karşılaşmadığımız müddetçe dosyayı okuyoruz
        {
            String[] row=line.split(";");    // satırları nokatı virgül olan yerden bölüyoruz ve bir diziye atıyoruz
            for (String index:row) {

                System.out.printf("%-10s    ",index);
            }
            System.out.println();
        }
    }catch (Exception e)
    {
        e.printStackTrace();            //neyin yanlış olduğunu bildiriyor
     }
    finally {
            reader.close();
    }







    }
}