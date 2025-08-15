package ast;

import java.util.ArrayList;

public class Prog {
    public Main main;
    public ArrayList<Fun> fun;

    public Prog(Main main, ArrayList<Fun> fun) {
        this.main = main;
        this.fun = fun;
    }

    public String toString(String nome) {
        String programa = "import java.util.Scanner;\n\n";
        programa += "public class " + nome + " {\n";
        programa += main.toString();
        programa += "}\n";
        if (fun != null) {
            for (var f : fun) {
                programa = programa + f.toString();
            }
        }
        programa = programa + "}";
        return programa;
    }
}
