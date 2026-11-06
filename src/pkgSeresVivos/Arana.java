package pkgSeresVivos;

public class Arana extends Invertebrado {
    private int cantidadOjos;
    private String tipoVeneno;

    public Arana(String nombreComun, String nombreCientifico, int edad,
                 String dieta, String tipoDesplazamiento, int energia,
                 String tipoExoesqueleto, int numeroPatas, boolean poseeConcha,
                 int cantidadOjos, String tipoVeneno) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia,
                tipoExoesqueleto, numeroPatas, poseeConcha);
        this.cantidadOjos = cantidadOjos;
        this.tipoVeneno = tipoVeneno;
    }

    public void tejerTelarana() {
        if (verificarVida()) {
            setEnergia(getEnergia() - 5);
            System.out.println(getNombreComun() + " teje una telarana con sus " + getNumeroPatas()
                    + " patas y vigila con sus " + cantidadOjos + " ojos.");
        }
    }

    @Override
    public void emitirSonido() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " es silenciosa, solo hace vibrar su telarana.");
        }
    }

    public int getCantidadOjos() {
        return cantidadOjos;
    }

    public void setCantidadOjos(int cantidadOjos) {
        this.cantidadOjos = cantidadOjos;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    @Override
    public String toString() {
        return "[Arana] " + super.toString() + " | ojos: " + cantidadOjos + " | veneno: " + tipoVeneno;
    }
}
