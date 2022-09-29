package corridaSelva;

public class Inscricao {
    private Maratonista maratonista;
    private String categoria;
    private int valorInscricao;

    public Inscricao(Maratonista maratonista, String categoria) {
        this.maratonista = maratonista;
        this.categoria = categoria;
        this.valorInscricao = setValorInscricao(maratonista, categoria);
    }


    // Getters and setters

    public Maratonista getMaratonista() {
        return maratonista;
    }

    public int getValorInscricao() {
        return valorInscricao;
    }

    public int setValorInscricao(Maratonista maratonista, String categoria) {
        int idade = maratonista.getIdade();
        switch (categoria) {
            case "Pequeno":
                if (idade < 18) {
                    return 1300;
                } else {
                    return 1500;
                }
            case "Médio":
                if (idade < 18) {
                    return 2000;
                } else {
                    return 2300;
                }
            case "Avançado":
                if (idade < 18) {
                    return 0;
                } else {
                    return 2800;
                }
        }
        return 0;
    }
}
