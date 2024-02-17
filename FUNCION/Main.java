import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la Variable x");
        double n1 =leer.nextDouble();
        System.out.println("Ingrese el valor de la Variable y");
        double n2 =leer.nextDouble();

        FuncionAlgebraica.calcularValor(n1, n2);
        System.out.print("El valor de la función para x = " + n1 + ", y = " + n2 + " es:  "+FuncionAlgebraica.calcularValor(n1, n2));
        


    }
}