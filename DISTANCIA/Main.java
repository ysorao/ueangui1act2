import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n*******************************************");
            System.out.println("********** Calcular Distancias  ***********");
            System.out.println("*******************************************"); 
        System.out.println("Este Programa calcula la distancia entre dos puntos, basado en las coordenadas.\n");

        Scanner datos =  new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto");
        System.out.println("Valor para x1:");
        double  x1=datos.nextDouble();
        System.out.println("Valor para y1:");
        double  y1=datos.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto");
        System.out.println("Valor para x2:");
        double  x2=datos.nextDouble();
        System.out.println("Valor para y2:");
        double  y2=datos.nextDouble();

        Distancia distancia = new Distancia(x1,y1,x2,y2);
        System.out.println("- La Distancia entre los dospuntos es : " + distancia.distancia());
        System.out.println("- La pendiente de la recta es : " + distancia.pendiente());




        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");
        

        



    }
}    
    
