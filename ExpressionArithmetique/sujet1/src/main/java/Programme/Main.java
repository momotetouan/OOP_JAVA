package Programme;

import modeleExo2.Constante;
import modeleExo2.Expression;
import modeleExo2.Operation;

public class Main {
    public static void main(String[] args) {

        Constante exp=new Constante(13);
        Constante exp1=new Constante(36);
        Constante exp2=new Constante(3);
        Constante exp3=new Constante(12);
        Operation exp4=new Operation(exp,'/',new Operation(new Operation(exp1,'/',exp2),'-',exp3));

        Operation s=new Operation(new Operation(new Operation(new Constante(12),'+',new Constante(13)),'+',new Operation(new Constante(25),'*',new Operation(new Constante(24),'-',new Constante(79)))),'/',new Constante(2));


        System.out.println("operation : "+exp4.evaluer());
        System.out.println("operation : "+s.evaluer());

    }
}
