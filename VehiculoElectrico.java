public class VehiculoElectrico {

    private double capacidadBateria;
    private double nivelActual;

    public VehiculoElectrico(double capacidadBateria, double nivelActual) {
        this.capacidadBateria = capacidadBateria;
        this.nivelActual = nivelActual;
    }

    public void recibirCarga(double energiaKwh) {
        nivelActual += energiaKwh;

        if (nivelActual > capacidadBateria) {
            nivelActual = capacidadBateria;
        }
    }

    public double getNivelActual() {
        return nivelActual;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public double getPorcentajeCarga() {
        return (nivelActual / capacidadBateria) * 100;
    }
}