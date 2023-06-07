package ru.geekbrains;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        WorkerFixed workerFixed = new WorkerFixed("Николай", 25, 2550);
//        workerFixed.CalcAvgSalary();
//        WorkerHourly workerHourly = new WorkerHourly("Петр", 35, 20);
//        workerHourly.CalcAvgSalary();
        List<Employee> workers = new ArrayList<Employee>();
        workers.add(new WorkerFixed("Николай", 55, 3050));
        workers.add(new WorkerFixed("Петр", 45, 2985));
        workers.add(new WorkerHourly("Сергей", 38, 4650));
        workers.add(new WorkerHourly("Владислав", 30, 3550));

        System.out.println(workers);

        }
    }