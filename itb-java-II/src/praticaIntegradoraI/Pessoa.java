package praticaIntegradoraI;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private String ID;
    private double peso;
    private double altura;

    // Contrutores
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos
    public double calcularIMC() {
       double imc = getPeso() / Math.pow(getAltura(), 2.0);
       if (imc < 20) {
           return -1;
       } else {
           if (imc < 26) {
               return 0;
           } else {
               return 1;
           }
       }
    }

    public boolean ehMaiorIdade() {
        return getIdade() > 18;
    }

    @Override
    public String toString() {
        return "ID= " + this.ID + "; Nome= " + this.nome + "; Idade= " + this.idade + "; Peso (Kg)= " + this.peso + "; Altura (m)= " + this.altura;
    }

    // Getters and Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
