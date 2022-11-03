package de.dagere.peass;

public class Callee {

    protected String method1() {
        return innerMethod();
    }

    public static String innerMethod() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return  Station.getStation();
    }

}
