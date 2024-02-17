import java.lang.Math;

public class PerimetroCuadrilatero {
    public static void main(String[] args) {
        // Longitudes de los lados conocidos
        double ladoA = 20.0;
        double ladoB = 10.0;
        double ladoC = 10.0;
        
        // Calcular la longitud del lado D usando el teorema de Pitágoras
        double ladoD = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoC, 2));
        
        // Calcular el perímetro sumando todas las longitudes de los lados
        double perimetro = ladoA + ladoB + ladoC + ladoD;
        
        // Mostrar el resultado
        System.out.println("La longitud del lado D es: " + ladoD);
        System.out.println("El perímetro del cuadrilátero es: " + perimetro);
    }
}