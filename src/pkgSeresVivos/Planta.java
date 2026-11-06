package pkgSeresVivos;

public class Planta extends SerVivo {
    private String tipoSuelo;
    private double alturaMaxMetros;
    private double nivelClorofila;
    private boolean requiereSolDirecto;

    public Planta(String nombreComun, String nombreCientifico, int edad,
                  String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                  boolean requiereSolDirecto) {
        super(nombreComun, nombreCientifico, edad);
        this.tipoSuelo = tipoSuelo;
        this.alturaMaxMetros = alturaMaxMetros;
        this.nivelClorofila = nivelClorofila;
        this.requiereSolDirecto = requiereSolDirecto;
    }

    public void fotosintetizar() {
        if (verificarVida()) {
            String luz = requiereSolDirecto ? "a pleno sol" : "con luz indirecta";
            System.out.println(getNombreComun() + " realiza fotosintesis " + luz
                    + " (clorofila: " + nivelClorofila + " mg/g).");
        }
    }

    public void absorberAgua() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " absorbe agua desde un suelo " + tipoSuelo + ".");
        }
    }

    public void crecer() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " esta creciendo (altura maxima: "
                    + alturaMaxMetros + " m).");
        }
    }

    @Override
    public void alimentar() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " se nutre con los minerales del suelo "
                    + tipoSuelo + ".");
        }
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public double getAlturaMaxMetros() {
        return alturaMaxMetros;
    }

    public void setAlturaMaxMetros(double alturaMaxMetros) {
        this.alturaMaxMetros = alturaMaxMetros;
    }

    public double getNivelClorofila() {
        return nivelClorofila;
    }

    public void setNivelClorofila(double nivelClorofila) {
        this.nivelClorofila = nivelClorofila;
    }

    public boolean isRequiereSolDirecto() {
        return requiereSolDirecto;
    }

    public void setRequiereSolDirecto(boolean requiereSolDirecto) {
        this.requiereSolDirecto = requiereSolDirecto;
    }

    @Override
    public String toString() {
        return super.toString() + " | suelo: " + tipoSuelo + " | altura max: "
                + alturaMaxMetros + " m | sol directo: " + (requiereSolDirecto ? "si" : "no");
    }
}
