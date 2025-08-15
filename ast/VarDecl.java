package ast;

public class VarDecl {
   public String type;
   public String var;

   public VarDecl(String type, String var) {
      this.type = type;
      this.var = var;
   }

   public String toString() {
      String comando = "";
      if (type == "bool") {
         comando += type + "ean " + var;
      } else {
         comando += type + " " + var;
      }
      return comando;
   }
}