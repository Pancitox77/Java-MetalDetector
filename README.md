# Inicio

MetalDetector es una aplicación enfocada a los "detectoristas", quienes usan detectores de metales.
La aplicación en sí es un registro, donde se guardan datos del objeto, como el tipo, material, fecha, hora, etc.

## Estructura de las Carpetas

El espacio contiene las siguientes carpetas:

- `src`: La carpeta principal, donde se guardan las librerías propias, la app principal, y otras subcarpetas.
- `lib`: La carpeta que contiene las dependencias.
- `javafx-sdk-19`: La carpeta con el código de la librería JavaFX, esencial para el funcionamiento de los componentes.
- `bin`: La carpeta donde se guardan los archivos binarios y compilados (la salida de la compilación)

## Dependencias

La aplicación usa el código extraído de la carpeta `javafx-sdk-19`, que viene en la app. No es necesario instalar nada más.

## Ejecutar JAR

En una terminal, ejecutar:

'''sh
java --module-path javafx-sdk-19/lib --add-modules javafx.controls,javafx.fxml -jar MetalDetector.jar
'''