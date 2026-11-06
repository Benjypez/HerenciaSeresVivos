package pkgSeresVivos;

public class Gusano extends Invertebrado {
    private int numeroSegmentos;
    private boolean subterraneo;

    public Gusano(String nombreComun, String nombreCientifico, int edad,
                  String dieta, String tipoDesplazamiento, int energia,
                  String tipoExoesqueleto, int numeroPatas, boolean poseeConcha,
                  int numeroSegmentos, boolean subterraneo) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia,
                tipoExoesqueleto, numeroPatas, poseeConcha);
        this.numeroSegmentos = numeroSegmentos;
        this.subterraneo = subterraneo;
    }

    public void cavar() {
        if (!verificarVida()) {
            return;
        }
        if (subterraneo) {
            setEnergia(getEnergia() - 10);
            System.out.println(getNombreComun() + " cava tuneles bajo tierra moviendo sus "
                    + numeroSegmentos + " segmentos. Energia: " + getEnergia());
        } else {
            System.out.println(getNombreComun() + " no es subterraneo, no puede cavar.");
        }
    }

    @Override
    public void emitirSonido() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " no emite sonidos, no tiene cuerdas vocales.");
        }
    }

    public int getNumeroSegmentos() {
        return numeroSegmentos;
    }

    public void setNumeroSegmentos(int numeroSegmentos) {
        this.numeroSegmentos = numeroSegmentos;
    }

    public boolean isSubterraneo() {
        return subterraneo;
    }

    public void setSubterraneo(boolean subterraneo) {
        this.subterraneo = subterraneo;
    }

    @Override
    public String toString() {
        return "[Gusano] " + super.toString() + " | segmentos: " + numeroSegmentos
                + " | subterraneo: " + (subterraneo ? "si" : "no");
    }
}
