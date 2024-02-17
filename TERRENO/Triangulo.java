public class Triangulo {
    private double cateto1;
    private double cateto2;
    
    //Constructores
    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }   

    //Hallar hipotenusa
    public double calculaHipotenusa() {
        double hipotenusa = Math.sqrt((cateto1 * cateto1) +(cateto2 * cateto2)) ;
        return hipotenusa;  
    }


}
