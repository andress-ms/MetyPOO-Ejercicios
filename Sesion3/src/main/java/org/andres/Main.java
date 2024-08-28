package org.andres;

import models.Curso;
import models.Profesor;

public class Main {
    public static void main(String[] args) {
        System.out.println("*".repeat(13));
        Curso curso = new Curso("Metodologia y POO");
        Profesor duran = new Profesor("Jose Duran");
        duran.enseñar(curso);

    }
}