package programas;

/**
 *
 * @author Usuario
 */  
import java.util.Scanner;
import java.lang.Math;
public class MaximoMinimo {
  //Método de la clase  
    public static void main(String [] args){
        //Declarar variables
        int num1,num2,maximo, minimo;
        Scanner lectura=new Scanner(System.in);
        //Entrada de datos
        System.out.println("Ingresar numero 1:  ");
        num1=lectura.nextInt();
        System.out.println("Ingresar numero 2:  ");
        num2=lectura.nextInt();
        //Proceso de Datos
        maximo=Math.max(num1, num2);
        minimo=Math.min(num1, num2);
        //Salida de datos
         
     System.out.println("el maximo numero es : " + maximo);
     System.out.println("El minimo numero es:  "+minimo);
     
    }
}
