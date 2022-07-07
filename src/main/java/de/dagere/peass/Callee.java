package de.dagere.peass;

public class Callee {

    protected void method1() {
        innerMethod();
    }

    private void innerMethod() {
        try {
            Thread.sleep(30);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
        String[] array = new String[100000 * 100000];
    }

}
