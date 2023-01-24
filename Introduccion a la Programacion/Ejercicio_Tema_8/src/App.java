public class App {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(18);
        persona.setNombre("Carlos Martinez");
        persona.setTelefono(304342211);
        
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    
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
