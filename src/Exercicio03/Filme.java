package Exercicio03;

public class Filme {
    public String titulo;
    public Enum genero;
    public int duracaoMinutos;
    public String horarioSessao;
    
    public double duracaoHoras(int d){
        return this.duracaoMinutos/60;
    }
    
    public void retornarHoraQueAcaba(){
        
    }
}
