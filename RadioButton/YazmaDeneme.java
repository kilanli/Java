import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class YazmaDeneme {
    public YazmaDeneme() {

    }

    public static void main(String[] args) {
        try {
            FileWriter dosyaYazici=new FileWriter("D:\\Javaa\\RadioButton\\out\\production\\RadioButton\\yazma_deneme.txt");
            BufferedWriter dosyaOutput=new BufferedWriter(dosyaYazici);
            dosyaOutput.write("Bu bir denemedir\n");

            dosyaOutput.write("Yazi.");
            dosyaOutput.close();
            dosyaYazici.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
