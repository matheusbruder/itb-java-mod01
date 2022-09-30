package model;

public abstract class Veiculo {

        private int velocidade;
        private int aceleracao;
        private double anguloGiro;
        private String placa;
        private double peso;
        private int qntdRodas;

        public Veiculo(int velocidade, int aceleracao, double anguloGiro, String placa, double peso, int qntdRodas) {
                this.velocidade = velocidade;
                this.aceleracao = aceleracao;
                this.anguloGiro = anguloGiro;
                this.placa = placa;
                this.peso = peso;
                this.qntdRodas = qntdRodas;
        }

        @Override
        public String toString() {
                return "velocidade=" + velocidade +
                        ", aceleração=" + aceleracao +
                        ", anguloGiro=" + anguloGiro +
                        ", placa='" + placa + '\'' +
                        ", peso=" + peso +
                        ", qntdRodas=" + qntdRodas;
        }

        public int getVelocidade() {
                return velocidade;
        }

        public void setVelocidade(int velocidade) {
                this.velocidade = velocidade;
        }

        public int getAceleracao() {
                return aceleracao;
        }

        public void setAceleracao(int aceleracao) {
                this.aceleracao = aceleracao;
        }

        public double getAnguloGiro() {
                return anguloGiro;
        }

        public void setAnguloGiro(double anguloGiro) {
                this.anguloGiro = anguloGiro;
        }

        public String getPlaca() {
                return placa;
        }

        public void setPlaca(String placa) {
                this.placa = placa;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public int getQntdRodas() {
                return qntdRodas;
        }

        public void setQntdRodas(int qntdRodas) {
                this.qntdRodas = qntdRodas;
        }
}
