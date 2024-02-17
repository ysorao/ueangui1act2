public class TrianguloArea {
    private double base;
    private double altura;
    
    //Constructores
    public TrianguloArea(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }   

    //Hallar area del rectangulo
    public double calculaArea() {
        double area = (base * altura)/2;
        return area;
    }


}
