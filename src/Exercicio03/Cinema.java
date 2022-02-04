package Exercicio03;

import java.util.List;
import java.util.Scanner;
public class Cinema {
    public String nome;
    public Filme endereco;
    public List<Filme> filmesEmCartaz;
    
    public void adicionarFilme(Filme f){
        this.filmesEmCartaz.add(f);
        System.out.println(this.filmesEmCartaz.toString());
    }
    public void removerFilme(Filme f){
        String resposta = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deseja mesmo remover este filme? ");
        resposta = entrada.nextLine();
        if( resposta.equalsIgnoreCase("s")){
            this.filmesEmCartaz.remove(f);
        }
        
        
    }
    public void listarFilmes(){
        this.filmesEmCartaz.toString();
    }
    
}
