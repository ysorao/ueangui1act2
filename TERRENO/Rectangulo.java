public class Rectangulo {
    private double base;
    private double altura;
    
    //Constructores
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }   

    //Hallar area del rectangulo
    public double calculaArea() {
        double area = (base * altura);
        return area;
    }


}
