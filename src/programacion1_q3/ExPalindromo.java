/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion1_q3;
import java.util.Scanner;

/**
 *
 * @author jarol
 * Ingresar una palabra: Anna
 * Resultado: Es Palindromo.
 * Desea otra palabra a evaluar (si / no)?:si
 * Ingresar una palabra: David
 * Resultado: No es Palindromo.
 * Desea otra Palabra a evaluar (si / no)?:No Termina el programa 
 */
public class ExPalindromo {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
       String continuar= "";
        int inicio=0, Fin=0;
        String respuesta;
       do{
            System.out.println("Ingrese la Palabra: ");
            String palabra=lea.next().toLowerCase();
            String palabraIn="";
            int contador=palabra.length()-1;
            while (contador>=0){
                char letra=palabra.charAt(contador);
                palabraIn+=letra;
                contador--;
                
                
            }
            respuesta=(palabra.equals(palabra)?"Es Palidromo":"No es Palidromo");
            System.out.println("Respuesta es: "+respuesta);
           /* if(palabraIn.equals(palabra))
                System.out.println("Es Palidromo");
            System.out.println("No es Palidromo");
            */
            System.out.println("Desea otra palabra a evaluar(si / no)");
            continuar=lea.next();
            
        }while(!continuar.equalsIgnoreCase("NO"));
       
       
    }
}
