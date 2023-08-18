package ss17_binary_file.repository;



import ss17_binary_file.model.Work;

import java.util.List;

public interface IWorkRepo {
    List<Work> getAll();

    int checkId(String id);

    void add(Work work);

    void remove(String id);

    void edit(String id, Work work);

    Work searchToId(String id);

    List<Work> searchToName(String name);
    List<Work> sortToName();
    List<Work> sortToMoney();
}
