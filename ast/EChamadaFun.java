package ast;

import java.util.ArrayList;

public class EChamadaFun extends Exp {
	public String fun;
	public ArrayList<Exp> args;

	public EChamadaFun(String fun, ArrayList<Exp> args) {
		this.fun = fun;
		this.args = args;
	}

	public String toString() {
		String comando = fun + " (";
		for (var a : args) {
			comando += a + ", ";
		}
		comando = comando.substring(0, comando.length() - 2);
		return comando + ");";
	}
}
