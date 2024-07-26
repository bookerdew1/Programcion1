import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNotas = 0;
        double sumaNotas = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;
        
        System.out.println("Ingrese las notas del alumno");
        
        while (true) {
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();  
            
            if (nota < 0 || nota > 100) {
                System.out.println("Nota fuera del rango permitido. Finalizando entrada de notas.");
                break;
            }
            
            sumaNotas += nota;
            cantidadNotas++;
            
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        
        if (cantidadNotas == 0) {
            System.out.println("No se ingresaron notas válidas.");
        } else {
            double promedio = sumaNotas / cantidadNotas;
            System.out.printf("El promedio de las notas es: %.2f\n", promedio);
            System.out.printf("La nota mayor es: %.2f\n", notaMayor);
            System.out.printf("La nota menor es: %.2f\n", notaMenor);
        }
        
        scanner.close();
    }
}
