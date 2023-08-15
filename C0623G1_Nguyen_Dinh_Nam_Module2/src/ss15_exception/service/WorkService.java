package ss14_sort.service;

import ss14_sort.model.Work;
import ss14_sort.repository.IWorkRepo;
import ss14_sort.repository.WorkRepo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class WorkService implements IWorkService {
    private static IWorkRepo workRepo = new WorkRepo();

    @Override
    public void display() {
        for (Work congViec : workRepo.getAll()) {
            System.out.println(congViec);
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
        Work workflowManagement = new Work(id, name, date, money, describe);
        workRepo.add(workflowManagement);
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
        List<Work> workList = workRepo.searchToId(id);
        for (Work work : workList) {
            System.out.println(work);
        }

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

    @Override
    public void sortToName() {
        List<Work> works = workRepo.sortToName();
        for (Work work:works){
            System.out.println(work);
        }
    }

    @Override
    public void sortToMoney() {
        List<Work> works = workRepo.sortToMoney();
        for (Work work:works){
            System.out.println(work);
        }
    }
}
