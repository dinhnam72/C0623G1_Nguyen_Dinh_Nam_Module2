package case_study.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RAWFile {
    public static List<String> readToCSV(String filePath) {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }

    public static void writeFromCSV(List<String> stringList, String filePath, boolean append) {
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
