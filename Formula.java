import java.util.Scanner;
public class Formula {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        double a,b,c; 
        double X0,X1; 
        System.out.println("Valor a:");
        a = f.nextDouble();
        System.out.println("Valor b:");
        b = f.nextDouble();
        System.out.println("Valor c:");
        c = f.nextDouble();
        double numero = (b*b) - (4*a*c);
        if(numero > 0) {
            X0 = (-b + Math.sqrt(numero)) / 2*a;
            X1 = (-b - Math.sqrt(numero)) / 2*a;
            System.out.println("La ecuacion tiene dos soluciones");
            System.out.println("X0:"  +X0);
            System.out.println("X1:"  +X1);
        }else {
            if(numero == 0) {
           X0 = (-b) / 2*a;
               System.out.println("La unica solucion es:");  
               System.out.println("X0:"  +X0);
            } else {
                System.out.println("La ecuacion no tien solucion");
            }
        }
        
    }
    
}