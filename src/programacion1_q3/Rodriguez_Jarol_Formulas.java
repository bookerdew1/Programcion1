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
public class Rodriguez_Jarol_Formulas {
   
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        System.out.println("Ejercicio A");
        System.out.println("Ingrese el primer numerador");
        int N1=lea.nextInt();
        System.out.println("Ingrese el primer Denominador");
        int D1=lea.nextInt();
        System.out.println("Ingrese el segundo numerador");
        int N2=lea.nextInt();
        System.out.println("Ingrese el segundo Denominador");
        int D2=lea.nextInt();
        
        double resultado = (N1/D1)+(N2/D2);
         System.out.println("Este es el resultado del primer ejercicio: "+ resultado);
        
// TODO code application logic here
    }
}
