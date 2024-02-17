import java.util.*;

public class Main{
    public static void main(String[] args) {

        System.out.println("\n\n******************************************");
            System.out.println("********** Función Algebraica  ***********");
            System.out.println("******************************************");      
        System.out.println("\nEste programa le permite encontrar el valor de la función algebraica:  f(x, y) = x2 + 2xy + y2\n");

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la Variable x");
        double n1 =leer.nextDouble();
        System.out.println("Ingrese el valor de la Variable y");
        double n2 =leer.nextDouble();

        FuncionAlgebraica.calcularValor(n1, n2);
        System.out.print("El valor de la función para x = " + n1 + ", y = " + n2 + " es:  "+FuncionAlgebraica.calcularValor(n1, n2));
        

        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");



    }
}