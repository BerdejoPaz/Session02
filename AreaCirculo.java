package programas;

/**
 *
 * @author Usuario
 */  
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class AreaCirculo {
   //Método de la clase  
    public static void main(String [] args){
        //Declarar variables
        double radio,acirculo;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        //Entrada de datos
        System.out.println("Ingresar el radio del circulo:  ");
        radio=lectura.nextDouble();
        //Proceso de Datos
        acirculo=Math.PI*Math.pow(radio, 2);
         //Salida de datos
     System.out.println("El area del circulo es : " + formato.format(acirculo));
     } 
}
