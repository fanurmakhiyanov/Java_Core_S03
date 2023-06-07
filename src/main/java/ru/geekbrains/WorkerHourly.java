package ru.geekbrains;

public class WorkerHourly extends Employee{
    double hourlyRate;

    public WorkerHourly(String name, int age, double hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    void CalcAvgSalary() {
        double salary = 20.8 * 8 * hourlyRate;
        System.out.printf("%s, %s лет от роду, зарабатывает в среднем $%s в месяц\n", name, age, salary);
    }

}