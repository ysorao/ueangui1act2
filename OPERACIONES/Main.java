import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n********************************************");
            System.out.println("********** Realizar Operaciones  ***********");
            System.out.println("********************************************");      
        System.out.println("\nEste programa le permite realizar Diversas operaciones con 2 numeros\n");


        Scanner datos = new Scanner(System.in);     
        System.out.print("Ingrese un número entero: ");
        int numero1 = datos.nextInt();
        System.out.print("Ingrese Otro número entero: ");
        int numero2 = datos.nextInt();
        System.out.print("Seleccione el tipo de operacion ue desea realizar con los numero ingresados:\n[+]  Suma\n[-]  Resta\n[*]  Muliplicacion\n[/]  División\n[%]  Residuo de una división\n[**] Exponente");
        System.out.print("\nIngrese el tipo de operación: ");

        String operador = datos.next();

        System.out.println("-------------------------------------------------------");

        System.out.println("Resultado " + numero1 + operador + numero2 + ": "+ Operaciones.calcular(numero1, numero2, operador));

        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");






    }
}