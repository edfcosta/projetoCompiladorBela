package ast;

public class ParamFormalFun {
   public String type;
   public String var;

   public ParamFormalFun(String type, String var) {
      this.type = type;
      this.var = var;
   }

   public String toString() {
      return type + " " + var;
   }
}
