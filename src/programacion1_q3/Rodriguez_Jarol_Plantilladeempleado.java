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
public class Rodriguez_Jarol_Plantilladeempleado {
  
    public static void main(String[] args) {
      
       Scanner lea=new Scanner(System.in);
       System.out.println("Ingrese nombre del empleado: ");
       String nombreEmpleado=lea.next();
       System.out.println("Ingrese el apellido del empleado: ");
       String apellidoEmpleado=lea.next();
       System.out.println("Ingrese las horas de trabajo de mensuales del empleado: ");
       int horatrabajo=lea.nextInt();
       System.out.println("Ingrese la tarifa por hora de trabajo: ");
       int tarifaporhora=lea.nextInt();
       
       double salarioEmpleado=(horatrabajo * tarifaporhora)*5;
       
       System.out.println("""
                          **** Boletin del Empleado ****
                           NOmbre: """+ nombreEmpleado + 
               "\n Apellido: " + apellidoEmpleado + 
               "\n Horas de trabajo: " + horatrabajo + 
               "\n Tarifa por hora: " + tarifaporhora + 
               "\n Salario del Empleado mensual es: " + salarioEmpleado + " % ");
   
    }
    
    
}
