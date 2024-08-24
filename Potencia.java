package programas;

/**
 *
 * @author Usuario
 */  
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class Potencia {
     //Método de la clase  
    public static void main(String [] args){
        //Declarar variables
        double num,exponente,resultado;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        //Entrada de datos
        System.out.println("Ingresar la Base:  ");
        num=lectura.nextDouble();
        System.out.println("Ingresar el exponente:  ");
        exponente=lectura.nextDouble();
        //Proceso de Datos
        resultado=Math.pow(num,exponente);
         //Salida de datos
     System.out.println(num + " elevado a " + exponente + " es: "+ formato.format(resultado));
     } 

    
}
