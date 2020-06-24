import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("task.txt"))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(line);
                StringBuilder stringBuilderCopy = new StringBuilder(line);
                String stringReverse = stringBuilder.reverse().toString();
                String string = stringBuilderCopy.toString();
                if (stringReverse.equals(string)) {
                    arrayList.add(string);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter writer = new FileWriter("text.txt")) {
            for (String item : arrayList) {
                writer.write(item + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
