package ast;

import java.util.ArrayList;

public class Fun {
	public String nome;
	public ArrayList<ParamFormalFun> params;
	public String retorno;
	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> body;

	public Fun(String nome, ArrayList<ParamFormalFun> params, String retorno, ArrayList<VarDecl> vars,
			ArrayList<Comando> body) {
		this.nome = nome;
		this.params = params;
		this.retorno = retorno;
		this.vars = vars;
		this.body = body;
	}

	public String toString() {
		String comando = "public static " + retorno + " " + nome + "(";
		for (var par : params) {
			comando += par + ", ";
		}
		comando = comando.substring(0, comando.length() - 2);
		comando += ") {\n";
		for (var v : vars) {
			comando += v + ";\n";
		}
		for (var c : body) {
			comando += c + "\n";
		}
		return comando + "}";
	}
}
