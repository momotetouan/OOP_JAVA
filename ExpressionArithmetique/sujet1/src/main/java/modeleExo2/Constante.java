package modeleExo2;

public class Constante extends Expression{
    private double valeur;

    public Constante(double valeur) {
        this.valeur = valeur;
    }

    @Override
    double evaluer() {
        return valeur;
    }
}
