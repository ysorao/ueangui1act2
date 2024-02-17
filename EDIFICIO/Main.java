import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n*****************************************************\n********** Calcular capacidad Universidad ***********\n*****************************************************");

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