package com.carlosvega.learnJava.fitnessProject;
//crear una interfaz generica es como crear una clase
public interface Calculator <T extends Number>{
    //metodo abstracto
    public void calculateFees(T clubId);
}
