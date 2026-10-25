package entregas.filiaggiMariano.reto_002;

import java.util.Scanner;

public class DevolverCambio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int costoTotal = scanner.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int pagoTotal = scanner.nextInt();

        int cambio = pagoTotal - costoTotal;

        System.out.println(cambio);
    }
}