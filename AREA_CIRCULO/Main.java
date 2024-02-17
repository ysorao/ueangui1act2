import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n**************************************************\n********** Calcular Area de un circulo ***********\n**************************************************");
        System.out.println("Este Programa calcula el area de un circulo, a partir de su radio, solicitaremos el datos de dos circunferencias para calcular la corona (diferencia entre las dos areas.)");
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa el Radio del Primer Circulo es: ");
        double radio1 = datos.nextDouble();

        
        System.out.println("Ingresa el Radio del Segundo Circulo es: ");
        double radio2 = datos.nextDouble();

        Area area1 = new Area(radio1);
        Area area2 = new Area(radio2);


        System.out.println("- El area del circulo 1 es : " + area1.areaCirculo());
        System.out.println("- El area del circulo 2 es : " + area2.areaCirculo());
        System.out.println("- La corona Circular es : " + area2.coronaCirculo(radio1, radio2));

        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");



    }
}