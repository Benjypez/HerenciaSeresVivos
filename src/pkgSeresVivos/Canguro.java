package pkgSeresVivos;

public class Canguro extends Vertebrado {
    private double fuerzaSaltoMetros;
    private boolean tieneCriaEnBolsa;

    public Canguro(String nombreComun, String nombreCientifico, int edad,
                   String dieta, String tipoDesplazamiento, int energia,
                   int numeroVertebras, String tipoEsqueleto, String temperaturaSangre,
                   double fuerzaSaltoMetros, boolean tieneCriaEnBolsa) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia,
                numeroVertebras, tipoEsqueleto, temperaturaSangre);
        this.fuerzaSaltoMetros = fuerzaSaltoMetros;
        this.tieneCriaEnBolsa = tieneCriaEnBolsa;
    }

    public void saltar() {
        if (verificarVida()) {
            setEnergia(getEnergia() - 15);
            String cria = tieneCriaEnBolsa ? " llevando a su cria en la bolsa" : "";
            System.out.println(getNombreComun() + " salta " + fuerzaSaltoMetros + " m" + cria
                    + ". Energia: " + getEnergia());
        }
    }

    @Override
    public void desplazarse() {
        System.out.print("(Se desplaza saltando) ");
        saltar();
    }

    public double getFuerzaSaltoMetros() {
        return fuerzaSaltoMetros;
    }

    public void setFuerzaSaltoMetros(double fuerzaSaltoMetros) {
        this.fuerzaSaltoMetros = fuerzaSaltoMetros;
    }

    public boolean isTieneCriaEnBolsa() {
        return tieneCriaEnBolsa;
    }

    public void setTieneCriaEnBolsa(boolean tieneCriaEnBolsa) {
        this.tieneCriaEnBolsa = tieneCriaEnBolsa;
    }

    @Override
    public String toString() {
        return "[Canguro] " + super.toString() + " | salto: " + fuerzaSaltoMetros
                + " m | cria en bolsa: " + (tieneCriaEnBolsa ? "si" : "no");
    }
}
