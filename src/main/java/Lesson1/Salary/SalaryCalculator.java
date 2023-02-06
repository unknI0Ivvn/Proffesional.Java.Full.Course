package Lesson1.Salary;

public class SalaryCalculator {
    private double baseSalary = 50_000; //всегда делать поля класса приватными тольк если знаю зачем они нужны то публичные
    private double yearlyIncrease = 20_000;
     //публичные вещи это конструктыры и поля класса
    //приватные вещи все поля класса или служебные никому не нужны за пределами
    // THIS название поля класса совпадает с параметром конструктора
    public SalaryCalculator(double baseSalary,double yearlyIncrease)
    {
        this.baseSalary=baseSalary; // THIS название поля класса совпадает с параметром конструктора
        this.yearlyIncrease=yearlyIncrease;
    }
    public double calculate(int year)
    {
        return baseSalary+year*yearlyIncrease;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getYearlyIncrease() {
        return yearlyIncrease;
    }
}

/*
- baseSalary: double = 50000
-yearlyIncrease:double = 20000
+SalaryCalculator(baseSalary:double,yearlyIncrease:double)
+calculate(years:int):double
 */
