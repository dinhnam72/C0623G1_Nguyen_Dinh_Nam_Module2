package ss15_exception.service;

import ss15_exception.exception.IdNotFoundException;
import ss15_exception.exception.UniqueIDException;
import ss15_exception.model.Work;
import ss15_exception.repository.IWorkRepo;
import ss15_exception.repository.WorkRepo;

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
    boolean flag;
    @Override
    public void add() {
        String id="";

        do {
            flag =false;
                System.out.print("Nhap id: ");
                try {
                    id = scanner.nextLine();
                    if (workRepo.checkId(id) != -1) {
                        throw new UniqueIDException();
                    }
                } catch (UniqueIDException e){
                    System.out.println("Id da ton tai");
                    flag =true;
                }
        } while (flag);

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
        String id="";
        do {
            flag =false;
            System.out.print("Nhap id: ");
            try {
                id = scanner.nextLine();
                if (workRepo.checkId(id) == -1) {
                    throw new IdNotFoundException();
                }
            }catch (IdNotFoundException e){
                System.out.println("id khong ton tai");
                flag = true;
            }

        } while (flag);
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

    @Override
    public void sortToName() {
        List<Work> works = workRepo.sortToName();
        for (Work work : works) {
            System.out.println(work);
        }
    }

    @Override
    public void sortToMoney() {
        List<Work> works = workRepo.sortToMoney();
        for (Work work : works) {
            System.out.println(work);
        }
    }
}
