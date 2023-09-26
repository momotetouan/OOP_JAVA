package modeleExo2;

public class Operation extends Expression{

    private char operateur;
    private Expression gauche,droite;

    public Operation(Expression gauche,char operateur,Expression droite) {
        this.operateur = operateur;
        this.gauche=gauche;
        this.droite=droite;
    }

    @Override
    public double evaluer() {
        double valeur1= gauche.evaluer();
        double valeur2= droite.evaluer();
        double valeur=0;
        switch(operateur){
            case '+': return valeur1+valeur2;
            case '-': return valeur1-valeur2;
            case '/': if(valeur2==0){ return Double.POSITIVE_INFINITY;}
                return valeur1/valeur2;
            case '*': return valeur1*valeur2;
            default: return Double.NaN;

        }

    }
}
