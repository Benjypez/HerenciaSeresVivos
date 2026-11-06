package pkgSeresVivos;

public abstract class SerVivo {
    private String nombreComun;
    private String nombreCientifico;
    private int edad;
    private boolean estadoVital;

    public SerVivo(String nombreComun, String nombreCientifico, int edad) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        setEdad(edad);
        this.estadoVital = true;
    }

    public void nacer() {
        estadoVital = true;
        System.out.println(nombreComun + " (" + nombreCientifico + ") ha nacido.");
    }

    public void respirar() {
        if (verificarVida()) {
            System.out.println(nombreComun + " esta respirando.");
        }
    }

    public void alimentar() {
        if (verificarVida()) {
            System.out.println(nombreComun + " se esta alimentando.");
        }
    }

    public void morir() {
        estadoVital = false;
        System.out.println(nombreComun + " ha muerto.");
    }

    protected boolean verificarVida() {
        if (!estadoVital) {
            System.out.println(nombreComun + " no puede hacer eso porque esta muerto.");
        }
        return estadoVital;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = Math.max(edad, 0);
    }

    public boolean isEstadoVital() {
        return estadoVital;
    }

    public void setEstadoVital(boolean estadoVital) {
        this.estadoVital = estadoVital;
    }

    @Override
    public String toString() {
        return nombreComun + " (" + nombreCientifico + ") | edad: " + edad
                + " | vivo: " + (estadoVital ? "si" : "no");
    }
}
