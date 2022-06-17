
package paquete8;


public class Ejecutor2 {
    
    public static void main(String[] args) {
        
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;
        int numAsignaturas = 5;
        double costoAsig = 50.5;
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numAsignaturas, costoAsig);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
        
    }
    
}
