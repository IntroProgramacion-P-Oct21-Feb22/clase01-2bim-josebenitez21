/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
import java.util.Scanner;

public class Ejemplo013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite;
        System.out.println("Ingrese el límite que desea");
        limite = entrada.nextInt();
        for (int i = 0; i < limite; i++) {
            System.out.printf("%d\n", i);
        }

    }

}
