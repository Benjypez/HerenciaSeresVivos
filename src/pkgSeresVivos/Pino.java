package pkgSeresVivos;

public class Pino extends PlantaConFlor {
    private String tipoConoOEstrobilo;
    private double produccionResinaMl;

    public Pino(String nombreComun, String nombreCientifico, int edad,
                String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                boolean requiereSolDirecto,
                String temporadaFloracion, String colorFlor, boolean produceFruto,
                String tipoPolinizacion,
                String tipoConoOEstrobilo, double produccionResinaMl) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto, temporadaFloracion, colorFlor, produceFruto, tipoPolinizacion);
        this.tipoConoOEstrobilo = tipoConoOEstrobilo;
        this.produccionResinaMl = produccionResinaMl;
    }

    public void soltarPinas() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " suelta pinas (" + tipoConoOEstrobilo
                    + ") y produce " + produccionResinaMl + " ml de resina.");
        }
    }

    @Override
    public void florecer() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " no forma flores verdaderas: libera polen desde sus estrobilos en "
                    + getTemporadaFloracion() + ".");
        }
    }

    public String getTipoConoOEstrobilo() {
        return tipoConoOEstrobilo;
    }

    public void setTipoConoOEstrobilo(String tipoConoOEstrobilo) {
        this.tipoConoOEstrobilo = tipoConoOEstrobilo;
    }

    public double getProduccionResinaMl() {
        return produccionResinaMl;
    }

    public void setProduccionResinaMl(double produccionResinaMl) {
        this.produccionResinaMl = produccionResinaMl;
    }

    @Override
    public String toString() {
        return "[Pino] " + super.toString() + " | cono: " + tipoConoOEstrobilo
                + " | resina: " + produccionResinaMl + " ml";
    }
}
