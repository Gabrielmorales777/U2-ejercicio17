public class Main {

    public static void main(String[] args) {


        VehiculoElectrico vehiculo = new VehiculoElectrico(40, 10);


        SurtidorElectrico surtidor = new SurtidorElectrico(7.2);

        System.out.println("ESTADO INICIAL DEL VEHICULO");
        System.out.printf("Batería: %.2f kWh%n", vehiculo.getNivelActual());
        System.out.printf("Carga: %.2f%%%n", vehiculo.getPorcentajeCarga());


        System.out.println("\nCONECTANDO VEHICULO AL SURTIDOR...");
        surtidor.iniciarCarga(vehiculo, 300);


        System.out.println("\nESTADO FINAL DEL VEHICULO");
        System.out.printf("Batería: %.2f kWh%n", vehiculo.getNivelActual());
        System.out.printf("Carga: %.2f%%%n", vehiculo.getPorcentajeCarga());
    }
}