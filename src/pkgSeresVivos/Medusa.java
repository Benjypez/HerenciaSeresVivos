package pkgSeresVivos;

public class Medusa extends Invertebrado {
    private double longitudTentaculos;
    private boolean bioluminiscente;

    public Medusa(String nombreComun, String nombreCientifico, int edad,
                  String dieta, String tipoDesplazamiento, int energia,
                  String tipoExoesqueleto, int numeroPatas, boolean poseeConcha,
                  double longitudTentaculos, boolean bioluminiscente) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia,
                tipoExoesqueleto, numeroPatas, poseeConcha);
        this.longitudTentaculos = longitudTentaculos;
        this.bioluminiscente = bioluminiscente;
    }

    public void picar() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " pica con sus tentaculos de "
                    + longitudTentaculos + " m liberando cnidocitos.");
        }
    }

    @Override
    public void desplazarse() {
        if (verificarVida()) {
            setEnergia(getEnergia() - 5);
            String brillo = bioluminiscente ? " mientras brilla en la oscuridad" : "";
            System.out.println(getNombreComun() + " se impulsa contrayendo su campana" + brillo
                    + ". Energia: " + getEnergia());
        }
    }

    public double getLongitudTentaculos() {
        return longitudTentaculos;
    }

    public void setLongitudTentaculos(double longitudTentaculos) {
        this.longitudTentaculos = longitudTentaculos;
    }

    public boolean isBioluminiscente() {
        return bioluminiscente;
    }

    public void setBioluminiscente(boolean bioluminiscente) {
        this.bioluminiscente = bioluminiscente;
    }

    @Override
    public String toString() {
        return "[Medusa] " + super.toString() + " | tentaculos: " + longitudTentaculos
                + " m | bioluminiscente: " + (bioluminiscente ? "si" : "no");
    }
}
