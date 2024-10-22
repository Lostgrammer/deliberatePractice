package com.carlosvega.learnJava.fitnessProject;
//crear una interfaz generica es como crear una clase
@FunctionalInterface
public interface Calculator <T extends Number>{
    //metodo abstracto
    public double calculateFees(T clubId);
}
