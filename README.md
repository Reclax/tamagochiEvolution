# tamagochiEvolution

Juego de escritorio Java inspirado en un Tamagotchi. El jugador registra o
inicia una sesión y cuida una mascota virtual mediante distintas habitaciones
y acciones.

## Funcionamiento

`Main.Main` inicia la aplicación. `Tamagochi` y `Jugador` modelan el estado del
juego, `Controles` gestiona las acciones y `Guardados` persiste la partida.
Las interfaces de cocina, patio, sala, baño y cuarto representan los espacios
en los que se interactúa con la mascota.

## Requisitos e instalación

- JDK 8 o posterior.
- Ant o NetBeans.

```bash
git clone https://github.com/Reclax/tamagochiEvolution.git
cd tamagochiEvolution
ant clean jar
java -jar dist/AProyectoV2.jar
```

El juego utiliza archivos locales, por lo que debe conservarse el archivo de
datos junto al programa cuando se quiera mantener el progreso.

## Estructura

- `src/Main`: punto de entrada.
- `src/proyecto`: dominio, controles y guardado.
- `src/Interfaces`: pantallas del juego.
- `nbproject`: configuración NetBeans.
