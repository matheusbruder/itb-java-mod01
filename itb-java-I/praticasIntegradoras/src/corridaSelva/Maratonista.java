package corridaSelva;

public class Maratonista {
    private static int NUM = 1;
    private int codigo;
    private int RG;
    private String nome;
    private String sobrenome;
    private int idade;
    private long numeroCelular;
    private long numeroEmergencia;
    private String grupoSanguineo;

    // Construtor
    public Maratonista(int RG, String nome, String sobrenome, int idade, long numeroCelular,
                       long numeroEmergencia, String grupoSanguineo) {

        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
    }


    @Override
    public String toString() {
        return "Maratonista{" +
                "código=" + codigo +
                ", RG=" + RG +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", numeroCelular=" + numeroCelular +
                ", numeroEmergência=" + numeroEmergencia +
                ", grupoSanguíneo='" + grupoSanguineo + '\'' +
                '}';
    }

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setCodigo() {
        if (this.getCodigo() == 0) {
            this.codigo = Maratonista.NUM;
            Maratonista.NUM += 1;
        }
    }

    public int getCodigo() {
        return codigo;
    }
}
