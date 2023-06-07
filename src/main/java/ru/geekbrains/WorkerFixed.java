package ru.geekbrains;

public class WorkerFixed extends Employee{
    double fixedRate;

    public WorkerFixed(String name, int age, double fixedRate) {
        super(name, age);
        this.fixedRate = fixedRate;
    }

    public int getFixedRate() {
        return (int) fixedRate;
    }

    public void setFixedRate(int fixedRate) {
        this.fixedRate = fixedRate;
    }

    @Override
    void CalcAvgSalary() {
        System.out.printf("%s, %s лет от роду, зарабатывает в среднем $%s в месяц\n", name, age, fixedRate);
    }

}

