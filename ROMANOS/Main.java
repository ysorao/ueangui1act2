import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n*****************************************************\n********** Numeros Romanos ***********\n*****************************************************");

        System.out.println("\nEste programa le permite convertir números enteros menores a 100 a números romanos\n");
        Scanner datos = new Scanner(System.in);     
        System.out.print("Ingrese un número entero mayor a cero y menor a 100: ");
        int numero = datos.nextInt();

        int decenas  = Convertir.calculaDecenas(numero);
        int unidades  = Convertir.calculaUnidades(numero);
        String decenasRomanos = Convertir.retornaDecenasRomano(decenas);
        String unidadesRomanas = Convertir.retornaUnidadesRomano(unidades);
        // System.out.println("decenas:" +  decenas);
        // System.out.println("unidades:" +  unidades);
        // System.out.println("decenas R:" +  decenasRomanos);
        // System.out.println("unidades R:" +  unidadesRomanas);
        System.out.println("Respuesta: " + decenasRomanos +  unidadesRomanas);
        
        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");


    }
}