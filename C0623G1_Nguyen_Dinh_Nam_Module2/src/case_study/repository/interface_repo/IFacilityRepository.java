package case_study.repository.interface_repo;

import case_study.model.furama.Furama;

import java.util.Map;

public interface IFacilityRepository {
        Map<Furama,Integer> getAll();
        void add(Furama furama);
        void remove(String id);
}
