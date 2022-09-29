package praticaIntegradoraI.exercicio03.classes;

import praticaIntegradoraI.exercicio03.interfaces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {
    @Override
    public String emitirSom() {
        return "Mu";
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    @Override
    public String comerPasto() {
        return "🥬";
    }
}
