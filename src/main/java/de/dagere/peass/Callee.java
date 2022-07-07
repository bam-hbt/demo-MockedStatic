package de.dagere.peass;

public class Callee {

    protected void method1() {
        innerMethod();
    }

    private void innerMethod() {
        String[] array = new String[100000 * 100000];
    }

}
