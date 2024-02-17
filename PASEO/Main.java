import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("\n\n*************************************************************\n********** Calculo de Buses para un paseo Escolar ***********\n*************************************************************");
        System.out.println("Para realizar el calculo adecuado necesitaremos los siguientes datos");

        System.out.println("\n1. Ingrese la cantidad de estudiantes Gordos que asisten al paseo: ");
        int e1 = datos.nextInt();
        System.out.println("2. Ingrese la cantidad de estudiantes flacos  que asisten al paseo:");
        int e2 = datos.nextInt();
        if(e1 == 0 & e2 == 0){
            System.out.println("\nYa  que el numero de estudiantes que  asisten es cero, no se requieren buses para esta actividad.\n");
        }else{
            System.out.println("3. Ingrese la cantidad de puestos que tiene cada bus:");
            int b1 = datos.nextInt();
            if(b1 <=0){
                System.out.println("Error: El bus debe contar con al menos una silla");
                System.out.println("Por favor ubique un bus que cumpla con este requisito y ejecute de nuevo el programa");
                
            }else{


                CalcularBuses calculo = new CalcularBuses(e1, e2, b1);
                System.out.println("\n********** Resultado **********\n");
                System.out.println("- El total de silllas a ocupar son: "+ calculo.getCantidadSillas());
                System.out.println("- Cada Bus a contratar tiene capacidad de : "+ calculo.getCapacidadBus() +" Puestos");
                System.out.println("- Para organizar la  salida se requieren: "+ calculo.calcularSillas() +" buses");
                System.out.println("- Quedan "+ calculo.sillasDisponibles()+" sillas disponibles");
                }
            }

            System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");


    }
}