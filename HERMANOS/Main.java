import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n**************************************************");
            System.out.println("********** Calcular Edad de 3 Hermanos ***********");
            System.out.println("**************************************************");      
        System.out.println("\nEste programa le permite identificar quien es el hermano mayor\n");

        Scanner datos = new Scanner(System.in);     
        
        System.out.print("Ingrese el Nombre del Hermano 1: ");
        String persona1 = datos.nextLine();
        System.out.print("Ingrese la edad de " + persona1 + ":");
        int edad1 = Integer.parseInt(datos.nextLine());

        System.out.print("Ingrese el Nombre del Hermano 2: ");
        String persona2 = datos.nextLine();
        System.out.print("Ingrese la edad de "  + persona2 + ":");
        int edad2 = Integer.parseInt(datos.nextLine());
        
        System.out.print("Ingrese el Nombre del Hermano 3: ");
        String persona3 = datos.nextLine();
        System.out.print("Ingrese la edad de " + persona3 + ":");
        int edad3 = Integer.parseInt(datos.nextLine());

        String calcularMayor = Mayor.getMayor(persona1, edad1, persona2, edad2, persona3, edad3);

        System.out.print(calcularMayor);
        

        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");

    }
}