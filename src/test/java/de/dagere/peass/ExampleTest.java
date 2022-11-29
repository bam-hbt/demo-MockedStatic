package de.dagere.peass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.parallel.ExecutionMode.SAME_THREAD;
import static org.mockito.Mockito.mockStatic;

@Execution(SAME_THREAD)
class ExampleTest {

    private static MockedStatic<Station> station;

    @BeforeAll
    static void initializeMocks() {
        station = mockStatic(Station.class);
    }

    @BeforeEach
    void init() {
        station.when(() -> Station.getStation()).thenReturn("MockedStation");
    }

    @Test
    void test() {
        final Callee exampleClazz = new Callee();
        String result = exampleClazz.method1();
        Assertions.assertEquals("MockedStation", result);
    }

    @Test
    void test2() {
        final Callee exampleClazz = new Callee();
        String result = exampleClazz.method1();
        Assertions.assertEquals("MockedStation", result);
    }

}
