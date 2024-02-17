
public class CalcularBuses {

    private int gordos;
    private int flacos;
    private int capacidad;
    
    //Constructor de la clase
    public CalcularBuses(int gordos, int flacos, int capacidad) {
        this.gordos = gordos;
        this.flacos = flacos;
        this.capacidad = capacidad; 
    }

    public int getCantidadSillas(){
        return(flacos + gordos*2);
    }

    public int getCapacidadBus(){
        return(capacidad);
    }
        
    public int calcularSillas(){
        int totalPasajeros =(gordos * 2) + flacos;
        int totalBuses =  totalPasajeros / capacidad;
        
        if(totalPasajeros % capacidad != 0){
            totalBuses++;
        }
            
        return totalBuses;

    }

    public int sillasDisponibles(){
        int totalPasajeros =(gordos * 2) + flacos;
        int disponibles = capacidad - totalPasajeros % capacidad;
        return disponibles;

    }

       
}
