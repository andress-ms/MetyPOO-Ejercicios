package org.andres;

import models.Curso;
import models.Departamento;
import models.Profesor;

public class Main {
    public static void main(String[] args) {
        System.out.println("*".repeat(13));
        Curso curso = new Curso("Metodologia y POO");
        Profesor duran = new Profesor("Jose Duran");
        duran.enseñar(curso);
        Departamento fia = new Departamento();
        fia.setNombre("FIA");
        Profesor noel = new Profesor("Noel Gavarrete");
        fia.agregarProfesor(noel);
        fia.agregarProfesor(duran);
        System.out.println(fia.getNombre());
        for(Profesor doc : fia.getProfesores()){
            System.out.println(doc.getNombre());
        }
    }
}
//Hacer generalizacion y composicion
