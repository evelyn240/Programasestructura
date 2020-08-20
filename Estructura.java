package estructura;

import java.util.Scanner; 


public class Estructura {

  
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
            // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opt, tope = 0, tope2 = 0, tam1, tam2, aux = 0, x = 0, N, M;
        M=150;
        N=200;
        //double aleatoria = Math.random();
        int valorEntero = (int) Math.floor(Math.random()*(N-M+1)+M);
        int valorEntero2 = (int) Math.floor(Math.random()*(N-M+1)+M);
        Boolean encontrado = false;      
        System.out.println("ingresa el tamaño de la pila 1");
        int pila[] = new int[tam1 = sc.nextInt()];
         System.out.println("ingresa el tamaño de la pila 2");
        int pila2[] = new int[tam2 = sc.nextInt()];
        int pila3[] = new int[tam1 + tam2];
        do{
            System.out.println("1- agregar \n"
                    + "2- mostrar \n"
                    + "3- eliminar \n"
                    + "4- mostrar ultimos 3\n"
                    + "5- llenar\n"
                    + "6- vaciar\n"
                    + "7- Mostrar pila1 y pila2 \n"
                    + "8- salir ");
            switch(opt = sc.nextInt()){
                case 1:
                    if(tope < tam1){
                        System.out.println("tope = "+tope);
                        System.out.println("agregar elemento a la pila");
                        pila[tope] = sc.nextInt();
                        tope++;
                        System.out.println("tope = "+tope2);
                    } else { System.out.println("pila llena..");}
                break;
                case 2:
                    if(tope > 0){
                        System.out.println("contenido de pila 1");
                        for(int i = tope - 1; i >= 0; i--){
                            System.out.println("posicion: "+ i + " tiene el dato: "+ pila[i]);
                        }
                         System.out.println("contenido de pila 2");
                        for(int i = tope - 1; i >= 0; i--){
                            System.out.println("posicion: "+ i + " tiene el dato: "+ pila2[i]);
                        }
                         if (aux == 1) {
                            System.out.println("contenido de pila 3");
                            for (int i = 0; i < pila3.length; i++) {
                                System.out.println("posicion: " + i + " tiene el dato: " + pila3[i]);
                            }
                        }
                    } else {
                        System.out.println("pila vacia..");
                    }
                break;
                case 3:
                    System.out.println("dato eliminado...");
                    tope--;
                    System.out.println("tope = "+tope);
                break;
                case 4:
                    System.out.println("ultimos 3");
                    int cont = 0;
                        for(int i = tope - 1; i >= 0; i--){
                            System.out.println("posicion: "+ i + " tiene el dato: "+ pila[i]);
                            cont++;
                            if(cont == 3){
                                break;
                            }
                        }
                break;
                case 5:
                    System.out.println("Datos de la pila 1");
                    for(int i=0;i<tam1;i++){
                      valorEntero=(int) Math.floor(Math.random()*(N-M+1)+M);
                      System.out.println(valorEntero);  
                      pila[tope] = valorEntero;
                     tope++;
                    }
                    System.out.println("Datos de la pila 2");
                    for(int i=0;i<tam2;i++){
                        valorEntero2=(int) Math.floor(Math.random()*(N-M+1)+M);
                          }
                      
                          
                      do {
                          for(int i=0;i<tam2;i++){
                        valorEntero2=(int) Math.floor(Math.random()*(N-M+1)+M);
                        System.out.println(valorEntero2);  
                        pila2[tope2] = valorEntero2;
                        tope2++;
                        
                          }
                          break;
                         }
                        while (valorEntero2!=valorEntero);
                      
                      
                break;
                case 6:
                    for(int i=0;i<tam1;i++){
                        tope--;
                    }
                    System.out.println("pila vacia");
                break;
                case 7:
                    for (int i = 0; i < tam1; i++) {
                        pila3[i] = pila[i];
                        x++;
                    }
                    x = 0;
                    for (int i = tam1; i < tam1 + tam2; i++) {
                         pila3[i] = pila2[x];
                         x++;
                    }
                    aux = 1;
                    break;
            }
        }while(opt !=8);
    }
    
}