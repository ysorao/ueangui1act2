import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n***************************************************");
            System.out.println("********** Calcular aumento de salario  ***********");
            System.out.println("***************************************************");      
        System.out.println("\nEste programa le permite realizar el calculo para aumentar el salario de un trabajador dependiendo el salario actual\n");

        Scanner datos = new Scanner(System.in);     
        System.out.print("Ingrese el salario actual: ");
        int salario = datos.nextInt();

        double porcentAumento = Aumento.calcularAumento(salario)*100;
        double aumento = Aumento.calcularAumento(salario)*salario;
        double nuevoSalario = aumento+salario;
        

        System.out.println("De acuerdo al salario actual le corresponde un aumento del : " + porcentAumento +"%");
        System.out.println("Aumento: " + aumento);
        System.out.println("Nuevo salario: " +  nuevoSalario);

        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");

    }
}