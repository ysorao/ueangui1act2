public class Mayor {
    
    public static String  getMayor(String persona1, int edad1, String persona2, int edad2,  String persona3, int edad3 ) {

        if (edad1 >= edad2 && edad1 >= edad3) {
            return ("El Hermano mayor  es: " + persona1);
        } else if (edad2 >= edad1 && edad2 >= edad3) {
            return("El Hermano mayor es: " + persona2);
        } else {
            return("El Hermano mayor es: " + persona3);
        }
    }

}

