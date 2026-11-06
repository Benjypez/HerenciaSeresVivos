package pkgSeresVivos;

public class Durazno extends PlantaConFlor {
    private String texturaPiel;
    private double pesoPromedioFrutoG;

    public Durazno(String nombreComun, String nombreCientifico, int edad,
                   String tipoSuelo, double alturaMaxMetros, double nivelClorofila,
                   boolean requiereSolDirecto,
                   String temporadaFloracion, String colorFlor, boolean produceFruto,
                   String tipoPolinizacion,
                   String texturaPiel, double pesoPromedioFrutoG) {
        super(nombreComun, nombreCientifico, edad, tipoSuelo, alturaMaxMetros, nivelClorofila,
                requiereSolDirecto, temporadaFloracion, colorFlor, produceFruto, tipoPolinizacion);
        this.texturaPiel = texturaPiel;
        this.pesoPromedioFrutoG = pesoPromedioFrutoG;
    }

    public void generarHueso() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " genera un hueso duro dentro de su fruto de "
                    + pesoPromedioFrutoG + " g con piel " + texturaPiel + ".");
        }
    }

    public String getTexturaPiel() {
        return texturaPiel;
    }

    public void setTexturaPiel(String texturaPiel) {
        this.texturaPiel = texturaPiel;
    }

    public double getPesoPromedioFrutoG() {
        return pesoPromedioFrutoG;
    }

    public void setPesoPromedioFrutoG(double pesoPromedioFrutoG) {
        this.pesoPromedioFrutoG = pesoPromedioFrutoG;
    }

    @Override
    public String toString() {
        return "[Durazno] " + super.toString() + " | piel: " + texturaPiel
                + " | peso fruto: " + pesoPromedioFrutoG + " g";
    }
}
