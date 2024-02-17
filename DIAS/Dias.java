public class Dias {

   

    public static String retornaMañana(String dia){
        
        dia = dia.toLowerCase();
             
        switch (dia) {
            case "lunes": 
                return "Martes";
            case "martes": 
                return "Miércoles";
            case "miercoles" : 
                return "Jueves" ;
            case "jueves" : 
                return "Viernes" ;
            case "viernes" : 
                return "Sábado" ;
            case "sabado" : 
                return "Domingo" ;
            case "domingo" : 
                return "Lunes" ;
            default: return ("No es un dia Valido");
                
        }

    }
    
}
