public class Mayor {

    public static String encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return "El mayor de los dos números es: " + num1;
        } else if (num1 < num2) {
            return "El mayor de los dos números es: " + num2;
        } else {
            return "Los números son iguales, por lo tanto, no hay un número mayor.";
        }
    }
}