package ss17_binary_file.util;

import ss17_binary_file.model.Work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Work> readFile(String path) {
        List<Work> workList = new ArrayList<>();
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {

            workList = (List<Work>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
        return workList;
    }
    public static void writeFile(String path, List<Work> workList) {
        try (
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {

            oos.writeObject(workList);

        } catch (FileNotFoundException e) {
            System.out.println("Path not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        }

    }
}
