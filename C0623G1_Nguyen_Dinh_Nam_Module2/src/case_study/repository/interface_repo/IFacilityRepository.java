package case_study.repository.interface_repo;

import case_study.model.furama.Furama;

import java.util.Map;

public interface IFacilityRepository {
        Map<Furama,Integer> getAll();
        Furama checkId(String id);
        void add(Furama furama);
        Map<Furama,Integer> facilityMaintenance();
        void remove(Furama furama);
}
