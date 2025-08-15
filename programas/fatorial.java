import java.util.Scanner;

public class fatorial {
  public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
float x;
float y;
x = sc.nextFloat();
y = fatorial (x);;
System.out.println( y );
}
public static float fatorial(float n) {
float resultado;
float i;
resultado = 1.0f;
i = 1.0f;
while (((i <  n) ||  (i ==  n))) {
resultado = (resultado *  i);
i = (i +  1.0f);
}

return resultado;
}}