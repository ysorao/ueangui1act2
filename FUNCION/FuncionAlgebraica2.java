public class FuncionAlgebraica2 {
    public static double calcularValor(double x, double y){
        return (x*x)+2*x*y+(y*y);
    }
    
    public static void main(String[] args) {
        double x = 5;
        double y = 10;
        double resultado = calcularValor(x, y);
        System.out.println("El valor de la función para x = " + x + " y y = " + y + " es: " + resultado);
    }
}
