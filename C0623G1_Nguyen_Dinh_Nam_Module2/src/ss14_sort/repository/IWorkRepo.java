package ss13_search.repository;

import ss13_search.model.Work;

import java.util.List;

public interface IWorkRepo {
    List<Work> getAll();

    int checkId(String id);

    void add(Work work);

    void remove(String id);

    void edit(String id, Work work);

    List<Work> searchToId(String id);

    List<Work> searchToName(String name);
}
