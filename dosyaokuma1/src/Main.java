import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\aferd\\OneDrive\\Masaüstü\\imdb_top_250 (1).csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;

        while ((line = bufferedReader.readLine()) != null) {

            // Process each line of the CSV file here
            System.out.println(line.split(";",7));
        }

        bufferedReader.close();
        fileReader.close();
    }
}