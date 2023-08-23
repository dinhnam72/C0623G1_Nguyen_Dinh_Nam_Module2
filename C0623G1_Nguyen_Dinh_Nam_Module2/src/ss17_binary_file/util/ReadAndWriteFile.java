package ss17_binary_file.util;

import ss17_binary_file.model.Work;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Work> readFile(String path) {
        List<Work> workList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);

            workList = (List<Work>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return workList;
    }

    public static void writeFile(String path, List<Work> workList) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(workList);

        } catch (FileNotFoundException e) {
            System.out.println("Path not found!");
        } catch (IOException e) {
            System.out.println("Error content!");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
