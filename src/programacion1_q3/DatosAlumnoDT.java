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
public class DatosAlumnoDT {
     public static void main(String[] args) {
         String resultado="Nota Invalida";
         Scanner lea=new Scanner(System.in);
         System.out.println("Ingrese numero de cuenta: ");
         int cuentaAlumno=lea.nextInt();
         System.out.println("Ingrese nombre alumno: ");
         String nombreAlumno=lea.next();
         System.out.println("Ingrese apellido alumno");
         String ApellidoAlumno=lea.next();
         System.out.println("Ingrese la nota final: ");
         double nota1=lea.nextDouble();
         System.out.println("Ingrese la nota final: ");
         double nota2=lea.nextDouble();
         
         double promedio=(nota1+nota2)/2;
          
         if(promedio>=0 && promedio<59.5){
              resultado="Insuficiente";
          }else if(promedio>=59.5 && promedio<=80){
              resultado="Notable";
          }else if(promedio>80 && promedio<=90){
                resultado="Muy Bueno";
          }else if(promedio>90 && promedio<=100){
                resultado="Exelente";
          }   
          System.out.println("""
                             **** Boleta De Aumno****
                              Numero de cuenta: """+cuentaAlumno+
                  "\n Alumno: "+nombreAlumno+" "+ApellidoAlumno+
                  "\n Promedio: "+promedio+" % - "+resultado);
    }
     
    
    
}
