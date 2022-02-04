package Exercicio04;

public class Veiculo {
    public String nome;
    public String marca;
    public int capacidadeDoTanque;
    public int litrosNoTanque;
    

    public Veiculo(String nome, String marca, int capacidadeDoTanque) {
        this.nome = nome;
        this.marca = marca;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.litrosNoTanque = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public int getLitrosNoTanque() {
        return litrosNoTanque;
    }

    public void setLitrosNoTanque(int litrosNoTanque) {
        this.litrosNoTanque = litrosNoTanque;
        
    }
    
    public void abastecer(int a){
        float valor;
        if (getLitrosNoTanque() + a > getCapacidadeDoTanque()){
            int excesso = (getLitrosNoTanque() + a) - getCapacidadeDoTanque();
            System.out.println("Tanque cheio! Excedendo a capacidade do tanque em: "+excesso);
        } else{
            if (getLitrosNoTanque() + a == getCapacidadeDoTanque()){
                setLitrosNoTanque(getLitrosNoTanque() + a);
                System.out.println("Tanque completo com : "+getLitrosNoTanque());
                valor = a * 7.00f;
                System.out.println("Valor total do abastecimento: R$ "+ valor);
            }else{
                System.out.println("Quantidade de litros no tanque: "+getLitrosNoTanque());
            valor = a * 7.00f;
            System.out.println("Valor total do abastecimento: R$ "+ valor);
            }
        }
        
    }

    @Override
    public String toString() {
        return "Veiculo{" + "nome=" + nome + ", marca=" + marca + ", capacidadeDoTanque=" + capacidadeDoTanque + ", litrosNoTanque=" + litrosNoTanque + '}';
    }
}
