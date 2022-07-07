package de.dagere.peass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExampleTest {

    @Test
    public void test() {
        final Callee exampleClazz = new Callee();
        exampleClazz.method1();
    }

}
