# Método de Gauss

Práctica de la Unidad 3 — SCC-1017 Métodos Numéricos
Instituto Tecnológico Superior de Xalapa

## Lenguaje
Java (JDK 17 o superior)

## Estructura
- `Main.java`: clase principal.
- `LectorDatos.java`: lectura del sistema por consola.
- `Gauss.java`: eliminación de Gauss con pivoteo parcial y sustitución hacia atrás.
- `Utilidades.java`: impresión de matrices y soluciones.

## Compilar y ejecutar

### Con IntelliJ IDEA
1. Abrir la carpeta del proyecto.
2. Abrir `Main.java` y presionar el botón Run (▶).

### Con terminal
```bash
cd src
javac *.java
java Main
```

## Ejemplo de prueba

Sistema:
```
2x + y - z = 8
-3x - y + 2z = -11
-2x + y + 2z = -3
```

Entrada y salida:
```
Número de ecuaciones: 3
Ecuación 1 (3 coeficientes y el término independiente):
2 1 -1 8
Ecuación 2 (3 coeficientes y el término independiente):
-3 -1 2 -11
Ecuación 3 (3 coeficientes y el término independiente):
-2 1 2 -3

Solución:
x1 = 2.000000
x2 = 3.000000
x3 = -1.000000
```