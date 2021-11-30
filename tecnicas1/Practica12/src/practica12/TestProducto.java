
package practica12;

import java.util.Scanner;


public class TestProducto {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese fecha de caducidad:");
        String caducidad = sc.nextLine();
        System.out.print("Ingrese número de lote:");
        int lote = sc.nextInt();
        System.out.print("Ingrese temperatura de congelado:");
        int temperatura = sc.nextInt();
        System.out.println("------------------------------");
        PCongelado pcongelado1 = new PCongelado(caducidad,lote);
        
        pcongelado1.settemperaturaR(temperatura);
        
        pcongelado1.mostrarCongelado();
        
        System.out.println("------------------------------");
    }
}
