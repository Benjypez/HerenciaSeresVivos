package pkgSeresVivos;

public class PlantaConFlor extends Planta {
    private String temporadaFloracion;
    private String colorFlor;
    private boolean produceFruto;
    private String tipoPolinizacion;

    public PlantaConFlor(String nombreComun, String nombreCientifico, int edad,
                         String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                         boolean requiereSolDirecto,
                         String temporadaFloracion, String colorFlor, boolean produceFruto,
                         String tipoPolinizacion) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto);
        this.temporadaFloracion = temporadaFloracion;
        this.colorFlor = colorFlor;
        this.produceFruto = produceFruto;
        this.tipoPolinizacion = tipoPolinizacion;
    }

    public void florecer() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " florece en " + temporadaFloracion
                    + " con flores de color " + colorFlor + " (polinizacion: " + tipoPolinizacion + ").");
        }
    }

    public void madurarFruto() {
        if (!verificarVida()) {
            return;
        }
        if (produceFruto) {
            System.out.println("El fruto de " + getNombreComun() + " esta madurando.");
        } else {
            System.out.println(getNombreComun() + " no produce fruto.");
        }
    }

    public String getTemporadaFloracion() {
        return temporadaFloracion;
    }

    public void setTemporadaFloracion(String temporadaFloracion) {
        this.temporadaFloracion = temporadaFloracion;
    }

    public String getColorFlor() {
        return colorFlor;
    }

    public void setColorFlor(String colorFlor) {
        this.colorFlor = colorFlor;
    }

    public boolean isProduceFruto() {
        return produceFruto;
    }

    public void setProduceFruto(boolean produceFruto) {
        this.produceFruto = produceFruto;
    }

    public String getTipoPolinizacion() {
        return tipoPolinizacion;
    }

    public void setTipoPolinizacion(String tipoPolinizacion) {
        this.tipoPolinizacion = tipoPolinizacion;
    }

    @Override
    public String toString() {
        return super.toString() + " | floracion: " + temporadaFloracion + " | color flor: "
                + colorFlor + " | fruto: " + (produceFruto ? "si" : "no")
                + " | polinizacion: " + tipoPolinizacion;
    }
}
