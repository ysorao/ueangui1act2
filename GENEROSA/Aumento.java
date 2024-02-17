public class Aumento {
    public static double calcularAumento(double salario){
        double aumento = 0;

        if(salario <= 800000){
             aumento = 0.1;
        }else if(salario > 800000 && salario <= 1200000) {
             aumento = 0.08;
        }else if(salario > 1200000){
             aumento = 0.05;
        }

        return aumento;

    }
}
