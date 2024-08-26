package notauam;

import modelos.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\u001B[36m");
        System.out.println("UAM");
        //Crear un objeto
        Estudiante est = new Estudiante();
        String cif, nombres, apellidos, asignatura;
        int nota1, nota2, nota3, nf;
        Scanner sc = new Scanner(System.in);
        System.out.print("CIF: ");
        cif = sc.nextLine();
        System.out.print("NOMBRES: ");
        nombres = sc.nextLine();
        System.out.print("APELLIDOS: ");
        apellidos = sc.nextLine();
        System.out.print("ASIGNATURA: ");
        asignatura = sc.nextLine();
        System.out.print("CORTE 1: ");
        nota1 = Integer.parseInt(sc.nextLine());
        System.out.print("CORTE 2: ");
        nota2 = Integer.parseInt(sc.nextLine());
        System.out.print("CORTE 3: ");
        nota3 = Integer.parseInt(sc.nextLine());
        est.setNombre(nombres);
        est.setApellido(apellidos);
        est.setAsignatura(asignatura);
        est.setPrimerCorte(nota1);
        est.setSegundoCorte(nota2);
        est.setTercerCorte(nota3);
        nf = est.obtNotaFinal();
        System.out.println("Nota Final: " + nf);
        System.out.println(est.evalNotaFinal());
        System.out.println(est.evalConvocatoria());
        

    }
}
