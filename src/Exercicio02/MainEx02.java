package Exercicio02;

import java.util.Scanner;

public class MainEx02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int multiplicando;
        int inicio;
        int fim;
        boolean aceito = false;
        
        do{
            System.out.println("Digite o valor do multiplicando");
            multiplicando = entrada.nextInt();
            if (multiplicando > 0){
                aceito = true;
                
            } else {
                System.out.println("Valor invalido.Digite novamente");
                
            }
        } while( aceito == false );
        
        aceito = false;
        
        do {
            System.out.println("Digite o valor de inicio do intervalo");
            inicio = entrada.nextInt();
            System.out.println("Digite o fim do intervalo");
            fim = entrada.nextInt();
            if ((inicio < 0)|| (inicio > 3000) || (fim > 3000)|| (fim < inicio)){
                System.out.println("intervalo invalido. digite novamente");
            } else{
                aceito = true;
            }
        } while (aceito == false);
        
        System.out.println("Multiplicando: "+multiplicando);
        System.out.println("Inicio do intervalo: "+inicio);
        System.out.println("Fim do intervalo: "+fim);
        
        if (inicio >= fim){
            System.out.println("O inicio do intervalo deve ser menor que o seu fim");
        } else if (fim - inicio <= 9){
            for (int i= inicio; i <= fim;i++){
            System.out.println(multiplicando+" x "+ i+ " = "+ multiplicando*i);
        } 
                
            }else{
            System.out.println("ERRO - o intervalo deve ser menor que 10");
            
        
        
        }
    }
    
}
