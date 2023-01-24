class App2{
    public static void main(String[] args) {
        Coche Coche = new Coche();
        Coche miCoche = new Coche();

        System.out.println("\nNumero de puertas de un coche : " + Coche.getNumeroPuertas());
        System.out.println("\nMi coche tiene " + miCoche.numeroPuertas + " puertas");
        System.out.println("-> Le añado una puerta mas a mi coche <-");
        miCoche.sumaPuertas(miCoche);
            System.out.println("Mi coche tiene " + miCoche.numeroPuertas + " puertas\n");
    }
}

class Coche {
    public int numeroPuertas = 4;

    public void sumaPuertas(Coche Coche){
        Coche.numeroPuertas += 1;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
