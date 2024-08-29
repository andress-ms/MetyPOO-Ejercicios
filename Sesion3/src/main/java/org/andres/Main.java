package org.andres;

import models.Curso;
import models.Departamento;
import models.Profesor;
import models.Biblioteca;
import models.Perro;
import java.util.Scanner;

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
        for (Profesor doc : fia.getProfesores()) {
            System.out.println(doc.getNombre());
        }
        Biblioteca biblioteca = new Biblioteca();
        int cantidad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la cantidad de libros a ingresar: ");
        cantidad = sc.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%d. Digite el titulo del libro: ", i + 1);
            String libro = sc.next();
            biblioteca.agregarLibro(libro);
        }
        biblioteca.mostrarLibros();


        Perro perro = new Perro();
        perro.hacer_sonido();
    }
}
