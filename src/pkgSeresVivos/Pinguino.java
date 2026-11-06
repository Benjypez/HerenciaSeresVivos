package pkgSeresVivos;

public class Pinguino extends Vertebrado {
    private double resistenciaFrioC;
    private double velocidadNado;

    public Pinguino(String nombreComun, String nombreCientifico, int edad,
                    String dieta, String tipoDesplazamiento, int energia,
                    int numeroVertebras, String tipoEsqueleto, String temperaturaSangre,
                    double resistenciaFrioC, double velocidadNado) {
        super(nombreComun, nombreCientifico, edad, dieta, tipoDesplazamiento, energia,
                numeroVertebras, tipoEsqueleto, temperaturaSangre);
        this.resistenciaFrioC = resistenciaFrioC;
        this.velocidadNado = velocidadNado;
    }

    public void deslizarse() {
        if (verificarVida()) {
            setEnergia(getEnergia() - 5);
            System.out.println(getNombreComun() + " se desliza sobre su vientre por el hielo. Energia: "
                    + getEnergia());
        }
    }

    @Override
    public void emitirSonido() {
        if (verificarVida()) {
            System.out.println(getNombreComun() + " emite un graznido para llamar a su colonia.");
        }
    }

    @Override
    public void desplazarse() {
        if (verificarVida()) {
            setEnergia(getEnergia() - 10);
            System.out.println(getNombreComun() + " nada a " + velocidadNado
                    + " km/h y soporta hasta " + resistenciaFrioC + " C. Energia: " + getEnergia());
        }
    }

    public double getResistenciaFrioC() {
        return resistenciaFrioC;
    }

    public void setResistenciaFrioC(double resistenciaFrioC) {
        this.resistenciaFrioC = resistenciaFrioC;
    }

    public double getVelocidadNado() {
        return velocidadNado;
    }

    public void setVelocidadNado(double velocidadNado) {
        this.velocidadNado = velocidadNado;
    }

    @Override
    public String toString() {
        return "[Pinguino] " + super.toString() + " | resiste: " + resistenciaFrioC
                + " C | nado: " + velocidadNado + " km/h";
    }
}
