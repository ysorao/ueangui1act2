import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n*****************************************************\n********** Calcular el Numero Mayor ***********\n*****************************************************");

        Scanner datos = new Scanner(System.in);     
        System.out.print("Ingrese un número entero: ");
        int numero1 = datos.nextInt();
        System.out.print("Ingrese Otro número entero: ");
        int numero2 = datos.nextInt();
       

        String resultado = Mayor.encontrarMayor(numero1, numero2);
        System.out.println(resultado);

        System.out.println("-------------------------------------------------------");


        System.out.println(resultado);


        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");

        
    }
}