import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n*************************************************\n********** Ejercicio Financiero Pedro ***********\n*************************************************");
        System.out.println("Para realizar el calculo adecuado necesitaremos los siguientes datos");
        Scanner datos = new Scanner(System.in);
        System.out.println("Salario recibido: ");
        double  salarioRecibido=datos.nextDouble();
     

        Balance balancePedro = new Balance(salarioRecibido);
        System.out.println("- El salario devengado este mes fue: " +balancePedro.getSalario());
        System.out.println("- El Arriendo pagado este mes fue: " +balancePedro.valorArriendo());
        System.out.println("- Los gastos de alimentacion fueron: " +balancePedro.valorComida());
        System.out.println("\nBalance Final: " +balancePedro.balanceFinal() + " disponibles");

        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");




        
        


        
    }
}