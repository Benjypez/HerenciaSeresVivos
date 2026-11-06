package pkgSeresVivos;

public class PlantaSinFlor extends Planta {
    private String medioReproduccion;
    private boolean presenciaVasos;
    private double humedadOptima;

    public PlantaSinFlor(String nombreComun, String nombreCientifico, int edad,
                         String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                         boolean requiereSolDirecto,
                         String medioReproduccion, boolean presenciaVasos, double humedadOptima) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto);
        this.medioReproduccion = medioReproduccion;
        this.presenciaVasos = presenciaVasos;
        this.humedadOptima = humedadOptima;
    }

    public void liberarEsporas() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " se reproduce por " + medioReproduccion
                    + " con una humedad optima del " + humedadOptima + "%.");
        }
    }

    public String getMedioReproduccion() {
        return medioReproduccion;
    }

    public void setMedioReproduccion(String medioReproduccion) {
        this.medioReproduccion = medioReproduccion;
    }

    public boolean isPresenciaVasos() {
        return presenciaVasos;
    }

    public void setPresenciaVasos(boolean presenciaVasos) {
        this.presenciaVasos = presenciaVasos;
    }

    public double getHumedadOptima() {
        return humedadOptima;
    }

    public void setHumedadOptima(double humedadOptima) {
        this.humedadOptima = humedadOptima;
    }

    @Override
    public String toString() {
        return super.toString() + " | reproduccion: " + medioReproduccion + " | vasos: "
                + (presenciaVasos ? "si" : "no") + " | humedad optima: " + humedadOptima + "%";
    }
}
