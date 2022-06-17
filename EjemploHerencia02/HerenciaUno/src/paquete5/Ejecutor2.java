package paquete5;

import java.util.Scanner;

public class Ejecutor2 {
    
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        String nom, ape, ide;
        int numCreditos, edad;
        double costoCredito;
        
        System.out.print("Ingrese su nombre:");        
        nom = sc.nextLine();
        
        System.out.print("Ingrese su apellido:");        
        ape = sc.nextLine();
        
        System.out.print("Ingrese su identificacion:");        
        ide = sc.nextLine();
              
        System.out.print("Ingrese su edad:");        
        edad = sc.nextInt();
        
        System.out.print("Ingrese numero de creditos:");        
        numCreditos = sc.nextInt();
        
        System.out.print("Ingrese el costo de sus creditos:");        
        costoCredito = sc.nextDouble();
        
        EstudiantePresencial estu1 = new EstudiantePresencial(nom, ape, ide, 
                edad, numCreditos, costoCredito);
        
        estu1.calcularMatriculaPresencial();
        
        System.out.println("\n" + estu1);
    }

}
