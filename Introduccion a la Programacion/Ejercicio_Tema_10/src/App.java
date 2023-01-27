public class App {
    public static void main(String[] args){
        /* GT sparkGt = new GT(); // Podemos por medio de esto acceder a los atributos y métodos de las demás clases.

        sparkGt.setMatricula("XWR456");
        sparkGt.setTipoGasolina("ACPM");
        sparkGt.setVelocidadMaxima(250); */

        GT sparkGt = new GT("XWR456","ACPM",250,2,4);
    
        System.out.println(sparkGt.getMatricula()); // Este método le pertenece a la clase Vehículo.
        System.out.println(sparkGt.getVelocidadMaxima());
        System.out.println(sparkGt.getTipoGasolina());
        System.out.println(sparkGt.getNumeroPuertas());

        MotoElectrica moto = new MotoElectrica("MLN432","CORRIENTE",150);
    
        System.out.println(moto.getMatricula()); // Este método le pertenece a la clase Vehículo.
        System.out.println(moto.getVelocidadMaxima());
        System.out.println(moto.getTipoGasolina());
        System.out.println(moto.getNumeroRuedas());
    }
}


abstract class Vehiculo { // No se puede crear una instancia de esta clase, por ende solo la usare para heredar.
    private int velocidadMaxima;
    private String tipoGasolina;
    private String matricula;
    private int numeroRuedas;

    // GETTER
    public String getMatricula() {
        return matricula;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }
    

    //  SETTERS
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
}

class Moto extends Vehiculo{
    private String tipoBateria;

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Moto() {
        super.setNumeroRuedas(2);
    }
}

class Coche extends Vehiculo{ // "extends" es una palabra reservada, que indica de quien hereda esta nueva clase.
    //Hereda todo lo de Vehículo

    private int numeroPuertas;

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}


final class GT extends Coche{ // Esta es una clase de la que no se puede heredar.

    public GT(String matricula, String tipoGasolina, int velocidadMaxima, int numeroPuertas, int numeroRuedas) {
        super.setMatricula(matricula);
        super.setTipoGasolina(tipoGasolina);
        super.setVelocidadMaxima(velocidadMaxima);
        super.setNumeroPuertas(numeroPuertas);
        super.setNumeroRuedas(numeroRuedas);
    }
    // Hereda todo lo de Coche que a su ves tiene todo lo de vehículo
}

/* class Electrica {
    private String tipoBateria;

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }
} */

final class MotoElectrica extends Moto{ // Esta es una clase de la que no se puede heredar.

    public MotoElectrica (String matricula, String tipoBateria, int velocidadMaxima) {
        super.setMatricula(matricula);
        super.setTipoBateria(tipoBateria);
        super.setVelocidadMaxima(velocidadMaxima);
        new Moto();
    }
    // Hereda todo lo de Moto que a su ves tiene todo lo de vehículo
}

// Polimorfismo, es la capacidad de una clase hija de sobre escribir una misma función de una clase padre.
