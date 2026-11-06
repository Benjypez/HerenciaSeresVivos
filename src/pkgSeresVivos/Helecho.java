package pkgSeresVivos;

public class Helecho extends PlantaSinFlor {
    private String tipoFronda;

    public Helecho(String nombreComun, String nombreCientifico, int edad,
                   String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                   boolean requiereSolDirecto,
                   String medioReproduccion, boolean presenciaVasos, double humedadOptima,
                   String tipoFronda) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto, medioReproduccion, presenciaVasos, humedadOptima);
        this.tipoFronda = tipoFronda;
    }

    public void desplegarFronda() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " despliega su fronda " + tipoFronda
                    + " desenrollando el baculo.");
        }
    }

    public String getTipoFronda() {
        return tipoFronda;
    }

    public void setTipoFronda(String tipoFronda) {
        this.tipoFronda = tipoFronda;
    }

    @Override
    public String toString() {
        return "[Helecho] " + super.toString() + " | fronda: " + tipoFronda;
    }
}
