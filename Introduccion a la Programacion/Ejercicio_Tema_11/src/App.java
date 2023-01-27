public class App {
    public static void main(String[] args) {
        Coche coche = new Coche();

        EjecutarAcelerar(coche);
        /*
        Coche coche = new Coche();

        System.out.println("Aceleremos 50");
        coche.Acelerar(50);
        System.out.println("La velocidad del coche es: " + coche.velocidad);

        System.out.println("\nFrenemos 25");
        coche.Frenar(25);
        System.out.println("La velocidad del coche es: " + coche.velocidad); */
    }

    public static void EjecutarAcelerar (Vehiculo vehiculo){
        vehiculo.Acelerar(50);
    }
}

interface Vehiculo {
    void Acelerar (int cuantaVelocidad);
    void Frenar (int cuantaVelocidad);
    
}

class Coche implements Vehiculo{

    public void Acelerar (int cuantaVelocidad){

    }
    
    public void Frenar (int cuantaVelocidad){

    }


    /* public int velocidad;
    public void Acelerar (int cuantaVelocidad){
        velocidad += cuantaVelocidad;
    }
    public void Frenar (int cuantaVelocidad){
        velocidad -= cuantaVelocidad;
    } */
}