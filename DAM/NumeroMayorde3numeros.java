import java.util.Scanner;
public class NumeroMayorde3numeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        int numeroMayor = numero1;

        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }

        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }

        System.out.println("El numero mayor es: " + numeroMayor);

        scanner.close();
    }
    
}
