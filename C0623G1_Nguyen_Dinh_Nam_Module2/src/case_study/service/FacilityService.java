package case_study.service;

import case_study.model.furama.Furama;
import case_study.repository.FacilityRepository;
import case_study.repository.interface_repo.IFacilityRepository;
import case_study.service.interface_service.IFacilityService;

import java.util.Map;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        for (Map.Entry<Furama, Integer> entry : facilityRepository.getAll().entrySet()) {
            System.out.println(entry.getKey() + " - Value = " + entry.getValue());
        }
    }

    @Override
    public void add() {

    }

    @Override
    public void facilityMaintenance() {

    }

    @Override
    public void remove() {

    }
}
