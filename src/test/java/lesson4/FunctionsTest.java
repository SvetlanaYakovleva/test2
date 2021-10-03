package lesson4;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;

import static lesson4.Functions.checkFunc;
import static lesson4.Functions.isNumberEven;


public class FunctionsTest {
    private static Logger Logger = LoggerFactory.getLogger(FunctionsTest.class);
    @BeforeAll
    static void beforeAll() {
        System.out.println("Метод выполнился перед всеми тестами");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Метод выполняется перед каждым тестам");
    }


    @Test
    @DisplayName("Четное число передали в метод is.....")
    @Disabled
    void testGivenEvenNumberWhenCheckIsEvenThenTrue() {
        boolean result = isNumberEven(2);
        Assertions.assertTrue(result);

    }

    @Test
    @DisplayName("Тестируем функцию расчета плозщади треугольника.....")
    @Disabled
    void testSquareTriangle() {
        boolean result = checkFunc(2,3,-10);
        Assertions.assertTrue(result);

    }

    @AfterEach
    void afterEach() {
        System.out.println("Метод выполняется после каждого теста");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Метод выполнится после всех тестов класса");
    }



}
