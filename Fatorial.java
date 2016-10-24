public class Fatorial{
  public static void main(String [] args){
       system.out.println(calcularFatorial(5));
  }

  public static calcularFatorial(int n){
     in resultado =1;
     for(int i = 2; i<=n; i++){
         resultado *=i;
     }
     return resultado;
  }
}