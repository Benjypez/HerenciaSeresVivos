import pkgSeresVivos.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===== JERARQUIA DE SERES VIVOS =====\n");

        Arana arana = new Arana("Viuda negra", "Latrodectus mactans", 1,
                "carnivora", "caminar", 80,
                "quitina", 8, false,
                8, "neurotoxico");
        Medusa medusa = new Medusa("Medusa luna", "Aurelia aurita", 1,
                "carnivora", "propulsion", 70,
                "ninguno", 0, false,
                0.5, true);
        Gusano gusano = new Gusano("Lombriz de tierra", "Lumbricus terrestris", 2,
                "detritivora", "reptar", 60,
                "ninguno", 0, false,
                150, true);

        Pinguino pinguino = new Pinguino("Pinguino emperador", "Aptenodytes forsteri", 10,
                "piscivora", "nadar", 90,
                40, "oseo", "caliente",
                -60.0, 9.0);
        Canguro canguro = new Canguro("Canguro rojo", "Osphranter rufus", 6,
                "herbivora", "saltar", 85,
                50, "oseo", "caliente",
                8.0, true);
        Pez pez = new Pez("Salmon del Atlantico", "Salmo salar", 4,
                "carnivora", "nadar", 75,
                58, "oseo", "fria",
                8, "dulce y salada");

        Helecho helecho = new Helecho("Helecho comun", "Pteridium aquilinum", 3,
                "acido y humedo", 2.0, 1.8, false,
                "esporas", true, 80.0,
                "bipinnada");
        Musgo musgo = new Musgo("Musgo de turbera", "Sphagnum palustre", 1,
                "turboso", 0.1, 1.2, false,
                "esporas", false, 95.0,
                5.0);
        Croton croton = new Croton("Croton", "Codiaeum variegatum", 2,
                "franco y bien drenado", 3.0, 1.5, true,
                "esquejes", true, 60.0,
                "jaspeado amarillo, rojo y verde");

        Pera pera = new Pera("Peral", "Pyrus communis", 8,
                "franco arcilloso", 12.0, 2.1, true,
                "primavera", "blanco", true, "entomofila",
                "Williams", 12.5);
        Pino pino = new Pino("Pino radiata", "Pinus radiata", 25,
                "arenoso", 30.0, 2.3, true,
                "primavera", "sin petalos", false, "anemofila",
                "cono lenoso", 250.0);
        Durazno durazno = new Durazno("Duraznero", "Prunus persica", 5,
                "franco arenoso", 7.0, 2.0, true,
                "primavera", "rosado", true, "entomofila",
                "aterciopelada", 150.0);

        System.out.println("----- 1) Polimorfismo con SerVivo[] -----");
        SerVivo[] seres = { arana, medusa, gusano, pinguino, canguro, pez,
                            helecho, musgo, croton, pera, pino, durazno };
        for (SerVivo s : seres) {
            System.out.println(s);
            s.respirar();
            s.alimentar();
            System.out.println();
        }

        System.out.println("----- 2) Polimorfismo con Animal[] -----");
        Animal[] animales = { arana, medusa, gusano, pinguino, canguro, pez };
        for (Animal a : animales) {
            a.emitirSonido();
            a.desplazarse();
        }

        System.out.println("\n----- 2) Polimorfismo con Planta[] -----");
        Planta[] plantas = { helecho, musgo, croton, pera, pino, durazno };
        for (Planta p : plantas) {
            p.fotosintetizar();
            p.absorberAgua();
            p.crecer();
        }

        System.out.println("\n----- 3) Metodos de Invertebrado / Vertebrado -----");
        arana.mudarCuticula();
        medusa.mudarCuticula();
        System.out.println("Regenero? " + arana.regenerarExtremidad());
        pinguino.regularTemperatura();
        pez.regularTemperatura();
        canguro.sostenerPostura();

        System.out.println("\n----- 3) Metodos de PlantaSinFlor / PlantaConFlor -----");
        helecho.liberarEsporas();
        musgo.liberarEsporas();
        pera.florecer();
        pino.florecer();
        durazno.madurarFruto();
        pino.madurarFruto();

        System.out.println("\n----- 4) Metodos propios de cada especie -----");
        arana.tejerTelarana();
        medusa.picar();
        gusano.cavar();
        pinguino.deslizarse();
        canguro.saltar();
        pez.nadarContracorriente();
        helecho.desplegarFronda();
        musgo.retenerHumedad();
        croton.pigmentarHojas();
        pera.cosechar();
        pino.soltarPinas();
        durazno.generarHueso();

        System.out.println("\n----- 5) Ciclo de vida -----");
        canguro.dormir();
        pez.morir();
        pez.nadarContracorriente();
        pez.nacer();
        pez.nadarContracorriente();
    }
}
