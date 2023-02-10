# ConvertirMoneda
## Etapa 01. Descripcion del problema  del problema 
Se requiere un programa en Java para convertir una cantidad de dinero en otros tipos de monedas (al menos a cinco tipos de monedas distintas). 
## Etapa 02. Definicion de la solución

~~~

-Datos de entrada
    String moneda1="Dolar";
    String  moneda2= "PesoMX";
    String moneda3="Quetzal";
    String moneda4="Libra Egipcia";
    String moneda5 ="Franco Suizo";
    String moneda6="Peso Cubano";
    double conversion;



-Proceso
Creacion de metodos con parametros que reciban la cantidad
de tipo float los cuales por cada conversion de moneda se ejecutaran
segun sea el caso.

Se utilizara un Switch case con interfaces secillas de Joptionpane
para la seleccion de dicha conversion por opciones 

Ya que se seleccione una conversion se mandara a traer el  metodo 
por medio de la creación de un objeto para la Clase conversion moneda
aqui existira otra variable tipo float para atrapar la cantidad ingresada y se lleve acabo la conversion   





-Salida
 +----------------------------+
 |       Dolar      | 20      | 
 +----------------------------+
 |      PesoMX      |  377.59 |     
 +----------------------------+
 
 ~~~
 
 ##Etapa 03 . Diseño de solución
 ![](https://github.com/Cristopher2023/ConvertirMoneda/blob/master/Diagrama%20de%20Clases.png)
