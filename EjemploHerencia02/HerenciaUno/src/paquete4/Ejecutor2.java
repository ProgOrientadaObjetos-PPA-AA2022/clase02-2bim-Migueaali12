
package paquete4;

public class Ejecutor2 {
    
    public static void main(String[] args) {
        
        EstudiantePresencial estu1 = new EstudiantePresencial(
                "Miguel Alejandro","Alvarez Lima","222", 18 );
         
    
        
        estu1.establecerCostoCredito(200);
        estu1.establecerNumeroCreditos(14);
        estu1.calcularMatriculaPresencial();
        
        System.out.println(estu1);
        
    }
    
}
