public class App {
    public static void main(String[] args){
        //Instanciar
        Coche coche = new Coche();
        Coche miCoche = new Coche(2, 250);

        System.out.println("Coche");
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.getVelocidadMaxima());

        System.out.println("\nMi coche");
        System.out.println(miCoche.numeroDePuertas);
        System.out.println(miCoche.getVelocidadMaxima());
    }
}

class Coche{
    //Atributos
    public int numeroDePuertas; // Se puede acceder desde fuera de la clase.
    private int velocidadMaxima; // Solo se puede acceder desde dentro de la clase.

    //Constructores

    public Coche(){ //Constructor inicial
        numeroDePuertas = 4;
        velocidadMaxima = 150;
    }

    public Coche(int numeroDePuertas, int velocidadMaxima){
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Métodos
    public void acelerar(){}
    public void desacelerar(){}

    //SETTER y GETTER
   public void setVelocidadMaxima(int velocidadMaxima) { // Modificador de las variables private
       this.velocidadMaxima = velocidadMaxima;
   }

   public int getVelocidadMaxima() { // Visualizador de las variables
       return velocidadMaxima;
   }
}
