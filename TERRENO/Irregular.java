public class Irregular {
    private  double ladoa;
    private  double ladob;
    private  double ladoc;

    //constructor
    public Irregular(double ladoa, double ladob, double ladoc) {
        this.ladoa = ladoa;
        this.ladob = ladob;
        this.ladoc = ladoc;
    }
    
    public double calcularLadoD(){
        double ladoa1 = ladoa - ladoc;
        return  ladoa1;
    } 

}
