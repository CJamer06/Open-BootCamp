public class App {
    public static void main(String[] args){

        int A = 0;
        int B = 6;

        A = A + 4; //Remplazar el valor de a por 20 y luego de finalizado el programa ejecuta otra ves pero cambia el valor por 40 en el debugger.

        System.out.println(A);

        System.out.println("------------------------------------------->");

        //Aca agregamos un condicional al breakpoint, a esto lo llamamos "Watcher" y lo que nos indica es que solo en un caso especifico este se activara el programa.

        B = B+A;

        System.out.println(B);

        System.out.println("------------------------------------------->");

        funcion1();

    }

    public static void funcion1(){
        funcion2();
    }

    public static void funcion2(){
        funcion3();
    }

    public static void funcion3(){
        funcion4();
    }

    public static void funcion4(){
        System.out.println("Este es un un super llamado");
        System.out.println("------------------------------------------->");
    }
}
