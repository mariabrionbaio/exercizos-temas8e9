/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema8.cuentas;

import java.util.Scanner;

public class MainCuenta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CuentaPlazo cuenta = new CuentaPlazo("654646");

        int opcion;
        do {
            System.out.println("\n1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cantidad a ingresar: ");
                    cuenta.ingresar(sc.nextFloat());
                    break;
                case 2:
                    System.out.print("Cantidad a retirar: ");
                    cuenta.retirar(sc.nextFloat());
                    break;
                case 3:
                    System.out.println("Saldo: " + cuenta.getSaldo());
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
    
}
