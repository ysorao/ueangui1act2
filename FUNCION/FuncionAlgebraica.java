public class FuncionAlgebraica {
    public static double calcularValor(double x, double y){
        return Math.pow(x,2)+2*x*y+Math.pow(y,2);
    }
    
    public static void main(String[] args) {
        double x = 5;
        double y = 10;
        double resultado = calcularValor(x, y);
        System.out.println("El valor de la función para x = " + x + " y y = " + y + " es: " + resultado);
    }
}
