public class Sumadelosprimeros50numeros {

    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            suma += i;
        }
        System.out.println("La suma de los primeros 50 números es: " + suma);
    }
}
