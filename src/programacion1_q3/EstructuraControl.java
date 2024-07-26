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
public class EstructuraControl {
    public static void main(String[] args) {
        /*
        Tema: Estructura de Control (Loop)
        1- while
        2- dow...whiel
        3- for
        4-foreach
       
        Ex
        Table:
        2 x 1= 2
        2 x 12
        */
        Scanner lea=new Scanner(System.in);
        System.out.println("Ingrese la tabla: ");
        int tabla=lea.nextInt();
       
        System.out.println("Ingrese el limite: ");
       
        int contador=0, resultado=0, suma=0,limite=lea.nextInt();
        
       // limite=lea.nextInt();
        
        while(contador<limite){
            contador=contador+1;//contador+=1,contador++
            //  2       1*2
            resultado=contador*tabla;
            //ResTotal= resultado + resultado;
            System.out.println(tabla+ " x "+contador+" = "+resultado);
            suma+=resultado;
        }
        System.out.println("Suma total: "+suma);
    }
    
}
