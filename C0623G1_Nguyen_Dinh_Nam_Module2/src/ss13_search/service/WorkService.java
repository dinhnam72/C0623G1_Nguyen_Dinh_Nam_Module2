package ss13_search.service;

import ss13_search.controller.WorkController;
import ss13_search.model.Work;
import ss13_search.repository.IWorkRepo;
import ss13_search.repository.WorkRepo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class WorkService implements IWorkService {
    private static IWorkRepo workRepo = new WorkRepo();

    @Override
    public void display() {
        for (Work work : workRepo.getAll()) {
            System.out.println(work);
        }
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        String id;
        do {
            System.out.print("Nhap id: ");
            id = scanner.nextLine();
            if (workRepo.checkId(id) != -1) {
                System.out.println("Id da ton tai");
            }
        } while (workRepo.checkId(id) != -1);

        System.out.print("Nhap name: ");
        String name = scanner.nextLine();
        System.out.print("Nhap date: ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Nhap money: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap describe: ");
        String describe = scanner.nextLine();
        Work work = new Work(id, name, date, money, describe);
        workRepo.add(work);
    }


    @Override
    public void remove() {
        String id;
        do {
            System.out.print("Nhap id: ");
            id = scanner.nextLine();
            if (workRepo.checkId(id) == -1) {
                System.out.println("Id khong ton tai");
            }
        } while (workRepo.checkId(id) == -1);
        workRepo.remove(id);
    }

    @Override
    public void edit() {
        String id;
        do {
            System.out.print("Nhap id: ");
            id = scanner.nextLine();
            if (workRepo.checkId(id) == -1) {
                System.out.println("Id khong ton tai");
            }
        } while (workRepo.checkId(id) == -1);
        System.out.print("Nhap name: ");
        String name = scanner.nextLine();
        System.out.print("Nhap date: ");
        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.print("Nhap money: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap describe: ");
        String describe = scanner.nextLine();
        Work work = new Work(id, name, date, money, describe);
        workRepo.edit(id, work);
    }

    @Override
    public void searchToId() {
        String id;
        do {
            System.out.print("Nhap id: ");
            id = scanner.nextLine();
            if (workRepo.checkId(id) == -1) {
                System.out.println("Id khong ton tai");
            }
        } while (workRepo.checkId(id) == -1);
        System.out.println(workRepo.searchToId(id));

    }

    @Override
    public void searchToName() {
        System.out.print("Nhap name: ");
        String name = scanner.nextLine();
        List<Work> workToName = workRepo.searchToName(name);
        if (workToName.size() == 0) {
            System.out.println("Khong ton tai cong viec nao");
        } else {
            for (Work work : workToName) {
                System.out.println(work);
            }
        }
    }
}
