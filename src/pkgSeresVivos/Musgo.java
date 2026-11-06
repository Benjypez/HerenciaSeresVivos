package pkgSeresVivos;

public class Musgo extends PlantaSinFlor {
    private double espesorCojinCm;

    public Musgo(String nombreComun, String nombreCientifico, int edad,
                 String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                 boolean requiereSolDirecto,
                 String medioReproduccion, boolean presenciaVasos, double humedadOptima,
                 double espesorCojinCm) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto, medioReproduccion, presenciaVasos, humedadOptima);
        this.espesorCojinCm = espesorCojinCm;
    }

    public void retenerHumedad() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " retiene humedad en su cojin de "
                    + espesorCojinCm + " cm como una esponja.");
        }
    }

    @Override
    public void absorberAgua() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " no tiene raices verdaderas: absorbe agua por toda su superficie.");
        }
    }

    public double getEspesorCojinCm() {
        return espesorCojinCm;
    }

    public void setEspesorCojinCm(double espesorCojinCm) {
        this.espesorCojinCm = espesorCojinCm;
    }

    @Override
    public String toString() {
        return "[Musgo] " + super.toString() + " | cojin: " + espesorCojinCm + " cm";
    }
}
