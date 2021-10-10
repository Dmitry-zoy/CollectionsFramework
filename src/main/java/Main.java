import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main (String args[]) throws FileNotFoundException, IOException {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String words = "Страд";
        System.out.println("Количество слов страдание(-ия, -ий) составляет:");
        FileReader fileReader = new FileReader("voyna-1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = bufferedReader.readLine();
        int count = 0;
        while (line != null) {
            String []parts = line.split(" ");
            for (String w : parts) {
                count++;
            }

            line = bufferedReader.readLine();
        }
        System.out.println(count);
    }
}