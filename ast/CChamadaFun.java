package ast;

import java.util.ArrayList;

public class CChamadaFun extends Comando {
	public int linha;
	public String fun;
	public ArrayList<Exp> args;

	public CChamadaFun(int linha, String fun, ArrayList<Exp> args) {
		this.linha = linha;
		this.fun = fun;
		this.args = args;
	}

	public String toString() {
		String comando = fun + "(";
		for (var a : args) {
			comando = a + " ";
		}
		return comando;
	}

}
