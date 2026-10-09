import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        
        // 1: Presparar el codigo para la lectura de los datos
        Scanner scanner = new Scanner(System.in);

        // 2: Pedir el numero al usuario
        System.out.println("Ingrese un numero para calcular su factorial: ");
        int numero = scanner.nextInt();

        // 3: Inicializar las variables clave
        long factorial = 1;
        int i = 1;

        // 4: Realizamos el bucle while
        while (i <= numero) {
            // 5: Multiplicar y acumular
            factorial = factorial * i;
            i++;
        }

        // 6: Mostrar el resultado final
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
