import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\n*****************************************************\n********** El día Siguiente ***********\n*****************************************************");

        System.out.println("\nEste programa informa que día sigue dependiendo el día que ingrese\n");
        Scanner datos = new Scanner(System.in);     
        System.out.print("Ingrese un día de la semana: ");
        String dia = datos.nextLine();
       
        
        String nuevoDia = Dias.retornaMañana(dia);
        System.out.println("\nEl siguiente día es: " + nuevoDia);

        System.out.println("\n\n************************************** \n********** Fin del Programa **********\n**************************************\n");

    }
}