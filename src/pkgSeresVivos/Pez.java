package pkgSeresVivos;

public class Pez extends Vertebrado {
    private int numeroAletas;
    private String tipoAgua;

    public Pez(String nombreComun, String nombreCientifico, int edad,
               String dieta, String tipoDesplazamiento, int energia,
               int numeroVertebras, String tipoEsqueleto, String temperaturaSangre,
               int numeroAletas, String tipoAgua) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia,
                numeroVertebras, tipoEsqueleto, temperaturaSangre);
        this.numeroAletas = numeroAletas;
        this.tipoAgua = tipoAgua;
    }

    public void nadarContracorriente() {
        if (verificarVida()) {
            setEnergia(getEnergia() - 20);
            System.out.println(getNombreComun() + " nada contracorriente en agua " + tipoAgua
                    + " usando sus " + numeroAletas + " aletas. Energia: " + getEnergia());
        }
    }

    @Override
    public void respirar() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " respira oxigeno disuelto en el agua a traves de sus branquias.");
        }
    }

    @Override
    public void emitirSonido() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " produce leves sonidos con su vejiga natatoria.");
        }
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    @Override
    public String toString() {
        return "[Pez] " + super.toString() + " | aletas: " + numeroAletas + " | agua: " + tipoAgua;
    }
}
