package ordennombres;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ordennombres {
    
    public static void main(String[] args) {
       List nombres = new LinkedList<>();

        Scanner sc = new Scanner(System.in);   
        int opt, tam1, tope=0;
        String aux = null;
        Boolean encontrado = false;
        System.out.println("ingresa el tamaño de la pila uno");
        String pila[] = new String[tam1 = sc.nextInt()];
                       
        do {
            System.out.println("1- llenar \n"
                    + "2- mostrar \n"
                    + "3- eliminar \n"
                    + "4- ordenar\n"
                    + "5 salir ");
            switch (opt = sc.nextInt()) {
                case 1:
        for (int i = 0; i < pila.length; i++) {
            if (tope < tam1) {
                        System.out.println("tope = " + tope);
                        System.out.println("nombre:");
                        pila[i] = sc.next();
                        tope++;
                        System.out.println("" + tope);
                    } else {
                        System.out.println("pila llena..");
                    } 
        }
                break;
                case 2:
                     System.out.println("contenido de pila 1");
                    for (int i = tope - 1; i >= 0; i--) {
                        System.out.println("posicion: " + i + " tiene el dato: " + pila[i]);
                    }
                    break;
                case 3:
            for (int j = 0; j < 0; j++) {
            for (int i = 0; i < 0 - j; i++) {
                if (pila[i].compareTo(pila[i + 1]) > 0) {
                   
                    aux = pila[i];
                    pila[i] = pila[i + 1];
                    pila[i + 1] = aux;
                }
            }
        }
    
                    break;
                case 4:
            nombres.add(aux);
            Collection.sort(nombres);
        System.out.println("NOMBRES:");
        System.out.println("ORDENADOS DE A - Z");
            for (String pila1 : pila) {
                System.out.println(pila1);
            }
                    break;
            }  
        } while (opt != 5);
        
    }
    
}
