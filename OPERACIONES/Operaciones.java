public class Operaciones {

    public static double calcular(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "**":
                return Math.pow(num1, num2);
            case "%":
                return num1 % num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("No es posible dividir por cero");

                    //throw new IllegalArgumentException("No se puede dividir por cero.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Operador no soportado.");
        }
    }

}