import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n*****************************************************");
            System.out.println("********** Calcular capacidad Universidad ***********");
            System.out.println("*****************************************************");      
        System.out.println("\nEste programa calcular el número de salones y el número de pisos del nuevo edificio\n");


        Scanner datos = new Scanner(System.in);     
        System.out.print("Ingrese el número de estudiantes: ");
        int numeroEstudiantes = datos.nextInt();
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = datos.nextInt();
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = datos.nextInt();

        int numeroSalones = Universidad.calcularNumeroDeSalones(numeroEstudiantes, capacidadSalon);
        int numeroPisos = Universidad.calcularNumeroDePisos(numeroSalones, salonesPorPiso);

        System.out.println("-------------------------------------------------------");


        System.out.println("Número total de salones requeridos: " + numeroSalones);
        System.out.println("Número total de pisos: " + numeroPisos);


        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");

    }
}