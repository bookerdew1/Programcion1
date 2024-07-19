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
public class Rodriguez_Jarol_coutas {
   
    public static void main(String[] args) {
    Scanner lea=new Scanner(System.in);
    System.out.println("**** Coutas Mensuales **** ");
    System.out.println("Ingrese su prestamo");
    int monto=lea.nextInt();
    int plazo= 24;
    double interesmensual = 0.01;
    double comision = 10;
    double seguroporcentaje=0.005;
    
    double coutamensual = (monto / plazo)+ monto * interesmensual + comision + monto*seguroporcentaje;
    double totalApagar =  coutamensual * plazo;
    System.out.println("couta mensual: " + coutamensual + 
            "\n Total a pagar: "+ totalApagar);
    
    
    
        // TODO code application logic here
    }
    
}
