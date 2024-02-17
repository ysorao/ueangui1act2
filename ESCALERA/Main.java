import java.util.*;
public class Main{
    public static void main(String[] args) {

        System.out.println("\n\n*******************************************************");
            System.out.println("********** Calcular Medida de una escalera  ***********");
            System.out.println("*******************************************************");      
        System.out.println("\nEste programa le permite realizar el calculo de la  medida de  una escalera partiendo de la altura del muro en el que descansa la parte superiror y el angulo de inclinacion de la misma\n");
        
        Scanner datos = new Scanner(System.in);
        System.out.println("Para realizar el calculo adecuado necesitaremos los siguientes datos");

        System.out.println("\n1. Ingrese la altura (x) en metros: ");
        double e1 = datos.nextDouble();
        System.out.println("2. Ingrese el angulo de inclinacion :");
        double e2 = datos.nextDouble();
        

        Hipotenusa hipotenusa = new Hipotenusa(e1, e2);
        double resultado = hipotenusa.CalculaHipotenusa();

        System.out.println("para lograr la  altura de: " + e1 + " metros con un angulo de inclinacion de " + e2 + "° se requiere una escalera de " + resultado + " metros de largo");
        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");
    }
    
}