public class Balance {
    
    private double salario;
    public static final double ARRIENDO = 40;
    public static final double COMIDA = 15;

    //constructor
    public Balance(double salario) {
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double valorArriendo(){
        double pagoArriendo =(salario * ARRIENDO)/100;
        return pagoArriendo;
    }

    public double valorComida(){
        double precioComida= (salario * COMIDA)/100;
        return precioComida;
    }

    public double balanceFinal(){
        double totalBalance= salario - (valorArriendo()+valorComida());
        return totalBalance;
    }


}
