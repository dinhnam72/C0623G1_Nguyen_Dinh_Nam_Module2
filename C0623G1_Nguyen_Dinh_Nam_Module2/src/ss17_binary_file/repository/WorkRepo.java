package ss17_binary_file.repository;




import ss17_binary_file.model.Work;
import ss17_binary_file.util.ReadAndWriteFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkRepo implements IWorkRepo {
    private final static String FILE_PATH = "D:\\Codegym\\module2_1" +
            "\\C0623G1_Nguyen_Dinh_Nam_Module2\\C0623G1_Nguyen_Dinh_Nam_Module2\\src\\ss17_binary_file\\data\\work.dat";
    @Override
    public List<Work> getAll() {
        List<Work> workList = ReadAndWriteFile.readFile(FILE_PATH);
        return workList;
    }

    @Override
    public int checkId(String id) {
        int index = getAll().indexOf(new Work(id));
        return index;
    }

    @Override
    public void add(Work work) {
        List<Work> workList = getAll();
        workList.add(work);
        ReadAndWriteFile.writeFile(FILE_PATH,workList);
    }

    @Override
    public void remove(String id) {
        List<Work> workList = getAll();
        workList.remove(checkId(id));
        ReadAndWriteFile.writeFile(FILE_PATH,workList);
    }

    @Override
    public void edit(String id, Work work) {
        List<Work> workList = getAll();
        workList.set(checkId(id), work);
        ReadAndWriteFile.writeFile(FILE_PATH, workList);
    }

    @Override
    public List<Work> searchToId(String id) {
        List<Work> works = getAll();
        List<Work> work = new ArrayList<>();
        int index = checkId(id);
        work.add(works.get(index));
        return work;
    }

    @Override
    public List<Work> searchToName(String name) {
        List<Work> works = getAll();
        List<Work> workToName = new ArrayList<>();
        for (Work work : works) {
            if (work.getName().contains(name)) {
                workToName.add(work);
            }
        }
        return workToName;
    }

    @Override
    public List<Work> sortToName() {
        List<Work> works = getAll();
        Collections.sort(
                works, new Comparator<Work>() {
                    @Override
                    public int compare(Work o1, Work o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                }
        );
        return works;
    }

    @Override
    public List<Work> sortToMoney() {
        List<Work> works = getAll();
        Collections.sort(works, new Comparator<Work>() {
            @Override
            public int compare(Work o1, Work o2) {
                if (o1.getMoney() == o2.getMoney()) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return (int) (o1.getMoney() - o2.getMoney());
                }
            }
        });
        return works;
    }
}
