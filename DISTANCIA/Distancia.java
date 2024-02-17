public class Distancia {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    //constructor
    public Distancia(double x1, double y1, double x2, double y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distancia(){
        double distancia = Math.sqrt(Math.pow((y2-y1),2) + Math.pow((x2-x1),2)); 
        return distancia;
    }

    public double pendiente(){
        double pendiente = (y2-y1)/(x2-x1); 
        return pendiente;
    }
}
