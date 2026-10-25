package entregas.filiaggiMariano.reto_002;

import java.util.Scanner;

public class DevolverCambioCentimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int costoTotal = (int) Math.round(scanner.nextDouble() * 100);

        System.out.println("¿Con cuántos euros paga?");
        int pagoTotal = (int) Math.round(scanner.nextDouble() * 100);

        int cambio = pagoTotal - costoTotal;

        

    }
}
