# Herencia - Seres Vivos

Ejercicio de Programacion Orientada a Objetos en Java que modela una jerarquia de seres vivos
en 4 niveles para practicar **herencia**, **clases abstractas**, **encapsulamiento** y **polimorfismo**.

## Diagrama UML

```mermaid
classDiagram
    direction TB

    class SerVivo {
        <<abstract>>
        -String nombreComun
        -String nombreCientifico
        -int edad
        -boolean estadoVital
        +SerVivo(String nombreComun, String nombreCientifico, int edad)
        +nacer() void
        +respirar() void
        +alimentar() void
        +morir() void
    }

    class Animal {
        -String dieta
        -String tipoDesplazamiento
        -int energia
        +desplazarse() void
        +emitirSonido() void
        +dormir() void
    }
    class Planta {
        -String tipoSuelo
        -double alturaMaxMetros
        -double nivelClorofila
        -boolean requiereSolDirecto
        +fotosintetizar() void
        +absorberAgua() void
        +crecer() void
    }

    class Invertebrado {
        -String tipoExoesqueleto
        -int numeroPatas
        -boolean poseeConcha
        +mudarCuticula() void
        +regenerarExtremidad() boolean
    }
    class Vertebrado {
        -int numeroVertebras
        -String tipoEsqueleto
        -String temperaturaSangre
        +regularTemperatura() void
        +sostenerPostura() void
    }
    class PlantaSinFlor {
        -String medioReproduccion
        -boolean presenciaVasos
        -double humedadOptima
        +liberarEsporas() void
    }
    class PlantaConFlor {
        -String temporadaFloracion
        -String colorFlor
        -boolean produceFruto
        -String tipoPolinizacion
        +florecer() void
        +madurarFruto() void
    }

    class Arana {
        -int cantidadOjos
        -String tipoVeneno
        +tejerTelarana() void
    }
    class Medusa {
        -double longitudTentaculos
        -boolean bioluminiscente
        +picar() void
    }
    class Gusano {
        -int numeroSegmentos
        -boolean subterraneo
        +cavar() void
    }
    class Pinguino {
        -double resistenciaFrioC
        -double velocidadNado
        +deslizarse() void
    }
    class Canguro {
        -double fuerzaSaltoMetros
        -boolean tieneCriaEnBolsa
        +saltar() void
    }
    class Pez {
        -int numeroAletas
        -String tipoAgua
        +nadarContracorriente() void
    }
    class Helecho {
        -String tipoFronda
        +desplegarFronda() void
    }
    class Musgo {
        -double espesorCojinCm
        +retenerHumedad() void
    }
    class Croton {
        -String patronColorHojas
        +pigmentarHojas() void
    }
    class Pera {
        -String variedadPera
        -double contenidoAzucarBrix
        +cosechar() void
    }
    class Pino {
        -String tipoConoOEstrobilo
        -double produccionResinaMl
        +soltarPinas() void
    }
    class Durazno {
        -String texturaPiel
        -double pesoPromedioFrutoG
        +generarHueso() void
    }

    SerVivo <|-- Animal
    SerVivo <|-- Planta
    Animal <|-- Invertebrado
    Animal <|-- Vertebrado
    Planta <|-- PlantaSinFlor
    Planta <|-- PlantaConFlor
    Invertebrado <|-- Arana
    Invertebrado <|-- Medusa
    Invertebrado <|-- Gusano
    Vertebrado <|-- Pinguino
    Vertebrado <|-- Canguro
    Vertebrado <|-- Pez
    PlantaSinFlor <|-- Helecho
    PlantaSinFlor <|-- Musgo
    PlantaSinFlor <|-- Croton
    PlantaConFlor <|-- Pera
    PlantaConFlor <|-- Pino
    PlantaConFlor <|-- Durazno
```
