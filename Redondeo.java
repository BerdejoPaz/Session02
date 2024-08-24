package programas;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import java.lang.Math;

public class Redondeo {
 //Método de la clase  
    public static void main(String [] args){
        //Declarar variables
        double num,absoluto;
        Scanner lectura=new Scanner(System.in);
        ;
        //Entrada de datos
        System.out.println("Ingresar un numero decimal:  ");
        num=lectura.nextDouble();
        //Proceso de Datos
        absoluto=Math.round(num);
         //Salida de datos
     System.out.println( " El numero " + num + " redondeado es :  "+ absoluto);  
    } 
  }