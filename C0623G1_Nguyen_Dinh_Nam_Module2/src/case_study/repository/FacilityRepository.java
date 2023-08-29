package case_study.repository;

import case_study.model.furama.Furama;
import case_study.model.furama.House;
import case_study.model.furama.Room;
import case_study.model.furama.Villa;
import case_study.repository.interface_repo.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FacilityRepository implements IFacilityRepository {
    private static Map<Furama, Integer> furamaList = new LinkedHashMap();

    static {
        Villa villa = new Villa("SVVL-0001", "Dads", 100, 4000000, 15, "D", "3 sao", 100, 3);
        House house = new House("SVHO-0001", "Lsdfds", 80, 120000, 10, "M", "2 sao", 3);
        Room room = new Room("SVRO-0001", "Msdfdsf", 30, 120000, 3, "Y", "Ldfsd");
        furamaList.put(villa, 4);
        furamaList.put(house, 7);
        furamaList.put(room, 6);
    }

    @Override
    public Map<Furama, Integer> getAll() {
        return furamaList;
    }

    @Override
    public Furama checkId(String id) {
        for (Furama furama : this.getAll().keySet()) {
            if (furama.getId().equals(id)) {
                return furama;
            }
        }
        return null;
    }

    @Override
    public void add(Furama furama) {
        this.getAll().put(furama, 0);
    }

    @Override
    public Map<Furama, Integer> facilityMaintenance() {
        Map<Furama, Integer> facilityMaintenance = new LinkedHashMap<>();
        for (Map.Entry<Furama, Integer> entry : this.getAll().entrySet()) {
            if (entry.getValue() >= 5) {
                facilityMaintenance.put(entry.getKey(), entry.getValue());
            }
        }
        return facilityMaintenance;
    }

    @Override
    public void remove(Furama furama) {
        this.getAll().remove(furama);
    }
}
