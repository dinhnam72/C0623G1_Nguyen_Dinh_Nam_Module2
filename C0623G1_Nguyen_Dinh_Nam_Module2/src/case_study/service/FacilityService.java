package case_study.service;

import case_study.common.*;
import case_study.model.furama.Furama;
import case_study.model.furama.House;
import case_study.model.furama.Room;
import case_study.model.furama.Villa;
import case_study.repository.FacilityRepository;
import case_study.repository.interface_repo.IFacilityRepository;
import case_study.service.interface_service.IFacilityService;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        for (Map.Entry<Furama, Integer> entry : facilityRepository.getAll().entrySet()) {
            System.out.println(entry.getKey() + " - Number of uses = " + entry.getValue());
        }
    }

    Scanner scanner = new Scanner(System.in);
    boolean flag;

    @Override
    public void addVilla() {
        String id;
        do {
            flag = false;
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (facilityRepository.checkId(id) != null) {
                System.out.println("Duplicate id");
                flag = true;
                continue;
            }
            if (ValidateVilla.inputAndCheckIdVilla(id)) {
                System.out.println("Villa ID must be in the correct format:NV-YYYY (Y :0-9)");
                flag = true;
            }
        } while (flag);
        String name = ValidateFurama.inputAndCheckName();
        double area = ValidateFurama.inputAndCheckArea();
        int costs = ValidateFurama.inputAndCheckCosts();
        int maxPerson = ValidateFurama.inputAndCheckMaxPerson();
        String type = ValidateFurama.inputAndCheckType();
        String standard = ValidateVilla.inputAndCheckStandard();
        double swwimmingArea = ValidateVilla.inputAndCheckSwimmingArea();
        int floor = ValidateVilla.inputAndCheckFloor();
        Villa villa1 = new Villa(id, name, area, costs, maxPerson, type, standard, swwimmingArea, floor);
        facilityRepository.add(villa1);
    }

    @Override
    public void addHouse() {
        String id;
        do {
            flag = false;
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (facilityRepository.checkId(id) != null) {
                System.out.println("Duplicate id");
                flag = true;
                continue;
            }
            if (ValidateHouse.inputAndCheckIdHouse(id)) {
                System.out.println("House ID must be in the correct format:NV-YYYY (Y :0-9)");
                flag = true;
            }
        } while (flag);
        String name = ValidateFurama.inputAndCheckName();
        double area = ValidateFurama.inputAndCheckArea();
        int costs = ValidateFurama.inputAndCheckCosts();
        int maxPerson = ValidateFurama.inputAndCheckMaxPerson();
        String type = ValidateFurama.inputAndCheckType();
        String standard = ValidateHouse.inputAndCheckStandard();
        int floor = ValidateHouse.inputAndCheckFloor();
        House house1 = new House(id, name, area, costs, maxPerson, type, standard, floor);
        facilityRepository.add(house1);
    }

    @Override
    public void addRoom() {
        String id;
        do {
            flag = false;
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (facilityRepository.checkId(id) != null) {
                System.out.println("Duplicate id");
                flag = true;
                continue;
            }
            if (ValidateRoom.inputAndCheckIdRoom(id)) {
                System.out.println("House ID must be in the correct format:NV-YYYY (Y :0-9)");
                flag = true;
            }
        } while (flag);
        String name = ValidateFurama.inputAndCheckName();
        double area = ValidateFurama.inputAndCheckArea();
        int costs = ValidateFurama.inputAndCheckCosts();
        int maxPerson = ValidateFurama.inputAndCheckMaxPerson();
        String type = ValidateFurama.inputAndCheckType();
        String freeService = ValidateRoom.inputFreeService();
        Room room1 = new Room(id, name, area, costs, maxPerson, type, freeService);
        facilityRepository.add(room1);
    }

    @Override
    public void facilityMaintenance() {
        Map<Furama, Integer> facilityMaintenance = facilityRepository.facilityMaintenance();
        if (facilityMaintenance.size() == 0) {
            System.out.println("There are no facilitys in need of maintenance");
        } else {
            for (Map.Entry<Furama, Integer> entry : facilityMaintenance.entrySet()) {
                System.out.println(entry.getKey() + " - Value = " + entry.getValue());
            }
        }
    }

    @Override
    public void remove() {
        String id;
        do {
            flag = false;
            System.out.print("Input id: ");
            id = scanner.nextLine();
            if (facilityRepository.checkId(id) == null) {
                System.out.println("Id does not exist");
                flag = true;
            } else {
                facilityRepository.remove(facilityRepository.checkId(id));
            }

        } while (flag);

    }
}
