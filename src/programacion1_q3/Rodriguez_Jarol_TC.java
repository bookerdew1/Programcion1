/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion1_q3;
import java.util.Scanner;

/**
 *
 * @author jarol
 */
public class Rodriguez_Jarol_TC {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        boolean salir = false;
         
        while (!salir) {
            System.out.println("Menu Ejercicios");
            System.out.println("1. Triangulos ");
            System.out.println("2. MCD y MCM");
            System.out.println("3. Numero Perfectos");
            System.out.println("4. Salir");
            System.out.println("Elije una opcion");
            int opcion = lea.nextInt();
            lea.nextLine();

            switch (opcion) {
                case 1:
                    ejercicio1(lea);
                    break;
                case 2:
                    ejercicio2(lea);
                    break;
                case 3:
                    ejercicio3(lea);
                    break;
                case 4:
                    salir = true;
                default:
                    System.out.println("Opcion no valida, intenta de nuevo.");
            }
        }
        System.out.println("Hasta luego!!");
         
    }
    public static void ejercicio1(Scanner lea) {
        double[] bases = new double[8];
        double[] alturas = new double[8];
        double[] areas = new double[8];

        
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese la base del triangulo " + (i + 1) + ":");
            bases[i] = lea.nextDouble();
            System.out.println("Ingrese la altura del triangulo " + (i + 1) + ":");
            alturas[i] = lea.nextDouble(); 

            areas[i] = (bases[i] * alturas[i]) / 2;
        }

        
        double mayorArea = areas[0];
        int indiceMayorArea = 0;
        for (int i = 1; i < 8; i++) {
            if (areas[i] > mayorArea) {
                mayorArea = areas[i];
                indiceMayorArea = i;
            }
        }

        
        System.out.println("La mayor area es " + mayorArea + " y fue encontrada en el triangulo " + (indiceMayorArea + 1) + ".");   
    }
    
    public static void ejercicio2(Scanner lea) {
       
        System.out.println("Ingrese el primer numero:");
        int numero1 = lea.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = lea.nextInt();

        
        int mcd = calcularMCD(numero1, numero2);

        
        int mcm = (numero1 * numero2) / mcd;

        
        System.out.println("El Maximo Comun Divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);
        System.out.println("El Minimo Comun Multiplo (MCM) de " + numero1 + " y " + numero2 + " es: " + mcm);
    }

    
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static void ejercicio3(Scanner lea) {
            
        // Leer el número desde la entrada del usuario
        System.out.println("Ingrese un numero:");
        int numero = lea.nextInt();

        // Calcular la suma de los divisores del número (excepto el mismo número)
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        // Verificar si la suma de los divisores es igual al número
        if (sumaDivisores == numero) {
            System.out.println(numero + " es un numero perfecto.");
        } else {
            System.out.println(numero + " no es un numero perfecto.");
        }
    }
}

    

    
    

