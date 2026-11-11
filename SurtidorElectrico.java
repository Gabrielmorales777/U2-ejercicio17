public class SurtidorElectrico {

    private double potenciaKw;

    public SurtidorElectrico(double potenciaKw) {
        this.potenciaKw = potenciaKw;
    }

    public void iniciarCarga(VehiculoElectrico vehiculo, int minutos) {

        System.out.println("Iniciando proceso de carga...");

        for (int i = 1; i <= minutos; i++) {


            if (vehiculo.getNivelActual() >= vehiculo.getCapacidadBateria()) {
                System.out.println("Batería al 100%. Carga finalizada.");
                break;
            }


            double energia = potenciaKw / 60;


            vehiculo.recibirCarga(energia);

            System.out.printf("Minuto %d - Batería: %.2f%% (%.2f kWh)%n",
                    i,
                    vehiculo.getPorcentajeCarga(),
                    vehiculo.getNivelActual());


            if (vehiculo.getNivelActual() >= vehiculo.getCapacidadBateria()) {
                System.out.println("Batería al 100%. Carga finalizada.");
                break;
            }
        }

        System.out.println("Proceso de carga terminado.");
    }
}