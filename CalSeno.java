package programas;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;
public class CalSeno {
  //Método de la clase  
    public static void main(String [] args){
        //Declarar variables
        double angulo,radianes,seno;
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("##.##");
        //Entrada de datos
        System.out.println("Ingresar un angulo:  ");
        angulo=lectura.nextDouble();
        //Proceso de Datos
        radianes=Math.toRadians(angulo);
        seno=Math.sin(radianes);
         //Salida de datos
     System.out.println( "El seno de " +angulo + "  grados es: " + formato.format(seno));  
    } 
  }  
