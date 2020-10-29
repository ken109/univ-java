package kadai.kadai5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kadai5_4 {
    public static void main(String[] args) {
        List<Integer> list = getList("src/05list.txt");

        Collections.sort(list);

        writeList("src/05out.txt", list);
    }

    private static List<Integer> getList(String filename) {
        File file = new File(filename);
        List<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String str;
            while ((str = reader.readLine()) != null) {
                list.add(Integer.parseInt(str));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void writeList(String filename, List<Integer> list) {
        File file = new File(filename);
        try (FileWriter writer = new FileWriter(file)) {
            for (Integer value : list) {
                writer.write(value.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
