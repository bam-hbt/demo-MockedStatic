package de.dagere.peass;

public class Callee {

    protected String method1() {
        return innerMethod();
    }

    public static String innerMethod() {
           return  Station.getStation();
    }

}
