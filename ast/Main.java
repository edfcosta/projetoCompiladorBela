package ast;

import java.util.ArrayList;

public class Main {

	public ArrayList<VarDecl> vars;
	public ArrayList<Comando> coms;

	public Main(ArrayList<VarDecl> vars, ArrayList<Comando> coms) {
		this.vars = vars;
		this.coms = coms;
	}

	public String toString() {
		String comando = "  public static void main(String[] args) {\n";
		comando += "Scanner sc = new Scanner(System.in); \n";
		for (var v : vars) {
			comando = comando + v.toString() + ";\n";
		}
		for (var c : coms) {
			comando = comando + c.toString() + "\n";
		}
		return comando;
	}

}
