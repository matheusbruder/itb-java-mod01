package praticaIntegradoraI.exercicio03.classes;

import praticaIntegradoraI.exercicio03.interfaces.Carnivoro;

public class Cachorro extends Animal implements Carnivoro {
    @Override
    public String emitirSom() {
        return "Auau";
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    @Override
    public String comerCarne() {
        return "🥩";
    }
}
