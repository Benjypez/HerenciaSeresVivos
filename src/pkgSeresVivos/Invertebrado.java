package pkgSeresVivos;

public class Invertebrado extends Animal {
    private String tipoExoesqueleto;
    private int numeroPatas;
    private boolean poseeConcha;

    public Invertebrado(String nombreComun, String nombreCientifico, int edad,
                        String dieta, String tipoDesplazamiento, int energia,
                        String tipoExoesqueleto, int numeroPatas, boolean poseeConcha) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia);
        this.tipoExoesqueleto = tipoExoesqueleto;
        setNumeroPatas(numeroPatas);
        this.poseeConcha = poseeConcha;
    }

    public void mudarCuticula() {
        if (!verificarVida()) {
            return;
        }
        if (tipoExoesqueleto == null || tipoExoesqueleto.equalsIgnoreCase("ninguno")) {
            System.out.println(getNombreComun() + " no tiene exoesqueleto, no necesita mudar cuticula.");
        } else {
            System.out.println(getNombreComun() + " muda su cuticula de " + tipoExoesqueleto + ".");
        }
    }

    public boolean regenerarExtremidad() {
        if (!verificarVida()) {
            return false;
        }
        if (getEnergia() >= 20) {
            setEnergia(getEnergia() - 20);
            System.out.println(getNombreComun() + " regenero una extremidad. Energia: " + getEnergia());
            return true;
        }
        System.out.println(getNombreComun() + " no tiene energia suficiente para regenerarse.");
        return false;
    }

    public String getTipoExoesqueleto() {
        return tipoExoesqueleto;
    }

    public void setTipoExoesqueleto(String tipoExoesqueleto) {
        this.tipoExoesqueleto = tipoExoesqueleto;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = Math.max(numeroPatas, 0);
    }

    public boolean isPoseeConcha() {
        return poseeConcha;
    }

    public void setPoseeConcha(boolean poseeConcha) {
        this.poseeConcha = poseeConcha;
    }

    @Override
    public String toString() {
        return super.toString() + " | exoesqueleto: " + tipoExoesqueleto + " | patas: "
                + numeroPatas + " | concha: " + (poseeConcha ? "si" : "no");
    }
}
