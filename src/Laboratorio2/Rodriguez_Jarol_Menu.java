import java.util.Scanner;

public class Rodriguez_Jarol_Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menu de Ejercicios:");
            System.out.println("1. Ejercicio 1: Cadena");
            System.out.println("2. Ejercicio 2: Notas");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ejercicio1(scanner);
                    break;
                case 2:
                    ejercicio2(scanner);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
        System.out.println("¡Hasta luego!");
    }

    public static void ejercicio1(Scanner scanner) {
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        
        char maxCaracter = ' ';
        int maxConteo = 0;

        
        int i = 0;
        int longitudCadena = cadena.length();

        
        while (i < longitudCadena) {
            char caracterActual = cadena.charAt(i);
            int conteoActual = 0;
            int j = 0;

            
            while (j < longitudCadena) {
                if (cadena.charAt(j) == caracterActual) {
                    conteoActual++;
                }
                j++;
            }

            
            if (conteoActual > maxConteo) {
                maxCaracter = caracterActual;
                maxConteo = conteoActual;
            }

            i++;
        }

        
        System.out.println("El caracter que mas se repite es '" + maxCaracter + "' y se repite " + maxConteo + " veces.");
        System.out.println(); 
    }

    public static void ejercicio2(Scanner scanner) {
        
        int cantidadNotas = 0;
        double sumaNotas = 0;
        double notaMayor = Double.MIN_VALUE;
        double notaMenor = Double.MAX_VALUE;
        
        System.out.println("Ingrese las notas del alumno");
        
        while (true) {
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();  
            
            if (nota < 0 || nota > 100) {
                System.out.println(".");
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
        
    }
}

