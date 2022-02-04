package Exercicio01;

import java.util.Scanner;

public class MainEx01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int cont, pares = 0;
        System.out.println("Entre com um numero entre 1000 e 9999");
        numero = entrada.nextInt();
        
        if (numero < 1000 || numero > 9999){
            System.out.println("Numero Invalido");
        } else{
            while(numero != 0){
                if ((numero %10)%2 ==0){
                    pares ++;
                }
                numero = numero/10;
            }
        }
        System.out.println("Numero de pares: "+ pares);
            
            
    }     
        
    
}
