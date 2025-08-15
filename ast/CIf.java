package ast;

import java.util.ArrayList;

public class CIf extends Comando {
	public int linha;
	public Exp exp;
	public ArrayList<Comando> bloco;

	public CIf(int linha, Exp exp, ArrayList<Comando> bloco) {
		this.linha = linha;
		this.exp = exp;
		this.bloco = bloco;
	}

	public String toString() {
		String comando = "if ( " + exp + " ) {\n";
		for (var c : bloco) {
			comando += c + "\n";
		}
		comando += "}\n";
		return comando;
	}
}
