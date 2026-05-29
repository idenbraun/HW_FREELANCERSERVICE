package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testExample1() {
        VacationService service = new VacationService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;

        int result = service.calculate(income, expenses, threshold);
        assertEquals(3, result);
    }

    @Test
    public void testExample2() {
        VacationService service = new VacationService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;

        int result = service.calculate(income, expenses, threshold);
        assertEquals(2, result);
    }

    @Test
    public void testNoVacation() {
        VacationService service = new VacationService();
        int income = 5000;
        int expenses = 10000;
        int threshold = 50000;

        int result = service.calculate(income, expenses, threshold);
        assertEquals(0, result);
    }

}