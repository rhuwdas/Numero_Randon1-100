import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Inicialización
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        int intentosMaximos = 10;
        int intentosRealizados = 0;
        Scanner scanner = new Scanner(System.in);
        int numeroIntroducido;
        boolean adivinado = false;
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He generado un número aleatorio entre 1 y 100.");
        System.out.println("Tienes " + intentosMaximos + " intentos para adivinarlo.");

        // 2. Bucle principal del juego
        while (intentosRealizados < intentosMaximos && !adivinado) {
            intentosRealizados++;

            // Pedir al usuario que introduzca un número
            System.out.print("Intento " + intentosRealizados + ": Introduce un número: ");
            numeroIntroducido = scanner.nextInt();

            // Comprobar si el número introducido es correcto
            if (numeroIntroducido == numeroAleatorio) {
                adivinado = true;
            } else if (numeroIntroducido < numeroAleatorio) {
                System.out.println("El número a adivinar es MAYOR.");
            } else {
                System.out.println("El número a adivinar es MENOR.");
            }
        }

        // 3. Resultado final
        if (adivinado) {
            System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
        } else {
            System.out.println("¡Lo siento! Has agotado todos tus intentos.");
            System.out.println("El número era: " + numeroAleatorio);
        }

        scanner.close(); // Cerrar el scanner para liberar recursos
    }
}

