import java.util.Scanner;

public class App1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int val1 = 0;
        int val2 = 0;
        int val3 = 0;

        System.out.print("Digite el valor numero 1: ");
        val1 = input.nextInt();

        System.out.print("Digite el valor numero 2: ");
        val2 = input.nextInt();

        System.out.print("Digite el valor numero 3: ");
        val3 = input.nextInt();

         Suma(val1, val2, val3);
    }

    public static void Suma(int valor1, int valor2, int valor3){
        System.out.println("La suma de los valores es: " + (valor1 + valor2 + valor3));
    }
}
