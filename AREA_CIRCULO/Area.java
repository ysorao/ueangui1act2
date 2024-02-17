public class Area {

    public static final double  PI = 3.14159265359;
    private double radio;

    //constructor
    public Area(double radio) {
        this.radio = radio;
    }

    public double  areaCirculo() {
        double areaCirc =  PI * Math.pow(radio, 2);  
        return areaCirc;
    }

    public double coronaCirculo(double radio1, double radio2){
        
        double area1 = PI * Math.pow(radio1, 2);
        double area2 = PI * Math.pow(radio2, 2);

        if (area1 > area2){
            double corona = area1 - area2;   
            return corona;   
        } else {
            double corona = area2 - area1; 
            return corona;
        }
       

    }

}
