package pkgSeresVivos;

public class Vertebrado extends Animal {
    private int numeroVertebras;
    private String tipoEsqueleto;
    private String temperaturaSangre;

    public Vertebrado(String nombreComun, String nombreCientifico, int edad,
                      String dieta, String tipoDesplazamiento, int energia,
                      int numeroVertebras, String tipoEsqueleto, String temperaturaSangre) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia);
        this.numeroVertebras = numeroVertebras;
        this.tipoEsqueleto = tipoEsqueleto;
        this.temperaturaSangre = temperaturaSangre;
    }

    public void regularTemperatura() {
        if (!verificarVida()) {
            return;
        }
        if ("caliente".equalsIgnoreCase(temperaturaSangre)) {
            System.out.println(getNombreComun() + " (sangre caliente) regula su temperatura internamente.");
        } else {
            System.out.println(getNombreComun() + " (sangre fria) regula su temperatura con el ambiente.");
        }
    }

    public void sostenerPostura() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " sostiene su postura gracias a su esqueleto "
                    + tipoEsqueleto + " de " + numeroVertebras + " vertebras.");
        }
    }

    public int getNumeroVertebras() {
        return numeroVertebras;
    }

    public void setNumeroVertebras(int numeroVertebras) {
        this.numeroVertebras = numeroVertebras;
    }

    public String getTipoEsqueleto() {
        return tipoEsqueleto;
    }

    public void setTipoEsqueleto(String tipoEsqueleto) {
        this.tipoEsqueleto = tipoEsqueleto;
    }

    public String getTemperaturaSangre() {
        return temperaturaSangre;
    }

    public void setTemperaturaSangre(String temperaturaSangre) {
        this.temperaturaSangre = temperaturaSangre;
    }

    @Override
    public String toString() {
        return super.toString() + " | vertebras: " + numeroVertebras + " | esqueleto: "
                + tipoEsqueleto + " | sangre: " + temperaturaSangre;
    }
}
