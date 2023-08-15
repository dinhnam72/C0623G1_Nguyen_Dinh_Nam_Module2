package ss16_io_text_file.util;

import ss16_io_text_file.model.Work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<String> ReadFromCSV(String filePath){
        File file = new File(filePath);
        List<String> workList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                workList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return workList;
    }
    public static void WriteToCSV(List<String> strings, String filePath, boolean append){
        File file = new File(filePath);
        try (FileWriter fileWriter = new FileWriter(file,append);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ){
            for (String str: strings){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
