package pkgSeresVivos;

public class Croton extends PlantaSinFlor {
    private String patronColorHojas;

    public Croton(String nombreComun, String nombreCientifico, int edad,
                  String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                  boolean requiereSolDirecto,
                  String medioReproduccion, boolean presenciaVasos, double humedadOptima,
                  String patronColorHojas) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto, medioReproduccion, presenciaVasos, humedadOptima);
        this.patronColorHojas = patronColorHojas;
    }

    public void pigmentarHojas() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " pigmenta sus hojas con un patron " + patronColorHojas + ".");
        }
    }

    public String getPatronColorHojas() {
        return patronColorHojas;
    }

    public void setPatronColorHojas(String patronColorHojas) {
        this.patronColorHojas = patronColorHojas;
    }

    @Override
    public String toString() {
        return "[Croton] " + super.toString() + " | patron hojas: " + patronColorHojas;
    }
}
