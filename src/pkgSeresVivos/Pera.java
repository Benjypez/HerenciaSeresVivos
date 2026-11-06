package pkgSeresVivos;

public class Pera extends PlantaConFlor {
    private String variedadPera;
    private double contenidoAzucarBrix;

    public Pera(String nombreComun, String nombreCientifico, int edad,
                String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                boolean requiereSolDirecto,
                String temporadaFloracion, String colorFlor, boolean produceFruto,
                String tipoPolinizacion,
                String variedadPera, double contenidoAzucarBrix) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto, temporadaFloracion, colorFlor, produceFruto, tipoPolinizacion);
        this.variedadPera = variedadPera;
        this.contenidoAzucarBrix = contenidoAzucarBrix;
    }

    public void cosechar() {
        if (verificarVida()) {
            System.out.println("Se cosechan peras de variedad " + variedadPera + " con "
                    + contenidoAzucarBrix + " grados Brix.");
        }
    }

    public String getVariedadPera() {
        return variedadPera;
    }

    public void setVariedadPera(String variedadPera) {
        this.variedadPera = variedadPera;
    }

    public double getContenidoAzucarBrix() {
        return contenidoAzucarBrix;
    }

    public void setContenidoAzucarBrix(double contenidoAzucarBrix) {
        this.contenidoAzucarBrix = contenidoAzucarBrix;
    }

    @Override
    public String toString() {
        return "[Pera] " + super.toString() + " | variedad: " + variedadPera
                + " | azucar: " + contenidoAzucarBrix + " Brix";
    }
}
