import java.util.Scanner;

public class TablasdeMultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
            System.out.print("Ingrese un numero para generar su tabla de multiplicar: ");
            int numero = scanner.nextInt(); // Aqui se guarda el numero que el usuario ingresó
            
            // Imprimir un titulo para ayudar a la presentación
            System.out.println("---Tabla del " + numero+ "---");

            // El bucle for para generar la tabla del 1 al 10
            for (int i = 1; i <= 10; i++) {
                // Calclar y mostrar el resultado en cada vuelta
                int resultado = numero * i;
                System.out.println(numero+ " X " + i + " = " + resultado);
            }
            // Cerramos scanner para liberar memoria
            scanner.close();
        }
    }

