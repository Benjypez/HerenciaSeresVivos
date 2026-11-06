package pkgSeresVivos;

public class Animal extends SerVivo {
    private String dieta;
    private String tipoDesplazamiento;
    private int energia;

    public Animal(String nombreComun, String nombreCientifico, int edad,
                  String dieta, String tipoDesplazamiento, int energia) {
        super(nombreComun, nombreCientifico, edad);
        this.dieta = dieta;
        this.tipoDesplazamiento = tipoDesplazamiento;
        setEnergia(energia);
    }

    public void desplazarse() {
        if (verificarVida()) {
            setEnergia(energia - 10);
            System.out.println(getNombreComun() + " se desplaza (" + tipoDesplazamiento
                    + "). Energia: " + energia);
        }
    }

    public void emitirSonido() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " emite un sonido.");
        }
    }

    public void dormir() {
        if (verificarVida()) {
            setEnergia(energia + 30);
            System.out.println(getNombreComun() + " duerme y recupera energia. Energia: " + energia);
        }
    }

    @Override
    public void alimentar() {
        if (verificarVida()) {
            setEnergia(energia + 15);
            System.out.println(getNombreComun() + " se alimenta con dieta " + dieta
                    + ". Energia: " + energia);
        }
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getTipoDesplazamiento() {
        return tipoDesplazamiento;
    }

    public void setTipoDesplazamiento(String tipoDesplazamiento) {
        this.tipoDesplazamiento = tipoDesplazamiento;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(100, energia));
    }

    @Override
    public String toString() {
        return super.toString() + " | dieta: " + dieta + " | desplazamiento: "
                + tipoDesplazamiento + " | energia: " + energia;
    }
}
