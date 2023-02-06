package Lesson1.Salary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JapaneseSalaryTests {

    @Test
    public void testSalary()
    {
        assertEquals(650000,
                JapaneseSalary.calculateSalary(50000,20000,30),
                0.001
        );
    }
    //Напишите новую функцию которая проверить правильность вычисления зарплаты в классе
    //SalaryCalculator
@Test
public void testSalaryCalculator()
{
    SalaryCalculator calculator = new SalaryCalculator(50000,20000);
    assertEquals(
            650000,
            calculator.calculate(30),
            0.001
    );
}
}
