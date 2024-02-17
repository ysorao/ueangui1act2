public class Convertir {

    public static int calculaDecenas(int num) {
        int decenas = num/10;
        return decenas;
    }

    public static int calculaUnidades(int num){
        int  unidades = num%10;
        return unidades;
    }
    
    public static String retornaUnidadesRomano(int num) {
        if (num < 0 || num >= 10) {
            return "Error: El número debe estar entre 0 y 9";
        }

        switch (num) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
            default: return "";
        }
    }

    public static String retornaDecenasRomano(int num){
        if(num >= 10){
            return "Solo se  adminten  numeros entre 0 y 99";
        }
        switch (num) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
            case 0: return ""; 
            default: return "";  
        }
        
    }
}
