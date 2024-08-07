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
        int opcion=0;
        
        switch(opcion){ 
            case 1:   
                 System.out.println("**** Menu ****"
        +"\n -tabla \n2 - desconocido \n- salir\n\nEscoja una opcion: ");
       
                 opcion=lea.nextInt();
       
        int contador=0, resultado=0, suma=0,limite=lea.nextInt();
        
       // limite=lea.nextInt();
        
       /* while(contador<limite){
            contador=contador+1;//contador+=1,contador++
            //  2       1*2
            resultado=contador*tabla;
            //ResTotal= resultado + resultado;
            System.out.println(tabla+ " x "+contador+" = "+resultado);
            suma+=resultado;
        }
        System.out.println("Suma total: "+suma); */
       
       //Do whiele 
    
    do{
        contador++;
        resultado=tabla*contador;
        System.out.println(tabla+" x "+contador+" = "+resultado);
        
        
      while(opcione!= )
        }
        System.out.println("**** Menu ****"
        +"\n -tabla \n2 - desconocido \n- salir\n\nEscoja una opcion: ");
        opcion=lea.nextInt();
       
        int contador=0, resultado=0, suma=0,limite=lea.nextInt();
        
       // limite=lea.nextInt();
        
       /* while(contador<limite){
            contador=contador+1;//contador+=1,contador++
            //  2       1*2
            resultado=contador*tabla;
            //ResTotal= resultado + resultado;
            System.out.println(tabla+ " x "+contador+" = "+resultado);
            suma+=resultado;
        }
        System.out.println("Suma total: "+suma); */
       
       //Do whiele 
    
    do{
        contador++;
        resultado=tabla*contador;
        System.out.println(tabla+" x "+contador+" = "+resultado);
        
        while(opcione!=0 );
           
}while(contador<=limite);
    break;
            case 2:
                System.out.println("Ejercicio");
            default:
                System.out.println("");
} 
}

