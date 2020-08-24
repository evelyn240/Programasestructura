
package colas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Colas {
   int iTope=-1;
    char simbolos[];

    Colas(){
        int x=0;
        simbolos=new char[x];
    }
    public boolean llena(){
       return iTope==simbolos.length-1;
    }
    public boolean vacia(){
       return iTope==-1;
    }
    public void push(){
        char dato = 0;
        if(llena()==true){
            System.out.print("Overflow");
        }
        else{
            iTope++;
            simbolos[iTope]=dato;
        }
    }
    public char pop(){
        char aux = 0;
        if(vacia()==true){
            System.out.println("Empty");
        }
        else{
            aux = simbolos[iTope];
            iTope--;
        }
        return aux;
    }
public static void main(String[] args)throws IOException{
     int opt, m=0;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("ingresa el tamaño de la cola");
        m = sc.nextInt();
        Colas c  = new Colas(x); 
        int validarpop = 0;
        int validarpush=0;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String sIngreso;

        Colas ps = new Colas();

                          
        System.out.println("Ingresa cadena: ");
        sIngreso= buff.readLine();

        for(int iCont=0; iCont<sIngreso.length(); iCont++){

            System.out.println(sIngreso.charAt(iCont));
            if(sIngreso.charAt(iCont)=='{'){
                ps.push();
                validarpush++;
            }
            if(sIngreso.charAt(iCont)=='['){
                ps.push();
                validarpush++;
            }
            
            if(sIngreso.charAt(iCont)=='('){
                ps.push();
                validarpush++;
            }
            if(sIngreso.charAt(iCont)==')'){
                ps.pop();
                validarpop++;
            }
            if(sIngreso.charAt(iCont)==']'){
                ps.pop();
                validarpop++;
            }
            if(sIngreso.charAt(iCont)=='}'){
                ps.pop();
                validarpop++;
            }
        }   
        if(ps.vacia()==true && validarpop == validarpush){
            System.out.println("Entrada valida");
        }
        
        else{
                System.out.println("Entrada Erronea");
        }
           
    } 
    
}
