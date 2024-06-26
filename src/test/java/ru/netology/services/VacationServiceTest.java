package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/Vacation.csv")

    public void oneVersion(int expected, int income, int expenses, int threshold) {


        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
