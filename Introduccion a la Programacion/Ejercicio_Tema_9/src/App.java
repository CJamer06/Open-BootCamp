public class App {
    public static void main(String[] args){

        Cliente cliente = new Cliente();
        
        cliente.setEdad(18);
        cliente.setNombre("Carlos Martinez");
        cliente.setTelefono(304342211);
        cliente.setCredito(500000);
        
        System.out.println("\n Cliente \nEdad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
        
        //----------------------------------------------------------------->

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(18);
        trabajador.setNombre("Jose Perez");
        trabajador.setTelefono(304342211);
        trabajador.setSalario(190);
        
        System.out.println("\n Trabajador \nEdad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Crédito: " + trabajador.getSalario());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    // SETTER
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // GETTER
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public long getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}