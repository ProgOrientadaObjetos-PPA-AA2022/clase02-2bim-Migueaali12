package paquete6;

import java.util.Scanner;

public class Ejecutor2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String nom, ape, ide;
        int numCreditos, edad;
        double costoCredito;
        String cadenita = "";

        int difusor = 1;

        do {

            System.out.println("Ingrese el nombre del estudiante: ");
            nom = sc.nextLine();

            System.out.println("Ingrese su apellido:");
            ape = sc.nextLine();

            System.out.println("Ingrese su identificacion:");
            ide = sc.nextLine();

            System.out.println("Ingrese su edad:");
            edad = sc.nextInt();

            System.out.println("Ingrese numero de creditos:");
            numCreditos = sc.nextInt();

            System.out.println("Ingrese el costo de sus creditos:");
            costoCredito = sc.nextDouble();
            
            System.out.println("Desea ingresar mas estudiantes 0 = si 1 = no:");
            difusor = sc.nextInt();
            
            sc.nextLine();

            paquete5.EstudiantePresencial estu1 = new 
            paquete5.EstudiantePresencial(nom, ape, ide, edad, 
                    numCreditos, costoCredito);

            estu1.calcularMatriculaPresencial();            
            
            cadenita = String.format("%s%s\n", cadenita, estu1.toString());

        } while (difusor != 0);

        System.out.printf("%s\n", cadenita);

    }

}
