public class Hipotenusa {
    private double altura;
    private double angulo;
    
    //Constructor de la clase que recibe los atributos por 
    //parámetros y asigna sus valores a las variables correspondientes.
    public Hipotenusa(double altura, double angulo) {
        this.altura = altura;
        this.angulo = angulo;        
    }
  

    public double getAltura() { 
        return this.altura;
    }

    public void setAltura(double altura) {
       this.altura = altura;
    }

    public double getInclinacion() { 
        return this.angulo;
    }

    public void setInclinacion(double angulo) {
       this.angulo = angulo;
    }

    public  double CalculaHipotenusa(){

        double anguloRadianes = Math.toRadians(angulo);
        double senoAngulo = Math.sin(anguloRadianes);
        double resultado = altura/senoAngulo;
        return resultado;
    }
}
