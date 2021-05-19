/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainResponsability;

import java.util.Scanner;

/**
 *
 * @author ASUS PC
 */
public class TallerChainResponsability {
    
private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Permiso permiso = new Permiso();
  
        int opcion;
        int dias = 0;

        do {

            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese los dias de permiso:");
                    dias=Integer.parseInt(sc.nextLine());
                    permiso.permisoNormal(dias);
                    break;
                case 2:
                    System.out.print("Ingrese los dias de permiso:");
                    dias=Integer.parseInt(sc.nextLine());
                    permiso.permisoEspecial(dias);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 0);
    }
    private static int menu() {
        System.out.print(
                "\n1. Permiso Normal"
                + "\n2. Permiso Especial \n"
        );
        return Integer.parseInt(sc.nextLine());
    }
}
