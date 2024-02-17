public class Universidad {

    
    public static int calcularNumeroDeSalones(int numeroEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroEstudiantes / capacidadSalon);
    }

    
    public static int calcularNumeroDePisos(int numeroSalones, int salonesPorPiso) {
        int totalSalonesAjustado = (int) Math.ceil((double) numeroSalones / salonesPorPiso) * salonesPorPiso;
        return totalSalonesAjustado / salonesPorPiso;
    }
}