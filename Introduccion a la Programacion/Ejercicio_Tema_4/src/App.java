public class App {
    public static void main(String[] args) throws Exception {
        
        /* Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0. 
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

        int numeroIf = 10;

        if(numeroIf > 0){
            System.out.println("-> Valor Positivo <-");
        }else if(numeroIf < 0){
            System.out.println("-> Valor negativo <-");
        }else {
            System.out.println("-> Valor igual a 0 <-");
        }

        System.out.println("\n---------------------------------------------------");

        /* Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá: 
            - Incrementar el valor de la variable en uno cada vez que se ejecute.
            - Mostrarlo por pantalla cada vez que se ejecute.
        */

        int numeroWhile = 0; 

        while(numeroWhile < 3){
            System.out.println("El valor dela variable es: " + numeroWhile);
            numeroWhile++;
        }

        System.out.println("\n---------------------------------------------------");

        /* Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez. */

        numeroWhile = 0;
        do {
            System.out.println("El valor dela variable es: " + numeroWhile);
            break;
        } while (numeroWhile < 3);

        System.out.println("\n---------------------------------------------------");

        /* Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla. */

        int numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor dela variable es: " + numeroFor);
        }
        

        System.out.println("\n---------------------------------------------------");
        /* Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación. */

        int estacion = 3;

        switch (estacion) {
            case 1:
                System.out.println("-> Primavera <-");
                break;

            case 2:
                System.out.println("-> Verano <-");
                break;

            case 3:
                System.out.println("-> Otoño <-");
                break;

            case 4:
                System.out.println("-> Invierno <-");
                break;

            default:
                System.out.println("-> Valor no valido <-");
                break;
        }
    }
}
